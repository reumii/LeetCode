/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> answer = new ArrayList(new ArrayList<Integer>());
        List<Integer> list = new ArrayList();

        Queue<Node> q = new LinkedList<Node>();
        if(root != null) {
            q.add(root);
        }
        int size = 1;
        while(!q.isEmpty()) {
            Node n = q.poll();
            list.add(n.val);
            for(Node c : n.children) {
                q.add(c);
            }
            size--;
            if(size == 0) {
                answer.add(list);
                list = new ArrayList();
                size = q.size();
            }
        }
        return answer;
    }
}