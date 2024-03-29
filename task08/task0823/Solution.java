package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String res = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            res += ch;
        }
        System.out.println(res);
    }
}
