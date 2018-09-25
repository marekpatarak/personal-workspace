package javaTutorial;

import java.io.*;

public class CSEmployeeTest  {

    public static void main(String args[]) {
      /* Create two objects using constructor */
        CSEmployee empOne = new CSEmployee("James Smith");
        CSEmployee empTwo = new CSEmployee("Mary Anne");

        // Invoking methods for each object created
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}