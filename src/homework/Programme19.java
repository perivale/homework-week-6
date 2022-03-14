package homework;

            //to java scanner using for writing in a console
import java.util.Scanner;

public class Programme19 {
    public static void main(String[] args) {        //create a main method
        Scanner obj = new Scanner(System.in);       // to Scanner we can call via object
        System.out.println("Input a string:");      //print statement
        String line = obj.nextLine();
        line = line.toLowerCase();
        System.out.println(line);


    }



}
