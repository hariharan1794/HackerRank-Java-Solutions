  static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
       SinglyLinkedListNode prev=head;
       SinglyLinkedListNode n=new SinglyLinkedListNode(data);
       if(head==null){
           return n;
       }
       
       while(null!=prev.next){

           prev=prev.next;
       }
        
         prev.next=n;
         return head;


    }
