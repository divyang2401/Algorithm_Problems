import java.util.*;
public class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){data=d;next=null;}
    }
    
    public void printList(Node head){
        LinkedList.Node n=head;
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        }
        System.out.println("\n");
    }
    //non recursively
    public static int kthElementFromLast(LinkedList.Node head, int k){
        LinkedList.Node n=head;
        LinkedList.Node last;
        int length=0;
        while(n.next!=null){
            n=n.next;
            length++;
        }   
        length++;
        last=n;
        n=head;
    int i=0;
    while(i!=(length-k)){
    n=n.next;    
        
     i++;   
    }
    LinkedList.Node op=n;
        
    return n.data;    
    }
    
    public static void main(String[] args){
    LinkedList l = new LinkedList();
    l.head=l.new Node(10); 
    LinkedList.Node second=l.new Node(20); 
    LinkedList.Node third=l.new Node(30); 
    LinkedList.Node fourth=l.new Node(40); 
    LinkedList.Node fifth=l.new Node(50); 
    LinkedList.Node sixth=l.new Node(20); 
    LinkedList.Node seventh=l.new Node(30); 
    l.head.next=second;
    second.next=third;
    third.next=fourth;
    fourth.next=fifth;
    fifth.next=sixth;
    sixth.next=seventh;
    seventh.next=null;
    
    l.printList(l.head);    
    //LinkedList s=l.removeDups(l);
    //l.printList(s.head);    
    int k=kthElementFromLast(l.head,3);    
    System.out.println("Kth Element: "+k);
    }
    
    
    
    
    
    
}