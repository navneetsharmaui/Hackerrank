package Java.DataStructures;

import java.util.*;
/**
 * Created by ryu on 1/3/17.
 */
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases-- >0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }
        in.close();
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s2, Student s1)
            {
                if ((Double.compare(s2.getCgpa(), s1.getCgpa())==0) && s2.getFname().equals(s1.getFname())==true) return s1.getId()-s2.getId();
                else if(Double.compare(s2.getCgpa(), s1.getCgpa())==0) return s2.getFname().compareTo(s1.getFname());
                else return s2.getCgpa() < s1.getCgpa() ? 1 : -1;
            }
        });

        for(Student st: studentList) System.out.println(st.getFname());
    }
}
