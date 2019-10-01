
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
public class Solution {
    
    public static ListNode reverseBetween(ListNode head, int m,int n) {
    
    
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode prev=null;
    ListNode current=dummy;
    ListNode following;
    
    for(int i=0;i<m;i++){
        prev=current;
        current=current.next;
    }
    ListNode current2=current;
    ListNode prev2=prev;
    
    int length=n-m;
    
    for(int j=m;j<=n;j++){
    following=current2.next;
    current2.next=prev2;
    prev2=current2;
    current2=following;
    }

    prev.next=prev2;
    current.next=current2;
    
    return dummy.next;   
          }     
        
    /*public static ListNode reverse(int m,int n, ListNode head, ListNode prev){
    
    ListNode previous=prev;
    ListNode current=head;
    ListNode following=head;
    int length=n-m;
    for(int i=m;i<length+2;i++){
    following=following.next;
    current.next=previous;
    previous=current;
    current=following;
    }
    return previous;
    }*/

        public static void printList(ListNode head){
        ListNode n=head;
        while (n != null) 
        { 
            System.out.print(n.val+" "); 
            n = n.next; 
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args){
    ListNode head=new ListNode(1); 
    ListNode second=new ListNode(2); 
    ListNode third=new ListNode(3); 
    ListNode fourth=new ListNode(4); 
    ListNode fifth=new ListNode(5); 
    ListNode sixth=new ListNode(6); 
    //ListNode seventh=l.new ListNode(30); 
    head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    fifth.next=sixth;
    sixth.next=null;
    //seventh.next=null;
ListNode newhead=reverseBetween(head,1,5);
//ListNode newhead=reverse(1,6,head,null);
printList(newhead);
    }
}