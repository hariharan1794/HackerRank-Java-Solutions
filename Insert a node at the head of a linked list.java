 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
               
               SinglyLinkedListNode Ne=new SinglyLinkedListNode(data);
               
               if(llist==null){
                     return Ne;
               }          
                 Ne.next=llist;
                 llist=Ne;
                 return llist;
               

    }