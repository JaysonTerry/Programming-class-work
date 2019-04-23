package com.company;

import java.util.ArrayList;

/**
 * Created by jt4100 on 2/22/2019.
 */
public class Gradebook {
    private static ArrayList<Section> sections = new ArrayList<Section>();
    private static String currentSection;

     Gradebook(String currentsection) {
        this.sections = new ArrayList<Section>();
        this.currentSection = currentsection;

    }
    //properties
    //list/array of sections
    //v keep track of current section v


    //sections need a name for identification

    //each section need a different set of students

    //keep track of all assignments assigned to each student

    //changes current section/fails if theres no section with that name
    public static void changeSection(String sectionName) {

        int i = 0;
        while (i < sections.size()) {
            if (sections.get(i).getSectionName().equals(sectionName)) {
                currentSection = sectionName;
                System.out.println("section change successful");
                break;
            }
            i = i + 1;
        }
        if (!currentSection.equals(sectionName)) {
            System.out.println("No section with that name was found.");
        }

    }

//creates a new section if there are not already 6 sections and sectionName isnt already used

    public static boolean addSection(String sectionName) {
        if (sections.size() == 6) {
            return false;
        }
        int sectionIndex = getSectionIndexBySectionName(sectionName);

        if (sectionIndex != -1) {
            return false;
        }

        Section filler = new Section(sectionName);
        sections.add(filler);
        currentSection = sectionName;
        return true;
    }



    //keep track of assignment:
    //-possible points
    //-name
    //-student's score

    //track number of days student has been absent or tardy


    //adds 1 to the students tardy count
    public boolean markTardy(String username) {
            if (sections.size() == 0) {
                return false;
            }
            Section curSection = getCurrentSection();
            if(currentSection == null) {
                return false;
            }

            return curSection.markTardy(username);
        }
        //makes student specified by username tardy
    // if no student is found return false, otherwise true


    //adds 1 to students absent count
    public boolean markAbsent(String username) {
        if (sections.size() == 0) {
            return false;
        }
        Section curSection = getCurrentSection();
        if(currentSection == null) {
            return false;
        }

        return curSection.markAbsent(username);
    }
    //makes student specified by username absent
    // if no student is found return false, otherwise true



    //track student's first & last name, username, and phone number

   //add student to section
    public boolean addStudent (String firstName, String lastName, String username, long phoneNumber) {
        if (sections.size() == 0) {
            return false;
        }
        Section curSection = getCurrentSection();
        if(currentSection == null) {
            return false;
        }

       return curSection.addStudent(firstName, lastName, username, phoneNumber);





        }

    public static boolean addAssignmentToSection(String assignmentName, double posPoints) {
         double score = 0;
        Section currentSection = Gradebook.getCurrentSection();
         return currentSection.addAssignmentToSection(assignmentName, posPoints);
    }


    // returns -1 if no section section was found with the inputs sections name
    //otherwise return the box the with the matching name
    private static int getSectionIndexBySectionName(String sectionName) {
        int i = 0;
        while (i < sections.size()) {
            if(sectionName.equalsIgnoreCase(sections.get(i).getSectionName())) {
                return i;
            }
            i = i + 1;
        }
        return -1;
    }

    //return the section if there are any sections
    //return null if there are no current section
    public static Section  getCurrentSection() {
          //getSectionIndex(curSectionName)
        int index = getSectionIndexBySectionName(currentSection);
        //if index ==-1 return null
        if (index == -1) {
            return null;
        }
        //otherwise return section at that index
        return sections.get(index);
    }
}


