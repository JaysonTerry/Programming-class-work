package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String menuChoice;
        boolean assignmentAssigned = false;
        boolean firstSection = true;
        while (true) {
            System.out.println("Type one of the following commands:");
            System.out.println("change section");
            System.out.println("add section");
            System.out.println("add student");
            System.out.println("add assignment to student");
            System.out.println("add assignment to section");
            System.out.println("set score");
            System.out.println("mark tardy");
            System.out.println("mark absent");
            System.out.println("get overall score");
            System.out.println("get overall score avg");
            System.out.println("get assignment score");
            System.out.println("get assignment score avg");
            System.out.println("get tardy count");
            System.out.println("get absent count");
            menuChoice = console.nextLine();


            if (menuChoice.equals("add section")) {
                System.out.println("Enter new section name");
                String newSectionName = console.nextLine();
                if (firstSection == true) {
                    Gradebook Gradebook = new Gradebook(newSectionName);
                    Gradebook.addSection(newSectionName);
                    System.out.println("Section " + newSectionName + " was created");
                    firstSection = false;
                } else if (firstSection == false) {
                    boolean sectionAdded = Gradebook.addSection(newSectionName);
                    if (sectionAdded == true) {
                        System.out.println("Section " + newSectionName + " was created");
                    } else {
                        System.out.println("Section cannot be created");
                    }

                }

            }
            if (menuChoice.equals("change section")) {
                if (firstSection == false) {
                    System.out.println("Enter new section name");
                    String newSectionName = console.nextLine();
                    Gradebook.changeSection(newSectionName);
                } else {
                    System.out.println("No sections have been made");
                }
            }

            if (menuChoice.equals("add student")) {
                if (firstSection == false) {
                    System.out.println("Enter student's first name");
                    String studentFirstName = console.nextLine();

                    System.out.println("Enter student's last name");
                    String studentLastName = console.nextLine();
                    long phoneNumber = 0;

                    System.out.println("Enter student's phone number");
                    while (true) {
                        try {
                            phoneNumber = Integer.parseInt(console.nextLine());
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("Not a valid number. Try Again.");
                            continue;
                        }
                    }

                    System.out.println("Enter username");
                    String username = console.nextLine();

                    Section curSection = Gradebook.getCurrentSection();

                    curSection.addStudent(studentFirstName, studentLastName, username, phoneNumber);
                    System.out.println("student has been added");
                } else {
                    System.out.println("No sections have been made");
                }


            }

            if (menuChoice.equals("add assignment to student")) {
                if (firstSection == false) {
                    System.out.println("Enter student username");
                    Section curSection = Gradebook.getCurrentSection();
                    String studentUsername = console.nextLine();
                    Student currentStudent = curSection.getCurrentStudent(studentUsername);
                    String studentCheck = currentStudent.getUsername();

                    if (studentCheck.equals("test")) {
                        System.out.println("Student under that username doesn't exist");
                    } else {
                        System.out.println("Enter assignment name to add to student");
                        String assignmentName = console.nextLine();
                        int i = curSection.getAssignmentIndexByAssignmentName(assignmentName);
                        double posPoints = 0;
                        if (i == -1) {

                            System.out.println("Enter max possible points on assignment");
                            posPoints = 0;
                            while (true) {
                                try {
                                    posPoints = Double.parseDouble(console.nextLine());
                                    break;
                                } catch (NumberFormatException ex) {
                                    System.out.println("Input Not a Number");
                                    continue;
                                }
                            }

                        }


                        System.out.println("Enter student's score on assignment");
                        double score = 0;
                        while (true) {
                            try {
                                score = Double.parseDouble(console.nextLine());
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("Input Not a Number");
                                continue;
                            }
                        }


                        if (i != -1) {
                            Assignment currentAssignment = curSection.getAssignmentByIndex(i);
                            posPoints = currentAssignment.getPossiblePoints();
                        }

                        currentStudent.addAssignment(assignmentName, posPoints, score);
                        System.out.println("Assignment: " + assignmentName + " has been added with a max score of " + posPoints + " and student score of " + score + ".");
                        assignmentAssigned = true;
                    }


                } else {
                    System.out.println("No Sections have been created");
                }
            }


            if (menuChoice.equals("add assignment to section")) {
                if (firstSection == false) {
                    System.out.println("Enter assignment name to add to current section");
                    String assignmentName = console.nextLine();
                    String curSectionName = Gradebook.getCurrentSection().getSectionName();

                    System.out.println("Enter max possible points on assignment");
                    double posPoints = 0;
                    while (true) {
                        try {
                            posPoints = Double.parseDouble(console.nextLine());
                            break;
                        } catch (NumberFormatException ex) {
                            System.out.println("Input Not a Number");
                            continue;
                        }
                    }
                    Gradebook.addAssignmentToSection(assignmentName, posPoints);

                    System.out.println("Assignment: " + assignmentName + " was added with a max possible score of " + posPoints + " in " + curSectionName);

                } else {
                    System.out.println("No sections have been created");
                }
            }


          if (menuChoice.equals("set score")) {
                if (firstSection == false) {

                System.out.println("Enter student username");
                Section curSection = Gradebook.getCurrentSection();
                String studentUsername = console.nextLine();
                Student currentStudent = curSection.getCurrentStudent(studentUsername);
                String studentCheck = currentStudent.getUsername();

                if (studentCheck.equals("test")) {
                    System.out.println("Student under that username doesn't exist");
                } else {
                    System.out.println("Enter assignment name");
                    String assignmentName = console.nextLine();
                    int assignmentIndex = currentStudent.getAssignmentIndexByName(assignmentName);
                    if (assignmentIndex == -1) {
                        System.out.println("There is no assignment under that name");
                    }
                    if (assignmentIndex != -1) {
                        Assignment currentAssignment = currentStudent.assignmentList.get(assignmentIndex);
                        System.out.println("Enter new assignment score");
                        double newScore = 0;
                        while (true) {
                            try {
                                newScore = Double.parseDouble(console.nextLine());
                                break;
                            } catch (NumberFormatException ex) {
                                System.out.println("Input Not a Number");
                                continue;
                            }
                        }
                        currentAssignment.setScore(newScore);
                        double score = currentAssignment.getScore();
                        System.out.println(assignmentName + " now has a new score of " + score);
                    }


                    }
                }
                else {
                    System.out.println("No sections have been created");
                }
            }




            if (menuChoice.equals("mark tardy")) {
                if (firstSection == false) {
                    System.out.println("Enter student username");
                    Section curSection = Gradebook.getCurrentSection();
                    String studentUsername = console.nextLine();
                    Student currentStudent = curSection.getCurrentStudent(studentUsername);
                    String studentCheck = currentStudent.getUsername();

                    if (studentCheck.equals("test")) {
                        System.out.println("Student under that username doesn't exist");
                    } else {
                        currentStudent.markTardy();
                        System.out.println("student had been marked tardy");
                    }
                } else {
                    System.out.println("No sections have been created");
                }
            }


            if (menuChoice.equals("mark absent")) {
                if (firstSection == false) {
                    System.out.println("Enter student username");
                    Section curSection = Gradebook.getCurrentSection();
                    String studentUsername = console.nextLine();
                    Student currentStudent = curSection.getCurrentStudent(studentUsername);
                    String studentCheck = currentStudent.getUsername();

                    if (studentCheck.equals("test")) {
                        System.out.println("Student under that username doesn't exist");
                    } else {
                        currentStudent.markAbsent();
                        System.out.println("student had been marked absent");
                    }

                } else {
                    System.out.println("No sections have been created");
                }
            }


            if (menuChoice.equals("get overall score")) {
                Student currentStudent;
                String studentUsername;
                if (firstSection == false) {
                    System.out.println("Enter student username");
                    Section curSection = Gradebook.getCurrentSection();
                    studentUsername = console.nextLine();
                    currentStudent = curSection.getCurrentStudent(studentUsername);
                    String studentCheck = currentStudent.getUsername();

                    if (studentCheck.equals("test")) {
                        System.out.println("Student under that username doesn't exist");
                    } else {
                        double avgScore = currentStudent.getAvgScore();
                        System.out.println(studentUsername + " has a average score of " + avgScore + ".");
                    }
                } else {
                    System.out.println("No sections have been created");
                }
            }


                if (menuChoice.equals("get overall score avg")) {
                    if (firstSection == false) {
                        Section curSection = Gradebook.getCurrentSection();

                        double avgOverallScore = curSection.getAvgScoreForSection();
                        System.out.println("The average score for " + curSection + " is " + avgOverallScore);
                    } else {
                        System.out.println("No sections have been created");
                    }
                }

                if (menuChoice.equals("get assignment score")) {
                    Student currentStudent;
                    String studentUsername;
                    if (firstSection == false) {
                        System.out.println("Enter student username");
                        Section curSection = Gradebook.getCurrentSection();
                        studentUsername = console.nextLine();
                        currentStudent = curSection.getCurrentStudent(studentUsername);
                        String studentCheck = currentStudent.getUsername();

                        if (studentCheck.equals("test")) {
                            System.out.println("Student under that username doesn't exist");
                        } else {

                        }
                    }
                }


                if (menuChoice.equals("get tardy count")) {
                    if (firstSection == false) {
                        System.out.println("Enter student username");
                        Section curSection = Gradebook.getCurrentSection();
                        String studentUsername = console.nextLine();
                        Student currentStudent = curSection.getCurrentStudent(studentUsername);
                        String studentCheck = currentStudent.getUsername();

                        if (studentCheck.equals("test")) {
                            System.out.println("Student under that username doesn't exist");
                        } else {
                            int tardyCount = currentStudent.getTardyCount();
                            System.out.println(studentUsername + " has been tardy " + tardyCount + " times.");
                        }

                    }
                    else {
                        System.out.println("No sections have been created");
                    }
                }
                if (menuChoice.equals("get absent count")) {
                    if (firstSection == false) {
                        System.out.println("Enter student username");
                        Section curSection = Gradebook.getCurrentSection();
                        String studentUsername = console.nextLine();
                        Student currentStudent = curSection.getCurrentStudent(studentUsername);
                        String studentCheck = currentStudent.getUsername();

                        if (studentCheck.equals("test")) {
                            System.out.println("Student under that username doesn't exist");
                        } else {
                            int absentCount = currentStudent.getAbsentCount();
                            System.out.println(studentUsername + " has been absent " + absentCount + " times.");
                        }

                    }
                    else {
                        System.out.println("No sections have been created");
                    }
                }

                }


        }
    }

















