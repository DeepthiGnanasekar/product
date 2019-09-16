package validator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.UserDetails;

public class UserValidator {
	 

public void registerValidator(UserDetails details) throws Exception
{
	String name = details.getName();
	String password = details.getSetPassword();
	
	/** name validation **/
	
	if(name == null || "".equals(name.trim()))
	{
		throw new Exception("Invalid Name!");
	}
	validateName(name);
	/** Password validation **/
	if(password == null || "".equals(password.trim()))
	{
		throw new Exception("Invalid SetPassword!");
	}
	validCheck(name,password);
}

/**  Login validation **/
public void loginValidator(UserDetails details) throws Exception
{
	String name = details.getName();
	String password = details.getSetPassword();
	
	/** name validation **/
	
	if(name == null || "".equals(name.trim()))
	{
		throw new Exception("Invalid Name!");
	}
	validateName(name);
	/** Password validation **/
	if(password == null || "".equals(password.trim()))
	{
		throw new Exception("Invalid SetPassword!");
	}
	validCheck(name,password);

}

public  void validCheck(String name, String password) throws Exception
{
        if (password.length() > 7 || password.length() < 8)
        {
                throw new Exception("Password should be less than 8 characters");
        }
        if (password.indexOf(name) > -1)
        {
                throw new Exception("Password Should not be same as user name");
        }
        String upperCaseChars = "(.[A-Z].)";
        if (!password.matches(upperCaseChars ))
        {
                throw new Exception("Password should contain atleast one upper case alphabet");
        }
        String lowerCaseChars = "(.[a-z].)";
        if (!password.matches(lowerCaseChars ))
        {
                throw new Exception("Password should contain atleast one lower case alphabet");
        }
        String numbers = "(.[0-9].)";
        if (!password.matches(numbers ))
        {
                throw new Exception("Password should contain atleast one number.");
        }
        String specialChars = "(.[,~,!,@,#,$,%,^,&,,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!password.matches(specialChars ))
        {
                throw new Exception("Password should contain atleast one special character");
        }

}

public void validateName(String name) {

    String regx = "[a-zA-Z]+\\.?";
    String status = null;
    boolean loop = true;
    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
    Scanner scan = new Scanner(System.in);
    do {
        if (status != null && !status.equals("")) {
            System.out.println("Enter your Name:");
            name = scan.next();
        }
    Matcher matcher = pattern.matcher(name);
    if (!matcher.matches()) {
        System.out.println("Name is not specified in its correct way...please enter Valid details...!!! ");
        status = scan.next();
    } else {
        loop = false;
    }
    pattern = Pattern.compile(regx);
} while (loop);
}
}