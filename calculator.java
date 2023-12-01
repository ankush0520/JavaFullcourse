package JavaFullcourse;

import java.util.Scanner;

public class calculator {
    public static void main(String args[])
    {
        int a,b,c,ch;
        System.out.println("1.Add");
        System.out.println("2.Substraction");
        System.out.println("3.Multilply");
        System.out.println("4.Division");
        System.out.println("5.Remainder");
        Scanner  obj=new Scanner(System.in);
        System.out.println("Enter any two numbers");
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Enter Your Choice");
        ch=obj.nextInt();
        switch(ch){
            case 1:c=a+b;
                  System.out.println("addition=" +c);
                  break;
            case 2:c=a-b;
                  System.out.println("substraction="+c); 
                  break;
            case 3:c=a*b;
                  System.out.println("Multiply=" +c); 
                  break;      
            case 4:c=a/b;
                  System.out.println("Division=" +c); 
                  break; 
            case 5:c=a%b;
                  System.out.println("Remainder=" +c); 
                  break;      
            default:
                  System.out.println("Invalid Choice"); 
                        
             
        }

             obj.close();
    }
    
}
//Noraml Calculator//
