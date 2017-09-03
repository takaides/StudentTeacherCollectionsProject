package com.theironyard.java.studentteachercollectionsproject;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList<>();
        ArrayList<Teacher> Teachers = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            String firstName = new RandomName().getFirstName();
            String lastName = new RandomName().getLastName();
            Students.add(new Student(firstName, lastName, Students.size(), 1));
        }

        for (int i = 0; i < 3; i++) {
            String firstName = new RandomName().getFirstName();
            String lastName = new RandomName().getLastName();
            Teachers.add(new Teacher(firstName, lastName, Teachers.size(), 1));
        }

        Set<Student> firstGradeClassOne = new HashSet<>();
        Set<Student> firstGradeClassTwo = new HashSet<>();
        Set<Student> firstGradeClassThree = new HashSet<>();
        Map<Teacher, Set> roster = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==0) firstGradeClassOne.add(Students.get((i*5)+j));
                if (i==1) firstGradeClassTwo.add(Students.get((i*5)+j));
                if (i==2) firstGradeClassThree.add(Students.get((i*5)+j));
            }
            if (i==0) roster.put(Teachers.get(i), firstGradeClassOne);
            if (i==1) roster.put(Teachers.get(i), firstGradeClassTwo);
            if (i==2) roster.put(Teachers.get(i), firstGradeClassThree);
        }
        
        for (Teacher key: roster.keySet()) {
            System.out.println(key);
        }

        for (Set value : roster.values()) {
            System.out.println(value);
        }
    }
}
