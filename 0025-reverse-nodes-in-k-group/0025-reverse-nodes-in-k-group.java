/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    ListNode reverse(ListNode temp) {
        ListNode curr = temp;
        ListNode prev = null;
        while (curr != null) {
            ListNode nn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nn;
        }
        return prev;
    }

    ListNode getKthNode(ListNode temp, int k) {
        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;

        while (temp != null) {
            ListNode kthNode = getKthNode(temp, k);
            if (kthNode == null)
                break; 

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            ListNode reversedHead = reverse(temp);

            if(prevNode == null) {
                head = reversedHead; 
            }else{
                prevNode.next = reversedHead; 
            }

            temp.next = nextNode;
            prevNode = temp; 
            temp = nextNode; 
        }

        return head;
    }
}