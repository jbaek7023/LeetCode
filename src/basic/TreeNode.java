package basic;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x; }
	
	public void print() {
        print("", true);
    }
	
	private void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + val);
        if(left != null) {
            left.print(prefix + (isTail ? "    " : "│   "), false);
        }
        if(right != null) {
            right.print(prefix + (isTail ? "    " : "│   "), false);
        }
        if(left == null) {
//            left.print(prefix + (isTail ? "    " : "│   "), true);
        }
        if(right == null) {
//            right.print(prefix + (isTail ? "    " : "│   "), true);
        }
        
    }
}
