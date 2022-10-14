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
    public ListNode deleteMiddle(ListNode head) {
       ListNode temp = head;
		int cnt = 1;
		while(temp.next!=null) {
			temp = temp.next;
			cnt++;
		}
        
        if(cnt<=1) {
			return null;
		}
		
		temp = head;
		for(int i=1; i<cnt/2; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
        return head; 
    }
}