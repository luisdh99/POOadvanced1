package com.generation.services;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.generation.models.Course;
import com.generation.models.Student;

public class StudentService
{
    HashMap<String, Course> courseList = new HashMap<>();

    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    
    public void addStudent(String name, String id, int age) {
    	
    	students.put(id, new Student(name, id, age)); 
    }
    
    
    public void enrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
        }
        coursesEnrolledByStudents.get( studentID ).add( course );
    }

    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){
        studentService.students.put( "1030", new Student( "Carlos", "1030", 31 ) );
        studentService.students.put( "1040", new Student( "Ian", "1020", 28 ) );
        studentService.students.put( "1050", new Student( "Elise", "1020", 26 ) );
        studentService.students.put( "1020", new Student( "Santiago", "1020", 33 ) );
    }


    public void showAllCourses(){

    }


	public void addStudent(String id, Student student) {
		students.put(student.getId(), student);
		
	}
}
