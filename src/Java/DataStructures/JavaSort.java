package Java.DataStructures;

import java.util.*;
/**
 * Created by ryu on 1/3/17.
 */
class Men{
    private int id;
    private String fname;
    private double cgpa;
    public Men(int id, String fname, double cgpa) {
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

        List<Men> menList = new ArrayList<Men>();
        while(testCases-- >0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Men st = new Men(id, fname, cgpa);
            menList.add(st);
        }
        in.close();
        Collections.sort(menList, new Comparator<Men>() {
            @Override
            public int compare(Men s2, Men s1)
            {
                if ((Double.compare(s2.getCgpa(), s1.getCgpa())==0) && s2.getFname().equals(s1.getFname())==true) return s1.getId()-s2.getId();
                else if(Double.compare(s2.getCgpa(), s1.getCgpa())==0) return s2.getFname().compareTo(s1.getFname());
                else return s2.getCgpa() < s1.getCgpa() ? 1 : -1;
            }
        });

        for(Men st: menList) System.out.println(st.getFname());
    }
}
