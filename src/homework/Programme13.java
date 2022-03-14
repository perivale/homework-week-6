package homework;
            //to use java scanner to write in a console
import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {            //creating a main method
        Scanner obj = new Scanner(System.in);           //to call scanner via object
        System.out.print("Input the first number::");   //print a statement
        double a = obj.nextDouble();
        System.out.print("Input the second number::");  //print a statement
        double b = obj.nextDouble();
        System.out.print("Input the third number::");      //print a statement
        double c = obj.nextDouble();
        System.out.print("The average value is::" + average(a, b, c) + "\n");  //to print a statement

    }
    public static double average (double a,double b,double c){

        return (a+b+c)/3;
    }
}

