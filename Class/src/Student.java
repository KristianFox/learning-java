

public class Student {
   public static int countOfStudents=0;




    public String firstName;
    public String secondName;
    public String lastName;
    public int kurs;
    public String specialty;
    public  String university;
    public  String email;
    public  String phoneNumber;

    public Student(String firstName,String secondName, String lastName,String specialty,String university,String phoneNumber){

        this.firstName=firstName;
        this.secondName= secondName;
        this.lastName = lastName;
        this.kurs=0;
        this.specialty=specialty;
        this.university=university;
        this.email=null;
        this.phoneNumber=phoneNumber;
        countOfStudents++;
    }
    public Student(String firstName, String lastName,String specialty,String university,String phoneNumber){

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
