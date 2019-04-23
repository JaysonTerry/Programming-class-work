package com.company;
import java.util.ArrayList;

/**
 * Created by jt4100 on 2/22/2019.
 */
public class Student {
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String username;
    public ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
    private int tardyCount;
    private int absentCount;
    //creates a student(needs a firstname, lastname, phonenumber, username, assignment list, tardy count, absent count)
    Student(String name1, String name2, long phoneNum, String Username) {
        this.firstName = name1;
        this.lastName = name2;
        this.phoneNumber = phoneNum;
        this.username = Username;
        this.assignmentList = new ArrayList<Assignment>();
        this.tardyCount = 0;
        this.absentCount = 0;
    }







    //adds an assignment to a student
    public boolean addAssignment(String assignmentName, double posPoints, double score) {
        //check if assignment name exists
        int assignmentIndex = getAssignmentIndexByName(assignmentName);
        //return false if username exists
        if (assignmentIndex != -1) {
            return false;
        }
        //otherwise creates student, add to list, and returns true
        assignmentList.add(new Assignment(assignmentName, posPoints, score));
        return true;



}
    public int getAssignmentIndexByName(String assignmentName) {
        int i = 0;
        while (i < assignmentList.size()) {
            if (assignmentName.equalsIgnoreCase(assignmentList.get(i).getAssignmentName())) {
                return i;
            }
            i = i + 1;
        }
        return -1;
    }



    public String getAssignmentNameInList(String assignmentName) {
        int i = 0;
        String name;
        while (i < assignmentList.size()) {
            if (assignmentName.equalsIgnoreCase(assignmentList.get(i).getAssignmentName())) {
                name = assignmentList.get(i).getAssignmentName();

                return name;
            }
            i = i + 1;
        }
        System.out.print("No assignments found");
        return "No assignments found";
    }




    //returns score as a % for student in current section
    public double getAvgScore() {
      int  i = 0;
      double score = 0;
      while (i< assignmentList.size()) {
          double nextAssignmentScore = assignmentList.get(i).getScore();
          score = score + nextAssignmentScore;
          i = i + 1;
      }
        score = score/assignmentList.size();
      return score;

      }

  /* }

mark selected student tardy*/
    //adds 1 the students absent count

    public void markTardy() {
        tardyCount = tardyCount + 1;
    }

    public void markAbsent() {
        absentCount = absentCount + 1;
    }








    //get student's username
     public String getUsername() {
         String name = username;
         return name;
     }

     //get tardy count
    public int getTardyCount() {
         int tardy = tardyCount;
         return tardy;
    }

    //get absent count
    public int getAbsentCount() {
         int absent = absentCount;
         return absent;
    }
    }






