package edu.java.nakov.exLast;

public class Main {

    public static void main(String[] args) {
        Students a = new Students("ivan",1);
        Students b = new Students("ivan",2);
        Students c = new Students("ivan",3);

        Disciplines bel = new Disciplines("BEL",10,10);
        Disciplines mat = new Disciplines("MAT",10,10) ;
        Disciplines fize = new Disciplines("Fize",10 , 10);

        Teacher Gigova= new Teacher();
        Gigova.disciplinesOfTheLecturer[0]=bel;
        Gigova.disciplinesOfTheLecturer[1]=mat;
        Gigova.disciplinesOfTheLecturer[2]=fize;

        Clas a1= new Clas("12z");
        a1.teachers[0]=Gigova;
        Clas a2 = new Clas("12o");
        a2.teachers[1]=Gigova;

        School PGEA = new School();
        PGEA.classes[0]=a1;
        PGEA.classes[1]=a2;
        PGEA.students[0]=a;
        PGEA.students[1]=b;
        PGEA.students[2]=c;



        for (int i = 0; i <3 ; i++) {
            System.out.println(PGEA.students[i].name+i);
            System.out.println(PGEA.students[i].numberInClass);

        }
        for (int i = 0; i <PGEA.classes.length ; i++) {
            System.out.println(PGEA.classes[i].name);

            for (int j = 0; j <PGEA.classes.length+1; j++) {
                System.out.println(PGEA.classes[i].teachers[i].disciplinesOfTheLecturer[j].name);
                System.out.println(PGEA.classes[i].teachers[i].disciplinesOfTheLecturer[j].countLessons);
                System.out.println(PGEA.classes[i].teachers[i].disciplinesOfTheLecturer[j].countsExercises);

            }


        }


    }
}