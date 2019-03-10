package edu.java.nakov.ex2;

import java.awt.print.Book;

public class Library {


        private String libraryName;
        private Book[] Books=new Book[100];



        public Library(String libraryName, String Books){
            this.setLibraryName(libraryName);



        }





        public void addNewBookInLibrary(Book newBook){
            getBooks()[getBooks().length]=newBook;


        }

        public void findSomeBookFromLibrary(String avtora){
            for (int i = 0; i < getBooks().length ; i++) {
                if(avtora.equals(getBooks()[i])){
                    System.out.print(getBooks()[i]);
                }

            }

        }
        public void deleteSomeBookFromLibrary(String avtora){
            for (int i = 0; i < getBooks().length ; i++) {
                if(avtora.equals(getBooks()[i])){

                    getBooks()[i] =null ;

                }

            }

        }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Book[] getBooks() {
        return Books;
    }

    public void setBooks(Book[] books) {
        Books = books;
    }

    public void setBooks() {
    }
}


