package homework;

import java.util.Scanner;
                                //to create a main method
public class Programme16 {
    public static void main(String[] args) {
        //java scanner to call in main method creating a object
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first binary num:");    //print statement
        String x = sc.next();
        System.out.print("enter second binary num:");   //print statement
        String y = sc.next();

        int n1 = Integer.parseInt(x,2);
        int n2 = Integer.parseInt(y,2);
        int n3 = n1 + n2;


         //this is print statement and after that write in console
        System.out.println("some of binary number ;" + Integer.toBinaryString(n3));
    }
}

