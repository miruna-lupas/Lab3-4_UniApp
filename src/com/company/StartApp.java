package com.company;

import com.company.model.Course;
import com.company.model.Student;
import com.company.model.Teacher;
import com.company.repository.CourseRepository;
import com.company.repository.StudentRepository;
import com.company.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class StartApp {

    public static void main(String[] args) {
        System.out.println("UNIVERSITY REGISTRATION PLAN");
        //list of courses for students
        List<Course> coursesStudent1 = new ArrayList<Course>();
        List<Course> coursesStudent2 = new ArrayList<Course>();
        List<Course> coursesStudent3 = new ArrayList<Course>();
        //students
        Student student1 = new Student("Miruna", "Lupas", 1, 30, coursesStudent1);
        Student student2 = new Student("Monika", "Popescu", 2, 24, coursesStudent2);
        Student student3 = new Student("Andreea", "Vrabie", 3, 25, coursesStudent3);
        //list of courses for teacher
        List<Course> coursesTeacher = new ArrayList<Course>();
        //teacher
        Teacher teacher = new Teacher("Diana","Cristea",1,coursesTeacher);
        //list of students for courses
        List<Student> studentsForCourse1 = new ArrayList<Student>();
        List<Student> studentsForCourse2 = new ArrayList<Student>();
        //courses
        Course course1 = new Course("BD",teacher,15,studentsForCourse1,5,1);
        Course course2 = new Course("SDA",teacher,20,studentsForCourse2,4,2);
        //add the courses to the teacher
        coursesTeacher.add(course1);
        coursesTeacher.add(course2);
        //repo for students
        List<Student> students = new ArrayList<Student>();
        StudentRepository studRepo = new StudentRepository(students);
        studRepo.getstudentList().add(student1);
        studRepo.getstudentList().add(student2);
        studRepo.getstudentList().add(student3);
        //repo for teachers
        List<Teacher> teachers = new ArrayList<Teacher>();
        TeacherRepository teacherRepo = new TeacherRepository(teachers);
        teacherRepo.getTeacherList().add(teacher);
        //repo for courses
        List<Course> courses = new ArrayList<Course>();
        CourseRepository courseRepo = new CourseRepository(courses);
        courseRepo.getCourseList().add(course1);
        courseRepo.getCourseList().add(course2);
        MenuUniApp menu = new MenuUniApp(courseRepo,teacherRepo,studRepo);
        menu.DisplayMenu();
    }
}
