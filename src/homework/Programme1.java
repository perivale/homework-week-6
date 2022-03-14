package homework;

public class Programme1 {
    //instance variable
    int a = 100;
    String  name = "hello";//instance variable


                //instance method call always direct bcz is no static keyword in methods
        public void test(){
            System.out.println("call method test1"); //i.v come direct to in.method
            System.out.println(a);
            System.out.println(name);
        }
                //instance method call always direct bcz is no static keyword in method
         public void test2(){
            System.out.println("call method test2");  //i.v come direct to in.method
            System.out.println(a);
            System.out.println(name);
    }
                //main method and call both method  to in main method
            public static void main (String [] args){
                Programme1 obj2 =new Programme1();//object creating
                obj2.test();
                obj2.test2();



            }


    }



