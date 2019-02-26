package com.company;

public class Main {

    public static void main(String[] args) {
        Student TestStudent = new Student();
        TestStudent.SetTestStudent();
        TestStudent.printGrade(TestStudent.GetGrade());

        Student DavidBaker = new Student();
        DavidBaker.SetContentGrade(50);
        DavidBaker.SetParticiption(90);
        DavidBaker.SetWorkHabitGrade(70);
        DavidBaker.printGrade(DavidBaker.GetGrade());

        Student Null = new Student();
        Null.printGrade(Null.GetGrade());
    }
}
