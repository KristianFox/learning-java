package edu.java.academy.ex1.models;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class SuperHero {
 private String name ;
 private String[] powers;

 public SuperHero(String name , String[] powers){
     this.name=name;
     this.powers=powers;


}
     public void fightWith(SuperHero opponent){
     System.out.printf("%s fight with %s",getName(), opponent.getName());


 }
 public String getName(){
    return this.name;
 }
 public void setName(String newName){
     if(name==null){
        throw new InvalidParameterException("Name cannot be null");
     }
     name=newName;

 }
 public void usePowers(){
    StringBuilder powerBuilder =new StringBuilder();
     Arrays.stream(this.powers)
             .forEach(powers->powerBuilder.append(","+powers));
      System.out.printf("%s has powers %s",name,powerBuilder);
      System.out.println();
     }
     public boolean equals(Object obj){
     SuperHero other = (SuperHero) obj;
     return getName().equals(other.getName());
     }
 }
 //public String getPowers

