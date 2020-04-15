package Buoi_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_34 {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        String result = "";
        for (int i=0;i<arr.length;i++){
            if (!result.contains(String.valueOf(arr[i]))){
                result=result+ "," +arr[i];
            }
        }
        result=result.substring(1);
        int lenght=result.split(",").length;
        System.out.println("new lenght of array: "+ lenght);
        System.out.println("Result: " +result);
    }
}