package com.zn.company.qunar;

import java.util.ArrayList;
import java.util.Scanner;

public class DAGsort {
	private static int SUM;

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int nodenum = cin.nextInt();
		int edgenum = cin.nextInt();
		SUM = nodenum;

		Node[] nodes = new Node[nodenum + 1];
		int i = 1;
		while (i <= nodenum) {

			Node node = new Node(cin.nextInt(), cin.nextInt(), 0);
			nodes[i] = node;
			i++;
		}
		i = 1;
		// 构建边
		while (i <= edgenum) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			nodes[n].nextNode.add(m);
			nodes[m].inCount += 1;
			i++;
		}

		// 拓扑排序递归输出
		DAGprint(nodes);

	}

	private static void DAGprint(Node[] nodes) {
		if (SUM > 0) {
			Node node = null;
			for (int i = 1; i < nodes.length; i++) {
				if (nodes[i] != null) {
					if (nodes[i].inCount == 0) {
						if (node == null) {
							node = nodes[i];
						} else {
							if (nodes[i].weight > node.weight) {
								node = nodes[i];
							}
						}
					}
				}
			}
			// 输出node;
			System.out.print(node.num + " ");

			ArrayList<Integer> nextNode = node.nextNode;
			for (Integer n : nextNode) {
				nodes[n].inCount--;
			}
			nodes[node.num] = null;
			SUM--;

			DAGprint(nodes);
		}
	}

}

class Node {

	public ArrayList<Integer> nextNode;
	public int inCount;
	public int num;
	public int weight;

	public Node(int num, int weight, int inCount) {
		this.num = num;
		this.weight = weight;
		this.inCount = inCount;
		nextNode = new ArrayList<Integer>();
	}

}
