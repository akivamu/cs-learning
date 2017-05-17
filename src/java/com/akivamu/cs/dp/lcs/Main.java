package com.akivamu.cs.dp.lcs;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    @Test
    public void testV1() throws FileNotFoundException {
        Solution solution = new V1();
        solution.readInput("src/resources/dp/lcs/lcs01.txt");
        Assert.assertEquals(3, solution.solve());

        solution = new V1();
        solution.readInput("src/resources/dp/lcs/lcs02.txt");
        Assert.assertEquals(26, solution.solve());
        // 27 76 88 55 94 42 56 74 69 7 94 41 8 71 15 43 3 23 49 84 98 89 24 20 14 88
    }
}
