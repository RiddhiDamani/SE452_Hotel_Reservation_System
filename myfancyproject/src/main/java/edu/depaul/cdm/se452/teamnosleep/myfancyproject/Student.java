package edu.depaul.cdm.se452.teamnosleep.myfancyproject;

import java.sql.Date;

import javax.validation.constraints.Email;

import lombok.Data;

@Data
public class Student{
    private String studentID;
    private String name;

    @Email
    private String email;
}
