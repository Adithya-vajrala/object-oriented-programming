package com.java.method.studentregisrationsystem;

public class Student {
    public long calculateTotalMarks(int m1, int m2, int m3){
        return m1+m2+m3;
    }
    public float calculateAverage(long sum){
        return (float) sum/3;
    }
    public char calculateGrade(float avg){
        char grade;
        if (avg > 70){
            grade = 'A';
        }
        else
            grade = 'B';
        return grade;
    }
    public void displayDetails(String name,int m1, int m2, int m3){
        System.out.println("Name: "+name);
        System.out.println("Marks: " + m1 +" "+m2+" "+m3);
        long sum = calculateTotalMarks(m1,m2,m3);
        System.out.println("Total: " + sum);
        float average = calculateAverage(sum);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + calculateGrade(average));
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails("Adithya",70,70,70);
    }
}
