package Bai_Tap;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        int a,b,tong,tic,hieu,thuong,sodu;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số thứ nhất :");
        a=sc.nextInt();
        System.out.print("nhập số thứ hai :");
        b=sc.nextInt();
        tong=a+b;
        hieu=a-b;
        tic=a*b;
        thuong=a/b;
        sodu=a%b;
        System.out.println( a + "+"+ b +"="+ tong);
        System.out.println( a + "-"+ b +"="+ hieu);
        System.out.println( a + "*"+ b +"="+ tic);
        System.out.println( a + "/"+ b +"="+ thuong);
        System.out.println( a + "mod"+ b +"="+ sodu);

    }
}
