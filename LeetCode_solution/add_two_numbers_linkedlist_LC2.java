/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
ListNode head;
public int lengthList(ListNode l){
            
     
        ListNode n=head;
        int count=0;
    while(n.next!=null){
        n=n.next;
        count+=1;
    }
        return count+1;
        
    }
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(0);
         head = n;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            n.next = cur;
            n = cur;
            
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
    System.out.println(lengthList(n));    
    return head.next;
    }
}        
            
            
        
        
        
        
    
