package homework;
//to use java.uti.scanner for write in console
import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {        //to call in java scanner in main method
        Scanner obj =new Scanner(System.in);                //this is the obj syntax
        System.out.print("Input a degree in fahrenheit::::");    //in print statement
        double fahrenheit =obj.nextDouble();
        double celsius =((5*(fahrenheit -32.0))/9.0);
        System.out.println(fahrenheit + " degree fahrenheit is equal to" +celsius +"in celsius");


    }
}
