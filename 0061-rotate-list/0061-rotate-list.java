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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode tail = head;
        int size = 1;
        while(tail.next!=null){
            tail=tail.next;
            size++;
        }

        int r = size - (k%size);
        while(r>1){
            temp = temp.next;
            r--;
        }

        tail.next = head;
        tail = temp;
        head = temp.next;
        tail.next = null;

        return head;
    }
}