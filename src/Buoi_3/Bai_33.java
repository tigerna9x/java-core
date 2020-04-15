package Buoi_3;

import java.util.Scanner;

public class Bai_33 {
    public static void main(String[] args) {
        // nhap du lieu
        Scanner sc=new Scanner(System.in);
        String input;
        input=sc.nextLine();
        String[] inputs=input.split(" ");
        int index=0;
        int dodaiMax=0;
        for (int i=0;i<inputs.length;i++){
            int dodai=inputs[i].length();
            if (dodai>dodaiMax){
                dodaiMax=dodai;
                index=i;
            }
        }
        System.out.println(inputs[index]);
    }
}
