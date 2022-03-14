package homework;
                //to use java scanner to write in a console
import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {            //main method
        Scanner obj = new Scanner(System.in);           // creating a java scanner via object
        System.out.println("Input the number: ");
        int num1 = obj.nextInt();                       //java scanner syntax
        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + "*" + i + "=" + (num1 * i));  //to print statement


        }
    }
}
