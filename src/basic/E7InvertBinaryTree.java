package basic;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*TAGS: Tree*/

//Invert a binary tree
public class E7InvertBinaryTree {
	/*Recursive*/
	public static TreeNode invertTreeDFS(TreeNode root) {
		if (root == null) {
            return null;
        }

		//get the final static unchanged value
        final TreeNode left = root.left;
        final TreeNode right = root.right;
        
        root.left = invertTreeDFS(right);
        root.right = invertTreeDFS(left);
        return root;
    }
	
	/* DFS */
	public static TreeNode invertTree(TreeNode root) {
		//root is current node
		if (root == null) {
            return null;
        }
		/*Deque is for stack*/
        final Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            final TreeNode node = stack.pop();
            
            final TreeNode left = node.left;
            final TreeNode right = node.right;
            
            node.left = right;
            node.right = left;
            
            if(node.left != null) {
                stack.push(node.left);
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }
	
	/*BFS - Level Order Search*/
	public static TreeNode invertTreeBFS(TreeNode root) {
		if (root == null) {
            return null;
        }

        final Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
        	final TreeNode node = queue.poll();
        	
        	final TreeNode left = node.left;
            final TreeNode right = node.right;
            
            node.left = right;
            node.right = left;

            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		
		System.out.println("before");
		root.print();
		
		System.out.println();
		System.out.println();
		System.out.println("after");
//		invertTree(root).print();
//		invertTreeDFS(root).print();
		invertTreeBFS(root).print();

	}
}
