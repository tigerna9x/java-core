package Bai_Tap;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        int a,sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 số nguyên :");
        a=sc.nextInt();
        sum=a+a*10+a+a*100+a*10+a;
        System.out.print(a+" + "+a+a+" + "+a+a+a+" = "+sum);
    }
}
