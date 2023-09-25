import java.util.Scanner;

public class PassChecker {
    public static void main(String[] args) {
        int i = 4;
        String name = "admin", password = "password";
        Scanner obj = new Scanner(System.in);

        while(i>=0){
            System.out.println("Enter username: ");
            String user_name = obj.next();
            System.out.println("Enter password");
            String user_password = obj.next();
            if(user_name.equals(name) & user_password.equals(password)) {
                System.out.println("logged in succesfully");
                break;
            }
            System.out.println("incorrect password. Number of attemps left: "+i);
            i--;
        }
    }
}
