package edu.depaul.cdm.se452.teamnosleep.myfancyproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;



public class Main {
    public static void main(String args[]) {
        Student stud = new Student(); 
        stud.setName("Kazama");

        Course course = new Course();
        course.setDept("CSC");

        // Have to write Validation Checks
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Course>> violations = validator.validate(course);
        for(ConstraintViolation<Course> violation : violations) {
            System.err.print(violation.getMessage());
        }


        course.setNum(452);
        List<Student> studList = new ArrayList<Student>();
        studList.add(stud);
        course.setStudents(studList);
        System.out.println(course);
        //System.out.print(studList);
    }
}
