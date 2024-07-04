package JavaFullcourse;

public class person{
    int age=21;
    int weight=70;
    String color="Light";

    void eat()
    {
        System.out.println("I am eating");
    }
    void sleep()
    {
        System.out.println("I am sleeping");
    }
    public static void main(String args[])
    {

        person P=new person();
        System.out.println(P.age);
        System.out.println(P.weight);
        System.out.println(P.color);
        P.eat();
        P.sleep();
    }
}
//////////
