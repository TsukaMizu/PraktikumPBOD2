//Pembuat : David Cristian Batubara & 24060122130094\
package Child;

import java.util.List;
import java.util.ArrayList;

public class Lecture {
    //Properti
    private String name;
    private int age;
    private String address;
    private int lectureID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int lectureID){
        this.name = name;
        this.age = age;
        this.address = address;
        this.lectureID = lectureID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getNameLecture(){
        return name;
    }

    public void getDetail(){
        System.out.println("+++++ Menampilkan Lecture +++++");
        System.out.println("Name : "  + name);
        System.out.println("Age : "+ age);
        System.out.println("Address : " + address);
        System.out.println("Lecture ID : " + lectureID);
    }

    public void teachCourse(Course course){
        coursesTaught.add(course);
    }

    public void viewTaughtCourses(){
        System.out.println("++++++ "+ name +" Mengajar Mata Kuliah ++++++");
        for (Course course: coursesTaught){
            System.out.println("+ " + course.getCourseName());
        }
        System.out.println("\n");
    }

}
