package homework;

public class Programme4 {
    //create the static variable
    static String name ="10";
    static String lastname ="20";
    //create the instant variable
    int x=40;
    int y=50;

    //creating the instant method and call all variables
    public void test() {
        System.out.println(name);     //s.v
        System.out.println(lastname); //s.v
        System.out.println(x);       //i.v
        System.out.println(y);       //i.v
    }
    //creating the static method and call all variables
    //and instance variable is called via obj.
     public static void method() {
         System.out.println(name);
         System.out.println(lastname);
         Programme4 obj = new Programme4();
         System.out.println(obj.x);
         System.out.println(obj.y);
     }

     //and we call both method to in the main method
         public static void main(String[] args) {
             Programme4 obj = new Programme4();
             obj.method();
             method();

         }






    }




