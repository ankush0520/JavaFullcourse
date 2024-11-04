package JavaFullcourse;

public class stringclass {
    public static void main(String args[])
    {
        String str="Ankush Kumar";
        String str1=new String("Ankush Kumar");
        int l=str.length();//for finding length of string
        System.out.println(l);
        System.out.println(str.toUpperCase()); // convert all letter to upper case
        System.out.println(str.toLowerCase()); // convert all letter to lower case
        if(str==str1)
        {
           System.out.println("Both are equals");
        }
        else
        {
          System.out.println("Not Equals");
        }
        if(str.equals(str1))
        {
            System.out.println("Equals");
        }
    }
    
}
//////////////
