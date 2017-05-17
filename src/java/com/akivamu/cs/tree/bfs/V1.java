package com.akivamu.cs.tree.bfs;

import com.akivamu.cs.common.Node;

public class V1 {

    public String output = "";

    public void printLevelOrder(Node tree) {
        int height = 3;
        for (int level = 1; level <= height; level++) {
            printGivenLevel(tree, height, 1, level);
        }
    }

    private void printGivenLevel(Node node, int height, int curLevel, int level) {
        if (node == null) {
            // Ignore
        } else if (curLevel < level) {
            printGivenLevel(node.left, height, curLevel + 1, level);
            printGivenLevel(node.right, height, curLevel + 1, level);
        } else {
            output += node.data + " ";
            System.out.print(node.data + " ");
        }
    }
}
