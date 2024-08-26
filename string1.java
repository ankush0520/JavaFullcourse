package JavaFullcourse;

public class string1 {
    public static void main(String args[])
    {
        String str="Ankush"; //immutable(cann't change)
        str.concat("Kumar"); // it dosen't concate
        String str2=str.concat("Kumar");  //we can change string by the use of duplica string
        System.out.println(str);
        System.out.println(str2);
/*beneft of string immutable;
 1. save memory;
 2. fast executable;*/
 }
    
}

