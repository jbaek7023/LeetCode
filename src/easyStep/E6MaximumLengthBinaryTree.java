package easyStep;


/*TAGS: Tree, DFS(Depth-First-Search)*/

/*Find Max Depth!*/
public class E6MaximumLengthBinaryTree {
	public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.right = new TreeNode(4);
		root.right.right = new TreeNode(10);
		root.right.left = new TreeNode(10);
		root.right.left.right = new TreeNode(10);
		System.out.println(maxDepth(root));
	}
}

