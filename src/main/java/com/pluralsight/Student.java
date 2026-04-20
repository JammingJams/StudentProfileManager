package com.pluralsight;

import java.security.PublicKey;
import java.util.Scanner;

public class Student {

    Scanner sc = new Scanner(System.in);
    private String name;
    private int studentID;
    private double gpa;
    private boolean isEnrolled;

    public Student() {
        // Initializers HERE!
        this.name = "";
        this.studentID = 0;
        this.gpa = 0;
        this.isEnrolled = true;

    }

    // Getters are here!
    public String getName(String name) {return this.name; }
    public int getStudentID(int studentID) {return this.studentID; }
    public double getGpa(double gpa) {return this.gpa; }
    public boolean getIsEnrolled(boolean isEnrolled) {return this.isEnrolled; }

    // Setters are here!
    public void setName(String name) { this.name = name; }
    public void setEnrolled(boolean enrolled) {isEnrolled = enrolled;}
    public void setGpa(double gpa) {this.gpa = gpa;}
    public void setStudentID(int studentID) {this.studentID = studentID;}

    //Checks to see if the student is enrolled
    public void isStudentEnrolled(boolean isEnrolled) {
        if (isEnrolled == true) System.out.println("Student is enrolled");
        else System.out.println("Student is not enrolled!");
    }

    public boolean isWithdraw() {
        return true;
    }
    // Gives Student +1 to their gpa if student has extra credit
    public double updatedgpa(boolean studentExtraCredit, double gpa) {
        if (studentExtraCredit == true) {
            if (gpa > 4) return this.gpa = 5;
            else return this.gpa += 1;
        }
        else return this.gpa;
    }
    // This add courses!
    public String addCourse(String[] studentCourses) {
        while (true) {
            System.out.println("What course would you like to add?");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case (1) -> { return studentCourses[0] = "Science";}
                case (2) -> { return studentCourses[1] = "Math"; }
                case (3) -> { return studentCourses[2] = "Art"; }
            }
        }
    }
    //This removes courses!
    public String removeCourse(String[] studentCourses) {
        while (true) {
            System.out.println("What course would you remove to add?");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case (1) -> { return studentCourses[0] = "";}
                case (2) -> { return studentCourses[1] = ""; }
                case (3) -> { return studentCourses[2] = ""; }
            }
        }
    }



}
