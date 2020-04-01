package Bai_Tap;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args){
        int a,b,tong,tic;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số thứ nhất :");
        a=sc.nextInt();
        System.out.print("nhập số thứ hai :");
        b=sc.nextInt();
        tong=a+b;
        tic=a*b;
        System.out.println("tổng của hai số là :" + a +"+"+b +"="+tong );
        System.out.println("tích của hai số là :" + a +"*"+b +"="+tic);
     }
}

