import java.lang.Math;
//Definition for singly-linked list.
   class ListNode {
    int val;
    ListNode next;
     ListNode(int x) { val = x; }
 }
 
public class Solution {
int linked_length=0;
  ListNode p;  
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        //LinkedList Length
        p=head;
        ListNode n=head;
        int length=0;
        //System.out.println("outside while loop");
        while(n.next!=null){
        //System.out.println("inside while loop");
            length++;
            n=n.next;
        }
        length++;
        linked_length=length;
        System.out.println("linked_length: "+linked_length);
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int a= (int)(Math.random()*(linked_length));
        ListNode b=p;
        for(int i=0;i<a;i++){
            b=b.next;
        }
        return b.val;
    }


 public static void main(String[] args){
 ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next=null;
//System.out.println(head.next.next.val);
Solution solution = new Solution(head);
int d=solution.getRandom();
System.out.println("Random value is: "+d);
    
    
 }
}



//uses Reservior sampling
import java.lang.Math;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public class Solution {

    Random r=null;
    ListNode h=null;
    public Solution(ListNode head) {
        r = new Random();
        h = head;
    }
 
    /** Returns a random node's value. */
    public int getRandom() {
        int count=1;
        ListNode p = h;
        int result = 0;
        while(p!=null){
          if(r.nextInt(count)==0)
            result= p.val;
            count++;
            p = p.next;
        }
        return result;
    }
}

