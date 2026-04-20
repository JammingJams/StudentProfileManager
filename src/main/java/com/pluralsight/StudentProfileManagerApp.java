package com.pluralsight;

import java.util.Scanner;

public class StudentProfileManagerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student james = new Student();

        james.setName("James");
        james.setStudentID(8721);
        james.setGpa(4.5);
        james.setEnrolled(true);


        String[] studentCourses = {"Science", "Math", "Art"};
        boolean studentExtraCredit = true;
        String studentAddCourse = studentCourses[1];


        james.isStudentEnrolled(james.getIsEnrolled(true));
        james.updatedgpa(studentExtraCredit, james.getGpa(0));
        james.addCourse(studentCourses);

        System.out.println(studentCourses[2]);

        System.out.println(james.getGpa(0));


    }
}
