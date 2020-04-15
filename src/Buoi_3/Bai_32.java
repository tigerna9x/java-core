package Buoi_3;
import java.util.Scanner;
public class Bai_32{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang thu nhat : ");
        int a=scanner.nextInt();
        int arr1[]=new int[a];
        System.out.println("Hay nhap cac phan tu cua mang");
        for (int i = 0; i < a; i++) {
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Nhap so luong phan tu cua mang thu hai :");
        int b=scanner.nextInt();
        int arr2[]= new int[b];
        System.out.println("nhap mang thu 2: ");
        for (int j=0;j<b;j++){
            arr2[j]=scanner.nextInt();

        }
        int p= a + b;
        int result[]= new int[p];
        for (int m=0;m<p;m++){
            if(m<a){
                result[m]=arr1[m];
            }else result[m]= arr2[m-a];
        }
        for (int m =0;m<p;m++){
            for (int n=m+1;n<p-1;n++){
                if(result[m]>result[n]){
                    int temp=result[m];
                    result[m]=result[n];
                    result[n]=temp;
                }
            }
        }
        System.out.printf("result :" );
        for (int re=0;re<p;re++){
            System.out.printf("%d ", result[re]);
        }

        int sortarr=result[0];
        for (int i=0;i<result.length-1;i++){
            for (int j=i+1;j<result.length;j++){
                if (result[i]>result[j]){
                    sortarr=result[j];
                    result[j]=result[i];
                    result[i]=sortarr;
                }
            }
        }
        int temp=result[0];
        for(int i =0; i<result.length;i++)
            for (int j=0;j<result.length;j++){
                if(result[i]<result[j]){
                    temp=result[i];
                    result[i]=result[j];
                    result[j]=temp;
                }
            }
        System.out.println("mang da dc sap xep : ");
        for(int value:result){

            System.out.print(value+ " ");
        }

    }



}