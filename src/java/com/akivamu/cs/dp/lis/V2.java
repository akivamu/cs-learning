package com.akivamu.cs.dp.lis;

public class V2 extends Solution {
    @Override
    public int solve() {
        // Init LIS
        for (int i = 0; i < n; i++) {
            lisEndWith[i] = 1;
        }

        // lisEndWith[i] is longest seq length ONLY FOR seqs that ended by arr[i]
        // lisEndWith[i] is NOT solution for seqs that NOT ENDED by arr[i]
        for (int i = 1; i < n; i++) {
            /*
             1. Find all elements less than arr[i]
             2. Among them, find element at k that has max lisEndWith[k]
             3. lisEndWith[i] = lisEndWith[k] + 1

             For lis.V2: we will eventually assign max lisEndWith[k] to lisEndWith[i],
             so we can combine 2 loops
             */
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lisEndWith[j] >= lisEndWith[i]) {
                    lisEndWith[i] = lisEndWith[j] + 1;
                }
            }
        }

        int result = lisEndWith[0];
        for (int i = 1; i < n; i++) {
            if (lisEndWith[i] > result) result = lisEndWith[i];
        }

        System.out.println(result);
        return result;
    }

}
