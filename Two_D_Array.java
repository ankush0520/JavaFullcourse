package JavaFullcourse;

import java.util.Scanner;

public class Two_D_Array {
    public static void main(String args[])
    {
        //int a[]={10,20,30,40,50};   //a[5];
        int a[][]=new int[5][5];
        System.out.println("Enter array elemets:");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            a[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix Elemets:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
    
}
///////////
