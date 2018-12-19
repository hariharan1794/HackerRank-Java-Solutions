 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode prev=head;
        SinglyLinkedListNode curr;
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        int count=1;
        while(count<position){
                 prev=prev.next;
                 count++;
       }
            
       curr=prev.next;
       n.next=curr;
       prev.next=n;
       return head;

        }