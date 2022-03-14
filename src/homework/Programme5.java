package homework;


public class Programme5 {
        //use the parameter in method
        //instance  method
    public void addition(int a, int b) {
        //instance method
        System.out.println("addition of two number:" + (a + b));
    }
        //instance method
    public void subtraction (int a, int b) {
        System.out.println(a - b);
    }
        //static method
    public static void multiplication(int a,int b) {
        System.out.println(a * b);
    }
        //static method
    public static void division(int a,int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        Programme5 obj =new Programme5();
        obj.addition(10,30);
        obj.subtraction(30,20);
        multiplication(10,20);
        division(40,10);
    }


}
