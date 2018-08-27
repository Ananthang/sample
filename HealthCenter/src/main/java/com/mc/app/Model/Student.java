package com.mc.app.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Student")
public class Student {
    @Id
    String id;
    private String firstname;
    private String lastname;
    private String resaddress;
    private String peraddress;
    private String Regno;
    private Date dob;
    private String faculty;
    private boolean gender;
    private String Lastschoolattend;
    private String ParentsGuardianname;
    private String ParentsGuardianAddress;
    private String GPhonenumber;
    private boolean pollomyelitis;
    private boolean mumps;
    private boolean chickenpox;
    private boolean tuberculosis;
    private boolean malaria;
    private boolean chromiccough;
    private boolean bronchialasthma;
    private boolean dentalproblem;
    private boolean fractures;
    private boolean visaualdefects;
    private boolean hearingdefects;
    private String opration;
    private boolean smoking;
    private boolean reading;
    private boolean financial;
    private boolean drinking;
    private boolean hearing;
    private String fatheroccuption;
    private String fatherage;
    private String fatherillness;
    private String fatherif;
    private String motheroccuption;
    private String motherage;
    private String motherillness;
    private String motherif;
    private String brothername;
    private String brotherage;
    private String brotherillness;
    private String brotherage;
    private String brotherage;
    private String brotherage;




}
