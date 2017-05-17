package com.akivamu.cs.dp.lcs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Solution {
    protected int n,m;
    protected int[] A, B;
    protected int[][] lcs;

    public void readInput(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        n = scanner.nextInt();
        m = scanner.nextInt();
        A = new int[n+1];
        B = new int[m+1];
        for (int i = 1; i <= n; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            B[i] = scanner.nextInt();
        }
        lcs = new int[n+1][m+1];
        scanner.close();
    }

    public abstract int solve();

}
