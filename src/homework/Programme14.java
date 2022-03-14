package homework;
        //to create a main method
public class Programme14 {
    public static void main(String[] args) {  //main mathod
        double height = 8.5;                  //variable
        double width =5.5;                     //variable

        double perimeter =2*(height +width);    //to use perimeter

        double area = width*height;
                                                //to print statment
        System.out.printf("perimeter is 2*(%.1f + %.1f) =%.2f \n",height,width,perimeter);

                                                //to print statment
        System.out.printf("Area is %.1f* %.1f = %.2f\n",width,height,area);
    }

}
