package com.woo.wrhorse.generic;

import java.util.*;
/**
 * Created by User on 2016/4/24.
 */
public class ArrayEqual {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,3,4,5);
        List<Integer> b = Arrays.asList(3,4,5,2,1);
        System.out.println(compare(a, b));
    }

    private static <T extends Comparable<T>> boolean compare(List<T> a, List<T> b) {
        if (a == null || b == null || a.size() != b.size()){
            return false;
        }

        Collections.sort(a);
        Collections.sort(b);

        return a.toString().equals(b.toString());

    }
}
