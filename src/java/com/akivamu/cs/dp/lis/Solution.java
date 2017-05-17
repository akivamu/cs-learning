package com.akivamu.cs.dp.lis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Solution {
    protected int n;
    protected int[] arr;
    protected int[] lisEndWith;

    public void readInput(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        n = scanner.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        lisEndWith = new int[n];
        scanner.close();
    }

    public abstract int solve();

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
