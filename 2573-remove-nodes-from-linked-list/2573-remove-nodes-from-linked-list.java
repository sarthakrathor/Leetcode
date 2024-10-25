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
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        
        while(cur != null){
            ListNode nn = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nn;
        }

        ListNode newHead = new ListNode(prev.val);
        int max = newHead.val;
        cur = prev.next;
        while(cur!=null){
            if(cur.val>=max){
            // else{
                ListNode node = new ListNode(cur.val);
                node.next = newHead;
                newHead = node;
                max = node.val;
            }
            cur=cur.next;
        }return newHead;

    }
}