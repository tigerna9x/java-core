package Buoi_3;

import java.util.Scanner;

public class Bai_35_3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng : ");
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("nhập mảng : ");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int pos=srchPos(arr);
        System.out.println("vi tri cua so nho nhat trong mang la: " +(pos=+1));
    }
    public static int srchPos(int arr[]){
        int min=0;
        int pos=-1;
        for (int i =0;i<arr.length;i++){
            if ((min==0 || min>arr[i]) && arr[i]>0){
                min=arr[i];
                pos=i;
            }

        }
        return pos;
    }
}
