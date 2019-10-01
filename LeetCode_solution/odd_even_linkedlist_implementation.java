/**
 * Definition for singly-linked list.
 */
  class ListNode {
 int data;
      ListNode next;
      ListNode(int x) { data = x; }
  }

public class Solution {
    public static ListNode oddEvenList(ListNode head) {
    
 if(head==null){return head;}
    if(head.next==null){return head;}
    ListNode p1=head;
    ListNode p2=p1.next;
    ListNode connectedNode=head.next;
    
    while(p1!=null && p2!=null){
        
        ListNode t=p2.next;
        if(t==null){break;}
        p1.next=p2.next;
        p1=p1.next;
        
        p2.next=p1.next;
        p2=p2.next;
        
    }
    
    p1.next=connectedNode;
    
    return head;
    
    }
    
    public static void printList(ListNode head){
        ListNode n=head;
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
    //ListNode l = new ListNode();
    ListNode head=new ListNode(10);
    ListNode second= new ListNode(10);
    ListNode third=new ListNode(30); 
    ListNode fourth=new ListNode(40); 
    ListNode fifth=new ListNode(50); 
    ListNode sixth=new ListNode(20); 
    ListNode seventh=new ListNode(30); 
    head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    fifth.next=sixth;
    sixth.next=seventh;
    seventh.next=null;
    
    printList(head);    
    oddEvenList(head);
    System.out.println("After..");
    printList(head);
    }
}