/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
		TreeNode answer = root;
		if(depth < 2) {
			answer = new TreeNode(val, root, null);
		}else {
			addOne(root, val, depth-2);
		}
        return answer;
    }
	
	public void addOne(TreeNode node, int val, int depth) {
		if(depth == 0) {
			TreeNode leftNode = new TreeNode(val, node.left, null);
			node.left = leftNode;
			TreeNode rightNode = new TreeNode(val, null, node.right);
			node.right = rightNode;
		}else {
			if(node.left!=null) {
				addOne(node.left, val, depth-1);
			}
			if(node.right!=null) {
				addOne(node.right, val, depth-1);
			}
		}
	}
}