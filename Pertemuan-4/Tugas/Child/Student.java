//Pembuat : David Cristian Batubara & 24060122130094
package Child;

import java.util.List;
import java.util.ArrayList;

public class Student {
    //Properti
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> courseEnrolled;

    //Metode
    public Student(String name, int age, String address, int studentID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.courseEnrolled = new ArrayList<>();
    }

    public String getNameStudent(){
        return name;
    }

    public void getDetail(){
        System.out.println("+++++ Menampilkan Data Student +++++");
        System.out.println("Name : "  + name);
        System.out.println("Age : "+ age);
        System.out.println("Address : " + address);
        System.out.println("Student ID = " +studentID);

    }

    public void enrollnCourse(Course course){
        courseEnrolled.add(course);
    }

    public void viewEnrolledCourses(){
        System.out.println("+++++ Menampilkan Course yang diambil " + name +" +++++");
        for (Course course :  courseEnrolled){
            System.out.println("+ " + course.getCourseName());
        }
        System.out.println("\n");

    }
    
}
