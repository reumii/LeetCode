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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
			size++;
		}
		
		if(size < n) {
			return head.next;
		}
		size -= n;
		
		temp = head;
		for(int i=0; i<size; i++) {
			head = head.next;
		}
		
		if(head.next!=null) {
			head.next = head.next.next;
		}
		
        return temp;
    }
}