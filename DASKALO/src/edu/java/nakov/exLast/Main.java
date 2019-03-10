package edu.java.nakov.exLast;

public class Main {

    public static void main(String[] args) {
        Students a = new Students("ivan",1);
        Students b = new Students("ivan",2);
        Students c = new Students("ivan",3);
        //do tuk suzdadohme uchenici !!! i raboti !
        Disciplines bel = new Disciplines("BEL",10,10);
        Disciplines mat = new Disciplines("MAT",10,10) ;
        Disciplines fize = new Disciplines("Fize",10 , 10);
        //do tuk suzdadohme i disciplinite !!!
        Teacher Gigova= new Teacher();
        Gigova.discipliniNaPrepodawatelq[0]=bel;
        Gigova.discipliniNaPrepodawatelq[1]=mat;
        Gigova.discipliniNaPrepodawatelq[2]=fize;
        //do tuk uspqhme da suzdadem prepodawatel !!
        Clas a1= new Clas("12z");
        a1.teachers[0]=Gigova;
        Clas a2 = new Clas("12o");
        a2.teachers[1]=Gigova;
        //do tuk uspqhme da suzdadem PREPODAWATEL ^.^
        School PGEA = new School();
        PGEA.klasvowe[0]=a1;
        PGEA.klasvowe[1]=a2;
        PGEA.uchenici[0]=a;
        PGEA.uchenici[1]=b;
        PGEA.uchenici[2]=c;
        //mai sme gotowi majka hahahaha


        for (int i = 0; i <3 ; i++) {
            System.out.println(PGEA.uchenici[i].name+i);
            System.out.println(PGEA.uchenici[i].numberOfClass);

        }
        for (int i = 0; i <PGEA.klasvowe.length ; i++) {
            System.out.println(PGEA.klasvowe[i].name);

            for (int j = 0; j <PGEA.klasvowe.length+1; j++) {
                System.out.println(PGEA.klasvowe[i].teachers[i].discipliniNaPrepodawatelq[j].name);
                System.out.println(PGEA.klasvowe[i].teachers[i].discipliniNaPrepodawatelq[j].broiUroci);
                System.out.println(PGEA.klasvowe[i].teachers[i].discipliniNaPrepodawatelq[j].broiUprajneniq);

            }


        }


    }
}