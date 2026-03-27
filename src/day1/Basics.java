package day1;

// public class Basics {
//     public static void main(String[] args) {
//         System.out.println("Hello world");
//     }
// }

/* 
public class Basics {

      public void localVariable() {
        String name = "Ben";
        int marks = 95;
        System.out.println(name + " Scored " + marks + "%.");
    }
 
    public static void main(String[] args) {
        Basics vt = new Basics();
        vt.localVariable();
    } 
}*/

// public class Basics {

//     public String name = "Ben";
//     public int marks = 95;

//     public void instanceVariable() {
//         System.out.println(name + " Scored " + marks + "%.");
//     }

//     public static void main(String[] args) {
//         Basics  vt = new Basics();
//         vt.instanceVariable();
//     }
// }

public class Basics {

    String name;
    static String school = "SAUV";

    public class main {
        public static void main(String[] args) {
            Basics s1 = new Basics();
            Basics s2 = new Basics();

            s1.name = "Abhi";
            s2.name = "Rahul";

            s1.school = "XYZ School";

            System.out.println(s1.name + " - " + s1.school);
            System.out.println(s2.name + " - " + s2.school);
        }
    }
}