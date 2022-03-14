package homework;

public class Programme2 {
    //declare static variable
    //static variables are declared inside class but outside of the main method
    static int a =20;
    static int z =40;

    //create static method

    public static void method1(){
        System.out.println("call static method");
        System.out.println(a);
        System.out.println(z);

    }
    //same keyword static and same static method no need to call object.
        public static void main(String[] args) {
        method1();

    }

}
