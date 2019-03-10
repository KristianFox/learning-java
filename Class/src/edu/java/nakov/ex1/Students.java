package edu.java.nakov.ex1;

public class Students {
    public static int countOfStudents=0;




    public String firstName;
    public String secondName;
    public String lastName;
    public int kurs;
    public String specialty;
    public  String university;
    public  String email;
    public  String phoneNumber;

    public Students(){

        this.firstName=null;
        secondName= null;
        this.lastName = null;
        this.kurs=0;
        this.specialty=null;
        this.university=null;
        this.email=null;
        this.phoneNumber=null;
        countOfStudents++;
    }
    public Students(String firstName, String lastName,String specialty,String university,String phoneNumber){

        this.firstName=firstName;
        this.secondName= null;
        this.lastName = lastName;
        this.kurs=0;
        this.specialty=specialty;
        this.university=university;
        this.email=null;
        this.phoneNumber=phoneNumber;
        countOfStudents++;
    }


}
