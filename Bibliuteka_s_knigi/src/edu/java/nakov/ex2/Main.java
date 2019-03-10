package edu.java.nakov.ex2;



import java.awt.print.Book;

public class Main {

    public static void main(String[] args) {
         Library Sofia= new Library("Sofia","az");
        Sofia.getBooks()={"az","ti","toij","tq","o"};
        Sofia.setBooks("ivan");
         Book Hari = new Book();


         System.out.println(Sofia.getLibraryName());
        System.out.print(Sofia.getBooks()[0]);




    }
}
