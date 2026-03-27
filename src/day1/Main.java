package day1;

class Student {

    String name;  
    // Instance variable → each object has its own value

    static String school = "Sauv";  
    // Static variable → shared by all objects


    // Constructor
    Student(String n) {
        name = n;  
    }
}


public class Main {
    public static void main(String[] args) {

        // Creating objects using constructor
        Student s1 = new Student("Abhi");  
        // s1.name = "Abhi"

        Student s2 = new Student("Rahul");  
        // s2.name = "Rahul"


        // Changing static variable using class name (correct way)
        Student.school = "XYZ School";  


        // Printing values
        System.out.println(s1.name + " - " + Student.school);  


        System.out.println(s2.name + " - " + Student.school);  
    }
}