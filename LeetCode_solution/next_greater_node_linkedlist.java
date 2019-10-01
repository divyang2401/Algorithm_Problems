/*Brute Force solution*/
class Solution {
    public int[] nextLargerNodes(ListNode head) {
    
    ListNode n;
    ListNode p=head;
    int max=Integer.MIN_VALUE;
    int i=-1;
    int j=0;
//    boolean flag=true;
  ListNode a=head;
        while(a!=null){
            j++;//1,(2),2(1),3(5)
            a=a.next;
        }
    int op[]=new int[j];
    while(p!=null){
    boolean change_max=false;
        ++i;
        n=p.next;
        max=p.val;
        while(n!=null){
            
            if(n.val>max){
                max=n.val;
                change_max=true;
                break;
            }
            n=n.next;
        }

        if(!change_max){
            max=0;
        }
    op[i]=max;
        p=p.next;
    }
    return op;}

        
    
}