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
        if(head == null || head.next ==  null) return null;
        ListNode temp = head;
        int s = 0;
        while(temp!=null){
            s++;
            temp = temp.next;
        }

        temp = head;
        int k = s-n;
        
        if(k == 0) return head.next;

        for(int i=0;i<k-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }
}