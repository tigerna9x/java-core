package Bai_Tap;

import java.util.Scanner;

public class Bai_3_for {
    public static void main(String[] args) {
        Scanner nc=new Scanner(System.in);
        System.out.println("nhap vao so cua ban cuu chuong VD: ban cuu chuong 2 thi nhap 2:");
        System.out.println("nhap vao 1 so:");
        int i=nc.nextInt();
        int num=1;
        while(num<=10){
            System.out.printf("\n%d * "+i+" = %d",num,(num * i));
            num++;
        }
    }
}
