package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

 class User {



         // Am creat class ,care contine cimpuri privat
         private String firstName, lastName, email;
         private int age;
         private Date registrationDate;
         private Status status;

         /**
          * All parameters must be filled in order to instantiate this class
          *
          * @param firstName
          * @param lastName
          * @param email
          * @param age
          * @param registrationDate
          * @param status
          */
        public User(String firstName, String lastName, String email, int age, Date registrationDate, Status status){
             super();
             this.firstName = firstName;
             this.lastName = lastName;
             this.email = email;
             this.age = age;
             this.registrationDate = registrationDate;
             this.status = status;
         }

         // Custom methods
         /**
          * Returns a string from date in a specific format
          *
          * @param date
          * @param formatDate
          * @return String
          */
         public static String DateToString (Date date, String formatDate){
             DateFormat dateFormat = new SimpleDateFormat(formatDate);
             String strDate = dateFormat.format(date);

             return strDate;
         }

     @Override
     public String toString() {
         return "User{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", email='" + email + '\'' +
                 ", age=" + age +
                 ", registrationDate=" + registrationDate +
                 ", status=" + status +
                 '}';
     }

     /**
          * Prints all details about the user in the console in one line
          *
          * @param dateFormat - in what format to display dates for example dd.mm.yyyy or
          *                   dd/mm/yyyy etc
          */


         // Getters & Setters

         public String getFirstName () {
             return firstName;
         }

         public void setFirstName (String firstName){
             this.firstName = firstName;
         }

         public String getLastName () {
             return lastName;
         }

         public void setLastName (String lastName){
             this.lastName = lastName;
         }

         public String getEmail () {
             return email;
         }

         public void setEmail (String email){
             this.email = email;
         }

         public int getAge () {
             return age;
         }

         public void setAge ( int age){
             this.age = age;
         }

         public Date getRegistrationDate () {
             return registrationDate;
         }

         public void setRegistrationDate (Date registrationDate){
             this.registrationDate = registrationDate;
         }

         public Status getStatus () {
             return status;
         }

         public void setStatus (Status status){
             this.status = status;
         }

     /**
      * Prints all details about the user in the console in one line
      *
      * @param dateFormat - in what format to display dates for example dd.mm.yyyy or
      * dd/mm/yyyy etc
      */
     public void printDetails(String dateFormat) {
         System.out.println("Name: " + firstName + " " + lastName + " | Age: " + age + " | Email:" + email
                 + " | Status: " + status + " | Registration Date: " + dateToString(registrationDate, dateFormat));
     }
     /**
      * Returns a string from date in a specific format
      *
      * @param date
      * @param formatDate
      * @return String
      */
     public static String dateToString(Date date, String formatDate) {
         DateFormat dateFormat = new SimpleDateFormat(formatDate);
         String strDate = dateFormat.format(date);

         return strDate;
     }
 }


