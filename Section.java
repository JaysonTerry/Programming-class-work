package com.company;

import java.util.ArrayList;



/**
 * Created by jt4100 on 2/22/2019.
 */
public class Section {
    private String sectionName;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();

    Section(String Name) {
        this.sectionName = Name;
        this.students = new ArrayList<>();
        this.assignmentList = new ArrayList<>();

    }

    //properties:


    //name of section
    //list of students


    //Functions

    //creates a new student if username doesnt exists and adds student to student list
    //return false if username exist, return true otherwise and creates the student
    public boolean addStudent(String firstName, String lastName, String username, long phoneNumber) {
        //check if username exists
        int studentIndex = getStudentIndexByUsername(username);
        //return false if username exists
        if (studentIndex != -1) {
            return false;
        }
        //otherwise creates student, add to list, and returns true
        students.add(new Student(firstName, lastName, phoneNumber, username));
        return true;


    }
    //gets what BOX the student is in

    public int getStudentIndexByUsername(String username) {
        int i = 0;
        while (i < students.size()) {
            if (username.equals(students.get(i).getUsername())) {
                return i;
            }
            i = i + 1;
        }
        return -1;
    }



    //get students' average score for a section(as a %)
    public double getAvgScoreForSection() {

        int i = 0;
        double score = 0;
        ArrayList<Double> scores = new ArrayList<Double>();
        while (i < students.size()) {
            Student curStudent = students.get(i);
            double currentScore = curStudent.getAvgScore();
            scores.add(currentScore);
            i = i + 1;
        }
        i = 0;
        while (i < scores.size()) {
            double nextStudentScore = scores.get(i);
            score = score + nextStudentScore;
            i = i + 1;
        }
        score = score / scores.size();
        return score;
    }





    //returns score as a percentage for current section

    //gets the name of the section
    public String getSectionName() {
        String name = sectionName;
        return name;
    }

    //get all students usernames in section
    public void getSectionStudents() {
        int i = 0;
        while (i < students.size()) {
            String x = students.get(i).getUsername();
            System.out.println(x);
            i = i + 1;
        }
    }

        //get selected student by username

        public Student getCurrentStudent(String username) {
            int i = getStudentIndexByUsername(username);
            Student dummy = new Student("this is", "a dummy student", 1, "test");

            if(i == -1) {
                return dummy ;
            }

            return students.get(i);

        }

        // mark selected student tardy
    // if student is not found return false
    public boolean markTardy(String username) {
        //get student specified by username
        Student curStudent = getCurrentStudent(username);
        // if no student return false
        if(curStudent == null) {
            return false;
        }
        curStudent.markTardy();
        return true;
    }
    // mark selected student absent
    // if student is not found return false
    public boolean markAbsent(String username) {
        //get student specified by username
        Student curStudent = getCurrentStudent(username);
        // if no student return false
        if (curStudent == null) {
            return false;
        }
        curStudent.markAbsent();
        return true;
    }

    //adds assignment to section //
    public boolean addAssignmentToSection(String assignmentName, double posPoints) {
        double score = 0;
        assignmentList.add(new Assignment(assignmentName, posPoints, score));
        return true;
        }







        //adds assignment to student
    public boolean addAssignment (String username, String assignmentName, int posPoints, int score ) {
        if (students.size() == 0) {
            return false;
        }
        Student curStudent = getCurrentStudent(username);
        if (curStudent == null) {
            return false;
        }


        return curStudent.addAssignment(assignmentName, posPoints, score);
    }

        /* gets what BOX an Assignment is in by name */
        public int getAssignmentIndexByAssignmentName (String assignmentName) {
            int i = 0;
            while (i < assignmentList.size()) {
                if (assignmentName.equalsIgnoreCase(assignmentList.get(i).getAssignmentName())) {
                    return i;
                }
                i = i + 1;
            }
            return -1;
        }

        //gets assignment in list by using its box
    public Assignment getAssignmentByIndex (int assignmentIndex) {
           Assignment currentAssignment = assignmentList.get(assignmentIndex);
            return currentAssignment;

        }

    }














    //Assumptions:
    // You may assume that each student is only in one section.


