/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempa = headA;
        ListNode tempb = headB;
        int counta = 0;
        int countb = 0;
        while(tempa!=null){
            counta++;
            tempa=tempa.next;
        }
        while(tempb!=null){
            countb++;
            tempb=tempb.next;
        }

        int size = 0;
        tempa = headA; tempb = headB;
        if(counta>countb){
            for(int i=0;i<counta-countb;i++){
                tempa = tempa.next;
            }
        }
        
        else{
            for(int i=0;i<countb-counta;i++){
                tempb = tempb.next;
            }
        }

        while(tempa!=tempb){
            tempa=tempa.next;
            tempb=tempb.next;
        }
        
        return tempa;
    }
}