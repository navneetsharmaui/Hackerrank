package Java.DataStructures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by ryu on 1/3/17.
 */
class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> studentList = new PriorityQueue<Student>(totalEvents, new StudentComparator());
        while(totalEvents-- > 0){
            String event = in.next();
            switch (event) {
                case "ENTER":
                    String fname = in.next();
                    double cgpa=in.nextDouble();
                    int token = in.nextInt();
                    Student st = new Student(token, fname, cgpa);
                    studentList.add(st);
                    break;

                case "SERVED":
                    studentList.poll();
                    break;
            }
        }
        in.close();

        if(studentList.isEmpty()) System.out.println("EMPTY");
        else {
            while (!studentList.isEmpty()) {
                Student s = studentList.remove();
                System.out.println(s.getFname());
            }
        }
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s2, Student s1)
    {
        if ((Double.compare(s2.getCgpa(), s1.getCgpa())==0) && s2.getFname().equals(s1.getFname())==true) return s1.getToken()-s2.getToken();
        else if(Double.compare(s2.getCgpa(), s1.getCgpa())==0) return s2.getFname().compareTo(s1.getFname());
        else return s2.getCgpa() < s1.getCgpa() ? 1 : -1;
    }
}