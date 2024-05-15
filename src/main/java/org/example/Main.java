package org.example;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Jonas", new int[]{10,8,10,10,10,7,10,10,10,10,10});
        Student student2 = new Student("Mantas", new int[]{10,8,8,9,9,7,9,8,10,10});
        Student student3 = new Student("Aiste", new int[]{10,8,10,8,8,7,10,10,8,});
        Student student4 = new Student("Egle", new int[]{10,8,10,8,8,7,10,10,5,8,7,10});
        Student student5 = new Student("Vidmantas", new int[]{10,8,10,8,8,7,10,10,1,2,5,1,7});
        Student student6 = new Student("Ernestas", new int[]{10,8,10,8,8,7,10,10,5});
        Student student7 = new Student("Laurynas", new int[]{10,8,10,8,8,7,10,10});
        Student student8 = new Student("Tomas", new int[]{10,8,10,8,8,7,10,10,9});
        Student student9 = new Student("Artūras", new int[]{10,8,10,8,8,7,10,10,7});
        Student student10 = new Student("Gediminas", new int[]{10,8,10,8,8,7,10,10,7,7,7});
        Student student11 = new Student("Gintarė", new int[]{10,8,10,8,8,7,10,10,6,7,8,8});

        School school = new School(new Student[0]);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.addStudent(student6);
        school.addStudent(student7);
        school.addStudent(student8);
        school.addStudent(student9);
        school.addStudent(student10);
        school.addStudent(student11);

        for (Student s:school.getStudents()){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Vidurkis");
        System.out.println(school.calculateAverage("Jonas"));

        System.out.println();
        System.out.println("Pažymiai");
        school.printStudentGrades("Jonas");


        System.out.println();
        System.out.println("Top 10 su 8.5 vidurkiu");
        school.printTOP10Students();


        System.out.println();
        System.out.println("DESC students");
        school.resortList("DESC");
        for (Student s:school.getStudents()){
            System.out.println(s);
        }

        System.out.println();
        System.out.println("ASC students");
        school.resortList("ASC");
        for (Student s:school.getStudents()){
            System.out.println(s);
        }




    }
}