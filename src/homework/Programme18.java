package homework;

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {   //create main method
        Scanner obj = new Scanner(System.in);   //if useing java scanner then we call vis object
                //print statement
        System.out.print("Input first number::");
        int num1 = obj.nextInt();
                //print statement
        System.out.print("Input second number::");
        int num2 = obj.nextInt();

        System.out.println(num1 +" + "+num2 +"="+(num1 + num2));    //this all print statement
        System.out.println(num1 +" - " +num2 +"="+(num1 - num2));
        System.out.println(num1 + " * " +num2 +"="+(num1 * num2));
        System.out.println(num1 + "/ " +num2 +"="+(num1 / num2));
        System.out.println(num1 + " mod "+num2 +"="+(num1 % num2));




    }
}
