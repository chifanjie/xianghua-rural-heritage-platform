package com.example.rrmplatform.utils;

import java.util.Random;

public class saltUtil {
    public static String getSalt(int n) {
        char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            char aChar = chars[random.nextInt(chars.length)];
            sb.append(aChar);
        }
        return sb.toString();
    }
}
