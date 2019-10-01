/*Static- Non Static  Nested Class and Objects*/
public class Main{
  class LinkedList{
      Node head;
     class Node{
        int data;
        Node next;
        Node(int d){data=d;next=null;}
    }
 }
 public void printList(Main.LinkedList.Node head) 
    { 
        Main.LinkedList.Node n =head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 

public static void main(String[] args){
Main p=new Main();
Main.LinkedList l=p.new LinkedList();
//LinkedList.Node t= new LinkedList.Node(1);
l.head= p.new LinkedList().new Node(1);
Main.LinkedList.Node second= p.new LinkedList().new Node(2);
Main.LinkedList.Node third= p.new LinkedList().new Node(3);
l.head.next=second;
second.next=third;
p.printList(l.head);     

}    
    
}

//------------------------------------------------------------------------------------
public class Main{
 static class LinkedList{
    static  Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;next=null;}
    }
 }
 public void printList() 
    { 
        Main.LinkedList.Node n = Main.LinkedList.head; 
        while (n != null) 
        { 
            System.out.print(n.data+" "); 
            n = n.next; 
        } 
    } 

public static void main(String[] args){
Main p=new Main();
LinkedList l= new LinkedList();
//LinkedList.Node t= new LinkedList.Node(1);
Main.LinkedList.head= new Main.LinkedList.Node(1);
Main.LinkedList.Node second= new Main.LinkedList.Node(2);
Main.LinkedList.Node third= new Main.LinkedList.Node(3);
Main.LinkedList.head.next=second;
second.next=third;
p.printList(); 
}    
    
}
