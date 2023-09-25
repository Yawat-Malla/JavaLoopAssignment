
import java.util.Scanner;

public class ResultGenerator {
    public static void main(String[] args) {
        double marks, sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of subjects");
        double sub_num = obj.nextInt();
        for(double i=1;i<=sub_num;i++){
            System.out.println("Enter marks for subject "+ i );
            marks = obj.nextInt();
            sum += marks;
        }
        double percentage = ((sum/(sub_num*100))*100);
        System.out.println("The percentage is: " + percentage);
        if(percentage<=100 & percentage>90){
            System.out.println(("Your grade is distinction"));
        }else if(percentage<=90 & percentage>80){
            System.out.println("Your grade is first division");
        }else{
            System.out.println("Your failed. ");
        }
    }
}
