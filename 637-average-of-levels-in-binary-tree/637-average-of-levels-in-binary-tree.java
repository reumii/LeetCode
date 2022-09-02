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
import java.util.*;
class Solution {
    public static HashMap<Integer,List<Integer>> map;
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> answer = new ArrayList();
        map = new HashMap();
        rootCheck(0, root);

        for(Integer level: map.keySet()) {
            List<Integer> list = map.get(level);
            int cnt = list.size();
            long sum = 0;
            for(int i=0; i<cnt; i++) {
                sum += list.get(i);
            }
            answer.add(sum/(double)cnt);
        }
        return answer;
    }

    public static void rootCheck(int level, TreeNode tree) {
        List<Integer> list = map.getOrDefault(level,new ArrayList());
        list.add(tree.val);
        map.put(level, list);

        if(tree.left != null) {
            rootCheck(level+1,tree.left);
        }
        if(tree.right != null) {
            rootCheck(level+1,tree.right);
        }
    }
}