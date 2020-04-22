package Buoi_4_OOP;

import java.util.Scanner;

public class Bai_41  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số sinh viên" );
        int n=sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        //
        for (int i =0 ; i<n ; i++){
            System.out.println("Nhap vao sinh vien thu : " + (i+1));
            String thongTin=sc.nextLine();
            String[] thongTins=thongTin.split(" ");
            students[i]=new Student(thongTins[0],thongTins[1],Integer.valueOf(thongTins[2]));

        }
        Student temp=null;
        for (int i=0;i<students.length-1;i++){
            for (int j=i+1;j<students.length;j++){
                if (students[i].getDiem()<students[j].getDiem()){
                    temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }

            }
        }
        for (Student st : students){
            System.out.println(" ten : "+st.getTen() + " msv : "+ st.getMsv()+ " diem : " +st.getDiem());
        }

    }
    public static class Student {
        private String ten;
        private int tuoi;
        private String msv;
        private int diem;
        private String gioiTinh;

        public Student(String ten, String msv, int diem) {
            this.ten = ten;
            this.msv = msv;
            this.diem = diem;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public String getMsv() {
            return msv;
        }

        public void setMsv(String msv) {
            this.msv = msv;
        }

        public int getDiem() {
            return diem;
        }

        public void setDiem(int diem) {
            this.diem = diem;
        }
    }
}
