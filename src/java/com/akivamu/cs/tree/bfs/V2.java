package com.akivamu.cs.tree.bfs;

import com.akivamu.cs.common.Node;

import java.util.LinkedList;
import java.util.Queue;

public class V2 {

    public String output = "";

    public void printLevelOrder(Node tree) {
        if (tree == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(tree);
        while (!q.isEmpty()) {
            Node node = q.poll();

            output += node.data + " ";
            System.out.print(node.data + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}
