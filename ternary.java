package JavaFullcourse;

public class ternary {
    public static void main(String args[])
    {
        int a=10,b=20,c=5;
       int ans= (a>b)?(a>c?a:c):(b>c?b:c);
       System.out.println(ans);
    }
    
}
///////
//output 20
