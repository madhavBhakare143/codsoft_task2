package com.codsoftintern;
import java.util.Scanner;
public class StudentGradeCalculator {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input: Enter how many subjects you have
            System.out.print("Enter the number of subjects: ");
            int numbSubjects = sc.nextInt();

            // Input: Marks for individual subject
            int[] marks = new int[numbSubjects];
            int totalMarks = 0;

            for (int i = 0; i < numbSubjects; i++) {
                System.out.print("Enter the marks for subject " + (i + 1) + " out of 100: ");
                marks[i] = sc.nextInt();
                totalMarks += marks[i];
            }

            // Calculate the average in  percentage
            double avgPercent = (double) totalMarks / numbSubjects;

            // Show grade based on percentage
            char grade;
            if (avgPercent >= 90) {
                grade = 'A';
            } else if (avgPercent >= 80) {
                grade = 'B';
            } else if (avgPercent >= 70) {
                grade = 'C';
            } else if (avgPercent >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Show the results
            System.out.println("\nResults:");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + avgPercent + "%");
            System.out.println("Grade: " + grade);

            // Scanner close
            sc.close();
        }
    }




