package com.akivamu.cs.dp.lcs;

public class V1 extends Solution {
    @Override
    public int solve() {
        // Init LCS
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                lcs[i][j] = 0;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (A[i] == B[j]) {
                    lcs[i][j] = lcs[i - 1][j - 1] + 1;
                } else {
                    lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                }
            }
        }

        int len = lcs[n][m];
        System.out.println(len);

        int[] cs = new int[len];
        int lastLen = len;
        for (int i = n; i > 0; i--) {
            for (int j = m; j > 0; j--) {
                if (lcs[i][j] == lastLen - 1) {
                    cs[lastLen - 1] = A[i];
                    lastLen--;
                }
            }
        }
        for (int i = 0; i < len - 1; i++) {
            System.out.print(cs[i] + " ");
        }
        System.out.println(cs[len - 1]);

        return len;
    }
}
