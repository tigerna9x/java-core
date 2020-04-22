package Buoi_3;

import java.util.Scanner;

public class Bai_35_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        int count=0;
        System.out.println("nhập mảng : ");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0 ;i<arr.length;i++){
            if (arr[i]>0){
                int res = (int)Math.sqrt(arr[i]);
                if (res*res == arr[i]){
                    count++;
//                    System.out.printf("%d", " ", arr[i]);
                    System.out.println("so chinh phuong trong mang la : " +arr[i]);
                }
            }
        }
        System.out.println("co " + count + " so chinh phuong");
    }
}
