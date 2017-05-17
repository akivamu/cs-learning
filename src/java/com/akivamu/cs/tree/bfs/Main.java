package com.akivamu.cs.tree.bfs;

import com.akivamu.cs.common.Node;
import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static Node buildSampleTree() {
        Node root = new Node();
        root.data = 1;

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        return root;
    }

    @Test
    public void testV1() {
        Node root = buildSampleTree();

        V1 task = new V1();
        task.printLevelOrder(root);
        System.out.println();

        Assert.assertEquals(task.output, "1 2 3 4 5 ");
    }

    @Test
    public void testV2() {
        Node root = buildSampleTree();

        V2 task = new V2();
        task.printLevelOrder(root);
        System.out.println();

        Assert.assertEquals(task.output, "1 2 3 4 5 ");
    }
}
