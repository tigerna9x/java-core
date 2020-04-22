package Buoi_4_OOP;

import java.util.Scanner;

public class MainOPP {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("nhập số sv: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students= new Student[n];

//        Student hsA=new Student();

        for (int i=0;i<n;i++){
            System.out.println(" nhap vao sv thu : "+ (i+1));
            String thongTin=sc.nextLine();
            String[] thongTins=thongTin.split(" ");

            students[i]=new Student(thongTins[0],Integer.valueOf(thongTins[1]),thongTins[2]);


        }

        Student temp= null;

        for (int i=0;i<students.length-1;i++){
            for (int j=0;j<students.length;j++){
                if (students[i].getTuoi()<students[j].getTuoi()){
                    temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }
        for (Student st: students){
            System.out.println("Name: "+st.getTen()+"tuoi : " +st.getTuoi());
        }
    }
}
