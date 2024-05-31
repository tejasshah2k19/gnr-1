import java.util.Scanner;

public class CustomException {
    public static void main(String[] args)throws InvalidEmailException {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter email");
        String email = scr.next();

        // //login
        // try{

        // Gmail g = new Gmail();
        // g.login(email);
        // }catch(InvalidEmailException e){
        // System.out.println(e.getMessage());
        // System.out.println(e.getLocalizedMessage());
        // System.out.println("Please Enter valid gmail address");
        // }

        // login

        Gmail g = new Gmail();
        g.login(email);

    }
}

class Gmail {
    void login(String email) throws InvalidEmailException {
        if (!email.contains("@gmail.com")) {
            // throw exception
            throw new InvalidEmailException();
        }
    }
}

// Exception -> checked->
// RuntimeException -> unchecked
class InvalidEmailException extends Exception {
    InvalidEmailException() {
        // super("Invalid Email");
    }
}