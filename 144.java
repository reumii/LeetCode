// 144. Binary Tree Preorder Traversal
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList();
        
        if(root != null) {
        	answer.add(root.val);
            if(root.left != null) answer.addAll(preorderTraversal(root.left));
            if(root.right != null) answer.addAll(preorderTraversal(root.right));
        } 
        
        return answer;
    }
}
