/*package com.company;

/**
 * Created by jt4100 on 3/13/2019.
 */
//public class TestCase {
    /*o:Type one of the following commands:
        o:change section
        o:add section
        o:add student
        o:add assignment to student
        o:add assignment to section
        o:set score
        o:mark tardy
        o:mark absent
        o:get overall score
        o:get overall score avg
        o:get assignment score
        o:get assignment score avg
        o:get tardy count
        o:get absent count

        //test cases

        ////testing to make sure adding a student before any sections are made returns an error message (Works)
         i:add student
         o:enter student first name
         i:bob
         o:enter student last name
         i:joe
         o:enter student username
         i:bobjoe
         o:enter a phone number including area code as a 10 digit number
         i:1231231234
         o:There was an error with the command, operation not completed
//should not create a student because there are no sections added yet

o:Type one of the following commands:
o:change section
        o:add section
        o:add student
        o:add assignment to student
        o:add assignment to section
        o:set score
        o:mark tardy
        o:mark absent
        o:get overall score
        o:get overall score avg
        o:get assignment score
        o:get assignment score avg
        o:get tardy count
        o:get absent count


    ////testing to make sure the gradebook can add sections (Works)
i:add section
o:Enter a section name
i:am
o:action completed successfully
//should see the section created in gradebook with the name am but no students added. Current section should show "am" is active (Works)
o:change section
        o:add section
        o:add student
        o:add assignment to student
        o:add assignment to section
        o:set score
        o:mark tardy
        o:mark absent
        o:get overall score
        o:get overall score avg
        o:get assignment score
        o:get assignment score avg
        o:get tardy count
        o:get absent count

        /////testing to make sure a student can be created and added to the active section (Works)
        i:add student
        o:Enter student first name
        i:david
        o:Enter student last name
        i:baker
        o:Enter student username
        i:davidbaker
        o:Enter student phone number
        i:1231231234
        o:action completed successfully
//should see student is created and added to the pm section and the student should have the information specified absent/tardycount should be 0 and have 0 assignments assigned. (Works)
        o: type one of the following commands...


        ////testing to make sure assignments can be added to students
        i: add assignment to student
        o:Enter student username
        i:davidbaker
        O: Enter assginment name
        i: Gradebook Project
        o: action completed successfully


        ////adding an assignment to current section
        O: Enter assignment name
        i: Gradebook Project
        o: action completed successfully


        ////setting a score to an assignment
       o: type one of the following commands...(i: set score)
       O: Enter assignment name
       i: Gradebook Project
       o: Enter score
       i: (a decimal or integer value)
       o: action completed successfully

       ////setting a score to an assignment that doesnt exist yet
       O: Enter assignment name
        i: This Assignment Does Not Exist.
        o: error: action unsuccessful


        ////marking students tardy (Works)
        i: mark tardy
        o: enter student username
        i: davidbaker1
        o: action completed successfully //return error message if student does not exist

          ////marking students absent (Works)
        i: mark absent
        o: enter student username
        i: davidbaker1
        o: action completed successfully //return error message if student does not exist

          //// getting student average
          i:get assignment score average
          o: enter student username
          i: davidbaker
          o: (first name) David has an average score of (add all of student's scores and divide by no. of assginments) 73%


          ////getting score on  students assignment
          i: get assignment score
          o: enter student username
          i: davidbaker1
          o: enter assignment name
          i: Gradebook Project
          o: (first name) has a score of (assignment score)% on (assignment name)


         ////getting overall section score
         i: get overall score
         o: (section) has a class average of (average value of all students in sections averages)





}*/
