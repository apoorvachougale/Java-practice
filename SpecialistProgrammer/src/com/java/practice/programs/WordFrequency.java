package com.java.practice.programs;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> freq = new HashMap<>();

        System.out.print("Enter text: ");
        String[] words = sc.nextLine().toLowerCase().split("\\s+");

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        sc.close();
    }
}
