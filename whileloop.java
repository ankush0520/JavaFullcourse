package JavaFullcourse;

import java.util.Scanner;

public class whileloop {
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter any number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>=0)
        {
            if(num%2==0){
                System.out.println("Even Number");
                break;

            }
            else{
                      System.out.println("Odd number");
                      break;
            }
        }
        System.out.println("While loop ended.......");
         s.close();
    }
   
}
///////////////////
