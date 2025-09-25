
import java.util.Scanner;
//Printing the factorial of a given number
public class FactorialQuestion{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial of: ");
        int factorial_number=input.nextInt();
        int factorial=1;

        for(int i=1;i<=factorial_number;i++){factorial*=i;}
        System.out.println("The factorial of the number "+ factorial_number
                + " is "+ factorial);

    }
}
