package com.java.practice.programs;

import java.util.Scanner;

public class EncryptVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                sb.append("*");
            } else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
