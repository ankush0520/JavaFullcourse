package JavaFullcourse;

import java.util.Scanner;

public class array {
    public static void main(String args[])
    {
        //int a[]={10,20,30,40,50};   //a[5];
        int a[]=new int[5];
        System.out.println("Enter array elemets:");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Array Elemets:");
        for(int b:a)//for-each loop
        {
            System.out.println(b+" ");
        }
        s.close();
    }
}
/////////

