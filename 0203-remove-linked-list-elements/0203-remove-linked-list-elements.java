class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;  
            } else {
                temp = temp.next;  
            }
        }

        return head;    
    }
}
