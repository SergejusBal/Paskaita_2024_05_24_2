package org.example;

import java.lang.runtime.SwitchBootstraps;

public class School {

    private Student[] students;

    public School(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student){
        int index  = students.length;
        Student[] naujasStudSarasas = new Student[index+1];
        for(int i = 0 ; i < index ; i++){
            naujasStudSarasas[i] = students[i];
        }
        naujasStudSarasas[index] = student;
        students = naujasStudSarasas;

    }
    public Double calculateAverage(String name){
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1) return null;
        Student student = students[index];
        int[] pazymiai = student.getGrades();

        Double suma = 0.0;
        for(int i:pazymiai){
            suma+=i;
        }
        return suma / pazymiai.length;
    }

    public void printStudentGrades(String name){
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("Tokio Studento nėra");
            return;
        }
        Student student = students[index];
        int[] pazymiai = student.getGrades();

        System.out.println("**************************************");
        for(int i:pazymiai){
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.println("**************************************");
    }

    public void printTOP10Students() {
        Student[] studentArrays = students;
        Double[] average = new Double[students.length];

        for (int i = 0; i < students.length; i++){
            average[i] = calculateAverage(studentArrays[i].getName());
        }

        boolean swapped;
        int n = average.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (average[i - 1] < average[i]) {
                    Double temp = average[i - 1];
                    Student studenttemp = new Student(studentArrays[i-1].getName(),studentArrays[i-1].getGrades());
                    average[i - 1] = average[i];
                    students[i - 1] = students[i];
                    average[i] = temp;
                    students[i] = studenttemp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);


        int count = 0;
        for(int i = 0; i < students.length; i++)     {
            if(average[i]>8.5){
                System.out.println("Vardas: " + students[i].getName() + " Vidurkis: " + average[i]);
                count++;
            }
            if(count == 10) break;
        }

    }
    public void resortList(String order) {
        boolean swapped;
        int n = students.length;

        switch (order) {
            case "ASC":
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (students[i - 1].getName().compareTo(students[i].getName()) > 0) {
                            Student studenttemp = new Student(students[i-1].getName(),students[i-1].getGrades());
                            students[i - 1] = students[i];
                            students[i] = studenttemp;
                            swapped = true;
                        }
                    }
                    n--;
                } while (swapped);
                break;
            case "DESC":
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (students[i - 1].getName().compareTo(students[i].getName()) < 0) {
                            Student studenttemp = new Student(students[i-1].getName(),students[i-1].getGrades());
                            students[i - 1] = students[i];
                            students[i] = studenttemp;
                            swapped = true;
                        }
                    }
                    n--;
                } while (swapped);
                break;
            default:
                System.out.println("Tokio rušiavimo nėra");
                break;
        }

    }
    public static void sort(String[] array) {
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {

                if (array[i - 1].compareTo(array[i]) > 0) {
                    String temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }






}
