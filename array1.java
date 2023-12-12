package JavaFullcourse;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
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
        Arrays.sort(a);
        System.out.println("Sorted Array Elemets:");
        for(int b:a)//for-each loop
        {
            System.out.print(b+" ");
        }
        s.close();
    }
}
////////////
