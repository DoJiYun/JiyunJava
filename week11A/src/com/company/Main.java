package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Person> list = new ArrayList<>();
        int N = sc.nextInt();
        sc.nextLine();
        for (int n = 0; n < N; n++) {
            String[] items = sc.nextLine().split("\t");
            Person p = null;
            if (items[4].equals("Student")) {
                Student p1 = new Student();
                if (items[5].equals("FRESHMAN")) p1.status = Student.FRESHMAN;
                else if (items[5].equals("SOPHOMORE")) p1.status = Student.SOPHOMORE;
                else if (items[5].equals("JUNIOR")) p1.status = Student.JUNIOR;
                else if (items[5].equals("SENIOR")) p1.status = Student.SENIOR;
                p = p1;
            } else if (items[4].equals("Employee")) {
                Faculty p1 = new Faculty();
                if (items[5].equals("LECTURER")) p1.rank = Faculty.LECTURER;
                else if (items[5].equals("ASSISTANT_PROFESSOR")) p1.rank = Faculty.ASSISTANT_PROFESSOR;
                else if (items[5].equals("ASSOCIATE_PROFESSOR")) p1.rank = Faculty.ASSOCIATE_PROFESSOR;
                else if (items[5].equals("PROFESSOR")) p1.rank = Faculty.PROFESSOR;
                p = p1;
            } else if (items[4].equals("Staff")) {
                Staff p1 = new Staff();
                p1.title = items[5];
                p = p1;
            }
            p.name = items[0];
            p.address = items[1];
            p.phoneNumber = items[2];
            p.email = items[3];
            list.add(p);
        }
        for (Person p : list) System.out.println(p);
    }
}

class Person {
    String name;
    String address;
    String phoneNumber;
    String email;

    public String toString() {
        String result="";
        result+=name;
        result+=" is ";
        String k="";
        k+=getClass();
        //k=k.split(".")[2];
        //System.out.println(k);
        k=k.substring(6);
        result+=k;
        return result;
    }
}

class Student extends Person {
    static final String FRESHMAN="FRESHMAN";
    static final String SOPHOMORE="SOPHOMORE";
    static final String JUNIOR="JUNIOR";
    static final String SENIOR="SENIOR";

    String status;
}

class Employee extends Person {
    String office;
    double salary;
    MyDate hired;
}

class Faculty extends Employee {
    static int LECTURER =1;
    static int ASSISTANT_PROFESSOR=2;
    static int PROFESSOR=3;
    static int ASSOCIATE_PROFESSOR=4;
    //static final String ASSISTANT_PROFESSOR="ASSISTANT_PROFESSOR";
    //static final String LECTURER="LECTURER";
    //
    //static final String PROFESSOR="PROFESSOR";
    //public static final  ASSOCIATE_PROFESSOR = ;
    int hours;
    int rank;
}

class Staff extends Employee {
    String title;
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {

    }

    public int GetYear() {
        return year;
    }

    public int GetMonth() {
        return month;
    }

    public int GetDay() {
        return day;
    }

    public void SetYear(int newYear) {
        year = newYear;
    }

    public void SetMonth(int newMonth) {
        if (newMonth > 12 || newMonth < 0) {

        } else {
            month = newMonth;
        }
    }

    public void SetDay(int newDay) {
        day = newDay;
    }
}