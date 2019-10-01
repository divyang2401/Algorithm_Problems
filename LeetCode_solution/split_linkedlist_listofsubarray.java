class Solution {
    
    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode[] parts = new ListNode[k];
        int len = 0;
        
        ListNode curr=root;
        while(curr!=null){len++;}
        
        int n = len / k, r = len % k; // n : minimum guaranteed part size; r : extra nodes spread to the first r parts;
 
        ListNode node = root, prev = null;
        
        for (int i = 0; node != null && i < k; i++, r--) {
            parts[i] = node;// I need to provide head pointer of each list and end pointer to null
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) {
                prev = node;
                node = node.next;
            }
            prev.next = null;
        }
        return parts;        
    }
}