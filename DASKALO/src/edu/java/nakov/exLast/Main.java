package edu.java.nakov.exLast;

import java.util.Dictionary;

public class Main {

    public static void main(String[] args) {
        UCHENICI a = new UCHENICI("ivan",1);
        UCHENICI b = new UCHENICI("ivan",2);
        UCHENICI c = new UCHENICI("ivan",3);
        //do tuk suzdadohme uchenici !!! i raboti !
        DISCIPLINI bel = new DISCIPLINI("BEL",10,10);
        DISCIPLINI mat = new DISCIPLINI("MAT",10,10) ;
        DISCIPLINI fize = new DISCIPLINI("Fize",10 , 10);
        //do tuk suzdadohme i disciplinite !!!
        Prepodawatel Gigova= new Prepodawatel();
        Gigova.discipliniNaPrepodawatelq[0]=bel;
        Gigova.discipliniNaPrepodawatelq[1]=mat;
        Gigova.discipliniNaPrepodawatelq[2]=fize;
        //do tuk uspqhme da suzdadem prepodawatel !!
        Klas a1= new Klas("12z");
        a1.prepodawatels[0]=Gigova;
        Klas a2 = new Klas("12o");
        a2.prepodawatels[1]=Gigova;
        //do tuk uspqhme da suzdadem PREPODAWATEL ^.^
        Uchilishte PGEA = new Uchilishte();
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
                System.out.println(PGEA.klasvowe[i].prepodawatels[i].discipliniNaPrepodawatelq[j].name);
                System.out.println(PGEA.klasvowe[i].prepodawatels[i].discipliniNaPrepodawatelq[j].broiUroci);
                System.out.println(PGEA.klasvowe[i].prepodawatels[i].discipliniNaPrepodawatelq[j].broiUprajneniq);

            }


        }


    }
}