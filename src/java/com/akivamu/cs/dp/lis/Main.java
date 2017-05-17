package com.akivamu.cs.dp.lis;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class Main {

    @Test
    public void testV1() throws FileNotFoundException {
        Solution solution = new V1();
        solution.readInput("src/resources/dp/lis/lis01.txt");
        Assert.assertEquals(3, solution.solve());

        solution = new V1();
        solution.readInput("src/resources/dp/lis/lis02.txt");
        Assert.assertEquals(6, solution.solve());
    }

    @Test
    public void testV2() throws FileNotFoundException {
        Solution solution = new V2();
        solution.readInput("src/resources/dp/lis/lis01.txt");
        Assert.assertEquals(3, solution.solve());

        solution = new V2();
        solution.readInput("src/resources/dp/lis/lis02.txt");
        Assert.assertEquals(6, solution.solve());
    }
}
