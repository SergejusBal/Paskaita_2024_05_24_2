package org.example;

public class Student {

    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        int index  = grades.length;
        int [] naujasGradeMasyvas = new int[index+1];
        for(int i = 0 ; i < index ; i++){
            naujasGradeMasyvas[i] = grades[i];
        }
        naujasGradeMasyvas[index] = grade;
        grades = naujasGradeMasyvas;
    }

    @Override
    public String toString() {
        return "Name: " + name + " ** " + "Pažymių skaičius: " + grades.length;
    }
}
