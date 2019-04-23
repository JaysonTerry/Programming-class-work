package com.company;

import java.util.ArrayList;

/**
 * Created by jt4100 on 2/25/2019.
 */
public class Assignment {
    //properties
    private String assignmentName;
    private double posPoints;
    private double score;


    Assignment (String Name, double points, double Score) {
        this.assignmentName = Name;
        this.posPoints = points;
        this.score = Score;
    }
    //name of assignment
    //points possible on assignment
    //student score on assignment

    //functions
    //creates assignment(name, points possible, score)
    //assigns assignment to student

    //get assignment name
    public String getAssignmentName() {
        String name = assignmentName;
        return name;
    }

    //get possible points
    public double getPossiblePoints() {
        double points = posPoints;
        return points;
    }

    //gets score on the assignment

    public double getScore() {
        double scoreOnAssignment = score;
        return score;
    }

    public void setScore(double newScore) {
        score = newScore;
        return;

    }



}
