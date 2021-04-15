package edu.depaul.cdm.se452.teamnosleep.myfancyproject;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.ToString;

@Data
public class Course {
    @Size(min=2, max=2, message = "Department code must be less than 3 characters")
    private String dept;

    @Min(value=0, message="number cannot be negative")
    @Max(value = 999, message = "number cannot be less than 999")
    private int num;
    
    @ToString.Exclude
    private List<Student> students;
}
