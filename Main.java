package com.generation;

import com.generation.models.Student;
import com.generation.services.StudentService;
import com.generation.services.CourseNotFoundException;
import com.generation.services.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent("1030", new Student("Carlos", "1030", 31));
        studentService.addStudent( "1040", new Student( "Ian", "1020", 28 ) );
        studentService.addStudent( "1050", new Student( "Elise", "1020", 26 ) );
        studentService.addStudent( "1020", new Student( "Santiago", "1020", 33 ) );


        studentService.enrollStudents( "Math", "1030" );
    }
}
