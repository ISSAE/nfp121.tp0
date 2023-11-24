
/**
 * Description of class Student here.
 *
 * @author Ali.z
 * @version 24/11/2023
 */
public class Student
{
    // instance variables
    private String name;
    private String email;
    private double age;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name,String email,double age)
    {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    /**
     * toString()
     * @return    string a description about student
     */
    @Override
    public String toString(){
        return "Student{name: "+ this.name + ", email: "+this.email+", age: "+this.age+"}";
    }
}
