import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

         /* 
        **************Basic Stuff*********************
        int x =9090629;
        float y =3.13f;
        double z =3.14;
        boolean a =true;
        char symbol ='@';
        String name ="My God is good";

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("My numbers is : "+x);
        System.out.println("The float value is: "+y);
        System.out.println("The value value is: "+z);
        System.out.println("C++ is awesome "+a);
        System.out.println(symbol); 
        System.out.println("The reason Im alive is: "+name);
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        
        */

        /* 
        **Imposible Swapping
        String x ="Water";
        String y ="Kool Aid";

        x = y;

        System.out.println("x :"+x);
        System.out.println("y :"+y);
        */
        
        /* 
        String x ="Water";
        String y ="Kool Aid";
        String temp =null;
        
        temp = x;
        x = y;
        y= temp;

        System.out.println("x :"+x);
        System.out.println("y :"+y);
        */

        //** User input**/
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Please Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Please Enter your age :");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+"Years old");
        System.out.println("You like "+food);
    }
}
