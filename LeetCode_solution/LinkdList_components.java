/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
      
    
        ListNode n=head;
        int op=0;
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i: G){
            set.add(i);
        }
        while(n!=null){
            
        if(set.contains(n.val)&&((n.next==null)||!set.contains(n.next.val)))
            op++;
        n=n.next;
        
        }
               
        return op;     }
}