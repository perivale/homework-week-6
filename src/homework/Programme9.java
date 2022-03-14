package homework;
//use java scanner to writing in a console

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {             //main method
        Scanner obj = new Scanner(System.in);            //java scanner object to call in main method
        System.out.println("Enter my name  ");           //we are able to see on console
        String line = obj.nextLine();
        System.out.println(line.toLowerCase());
    }

}






