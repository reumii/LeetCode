// 876. Middle of the Linked List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
		ListNode middle = head;
        while(temp.next !=null) {
        	middle = middle.next;
        	if(temp.next.next!=null) {
        		temp = temp.next.next;
        	}else {
        		return middle;
        	}
        }
        return middle;
    }
}
