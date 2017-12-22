package com.zn.data_structure.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.zn.bean.TreeNode;
import com.zn.factory.DataFactory;

/**
 * 二叉树相关面试题
 * 
 * @author ning
 *
 */
public class BinaryTree {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, -1, 6, 7 };

		TreeNode tree = DataFactory.getTree(arr);

		// levertravel(tree);

		System.out.println(treeheight(tree));

		int[] arr2 = { 1, 2, 2, 3, 4, 4, 3 };
		TreeNode tree2 = DataFactory.getTree(arr2);

		System.out.println(leafnum(tree2));

	}

	public static int leafnum(TreeNode root) {

		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		return leafnum(root.left) + leafnum(root.right);

	}

	/**
	 * 判断一棵树是否是镜像二叉树
	 * 
	 * @param root
	 * @return
	 */
	public static boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	private static boolean isSymmetric(TreeNode left, TreeNode right) {

		if (left == null && right == null) {
			return true;
		}
		if (left == null || right == null) {
			return true;
		}

		if (left.val == right.val) {
			return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		}
		return false;
	}

	/**
	 * 
	 * 判断是否是满二叉树
	 * 
	 * 一个深度为k，节点个数为 2^k - 1 的二叉树为满二叉树
	 * 
	 * @param root
	 * @return true or false
	 */
	public static boolean isfullbtree(TreeNode root) {

		return false;
	}

	/**
	 * 
	 * 判断是否是完全二叉树
	 * 
	 * @param root
	 * @return
	 */
	public static boolean iscompletebtree(TreeNode root) {

		// 层次遍历，if(node ->left == null && node->right !=null) return false;
		// if(node -> right ==null&& 当前队列中的结点存在左|后子结点) return false;

		return false;
	}

	public static int treeheight(TreeNode root) {

		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		int l_height = treeheight(root.left);
		int r_height = treeheight(root.right);

		return l_height >= r_height ? l_height + 1 : r_height + 1;
	}

	/**
	 * 求二叉树的叶子节点个数
	 */
	public static int leafnodenum(TreeNode root) {

		// 只需要遍历二叉树记录没有左右孩子的结点即可

		return 0;
	}

	/**
	 * 层次遍历
	 * 
	 * @param root
	 */
	public static void levertravel(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if (root == null) {
			return;
		} else {

			queue.add(root);
		}

		while (queue.size() > 0) {

			TreeNode poll = queue.poll();
			System.out.println(poll.val);

			if (poll.left != null) {
				queue.add(poll.left);
			}
			if (poll.right != null) {
				queue.add(poll.right);
			}

		}

	}

	// 先序遍历
	public static void preorder(TreeNode root) {

		if (root != null) {
			System.out.println(root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}

	// 中序遍历
	public static void inorder(TreeNode root) {

		if (root != null) {
			inorder(root.left);
			System.out.println(root.val);
			inorder(root.right);
		}
	}

	// 后序遍历
	public static void postorder(TreeNode root) {

		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.val);
		}
	}

}
