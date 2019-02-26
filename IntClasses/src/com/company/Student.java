package com.company;

/**
 * Created by jt4100 on 2/14/2019.
 */
public class Student {
    int studentID;
    String name;
    double contentGrade;
   double workHabitGrade;
   double participation;
   int age;

  public void StudentInfo(String Name, int ID, int Age) {
      Name = name;
      ID = studentID;
      Age = age;
      contentGrade = 0;
      workHabitGrade = 0;
      participation = 0;
  }



   public void SetTestStudent()   {
       name = "TestStudent";
       studentID = -1;
       contentGrade = 0;
       workHabitGrade = 0;
       participation = 0;
       age = 18;
   }
   void SetContentGrade(int grade) {
       contentGrade = grade;
   }
   void SetWorkHabitGrade(int grade) {
       workHabitGrade = grade;
   }
   void SetParticiption(int grade) {
       participation = grade;
   }
   double GetGrade() {
      double grade = (0.35 * workHabitGrade) + (0.4 * contentGrade) + (0.25 * participation);
      return grade;
   }
   void printGrade(double grade) {
       System.out.println("Your grade is: " + grade);

   }
}
