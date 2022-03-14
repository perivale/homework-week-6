package homework;

        //for java scanner use are able to write down in console
import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {     //main method
        Scanner obj =new Scanner(System.in);       //obj create for use java scanner
        System.out.println("Enter any radius value of the circle::");       //print astatement
        double r = obj.nextDouble();
       System.out.println("Area of the circle" +(3.14*r*r));
    }

}


