package homework;

public class Programme3 {
    //creating the instance variables and static variables

    //instance variable
    boolean d =false;
    // static variable
    static String name =  "50";

          //instance method
    public void  method() {
        System.out.println(d);
        System.out.println(name);
    }

         //static method
     public static void method1() {
            Programme3 obj1 = new Programme3(); //call via object
            System.out.println(obj1.d);
            System.out.println(name);
        }
         //call both method in main methods(instance and static)
     public static void main(String [] args){
         Programme3 obj = new Programme3();
         obj.method();
         method1();




        }









    }






