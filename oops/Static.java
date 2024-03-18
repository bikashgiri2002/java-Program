package oops;

public class Static {

    public static void main(String[] args) {
        Student s= new Student();
        s.name="jinu";
        s.roll=6786;
        s.schoolName="usbm";
        Student s2=new Student();
        System.out.println(s.schoolName);
        System.out.println(s2.schoolName);

    }
}
class Student{
    String name;
    int roll;
    static String schoolName;
}
