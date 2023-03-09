package demo.mvn.exmple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student obj = new Student(101, "irfan");
        System.out.println(obj.rollno+" "+obj.name);

        Teacher obj2 = new Teacher(100, "khan");
        System.out.println(obj2.no+" "+obj2.name);

    }
}
