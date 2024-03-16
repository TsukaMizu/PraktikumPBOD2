//Pembuat : David Cristian Batubara & 24060122130094
package Child;

import java.util.List;
import java.util.ArrayList;

public class Course {
    //Properti
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentsEnrolled = new ArrayList<>();
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(Student student){
        studentsEnrolled.add(student);
    }
     
    public void removeStudent(Student student){
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents(){
        System.out.println("+++++ Siswa di mata kuliah: " + courseName + " +++++");
        for(Student student: studentsEnrolled){
            System.out.println("+ " + student.getNameStudent());
        }
        System.out.println("\n");
    }

    public void getDetail(){
        System.out.println("+++++ Menampilkan Course +++++");
        System.out.println("Kode Course: " + courseCode);
        System.out.println("Nama Course: " + courseName);
        System.out.println("Dosen Pengampu: " + lecture.getNameLecture());
    }
    
}
