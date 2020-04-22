package Buoi_3;

import java.util.Scanner;

public class Bai_35_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("nhập mảng : ");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("gia tri lon nhat la : " + max);
        System.out.println("gia tri nho nhat la : " + min);



    }
}
