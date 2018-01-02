// Java program for reversing the linked list
 
class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    
    Node reverseCircularList(Node node) {
    	if(node != null){
    		Node prev = null;
            Node current = node;
            Node next = null;
            
           do{
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            } while (current != node);
            current.next=prev;
            node = prev;
    	}
        
        return node;
    }
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    void printCircularList(Node node) {
    	if(node!=null){
    		Node currentNode = node;
    		do{
    			 System.out.print(currentNode.data + " ");
    	         currentNode = currentNode.next;
    		}while(currentNode != node);
    	}
    }
 
    public static void main(String[] args) {
    	LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
        
        head = list.deleteNode(head,5);
        System.out.println("");
        System.out.println("After deletion linked list ");
        list.printList(head);
        
        LinkedList circularList = new LinkedList();
        circularList.head = new Node(85);
        circularList.head.next = new Node(15);
        circularList.head.next.next = new Node(4);
        circularList.head.next.next.next = new Node(20);
        circularList.head.next.next.next.next=list.head;
        System.out.println("Given Circular Linked list");
        list.printCircularList(head);
        head = list.reverseCircularList(head);
        System.out.println("");
        System.out.println("Reversed Circular linked list ");
        list.printCircularList(head);
        
        LinkedList list2 = new LinkedList();
        list2.head = new Node(1);
        list2.head.next =new Node(2);
        list2.head.next.next = new Node(3);
        list2.head.next.next.next = new Node(4);
        list2.head.next.next.next.next = new Node(5);
        list2.head.next.next.next.next.next = new Node(6);
        list2.head.next.next.next.next.next.next =
        		new Node(7);
        list2.head.next.next.next.next.next.next.next =
        		new Node(8);
        System.out.println("Given Linked list");
        list.printList(list2.head);
        list2.head = deleteKthNode(list2.head,2);
        System.out.println("");
        System.out.println("linked list after deletion");
        list.printList(list2.head);
        
    }

	private static Node deleteKthNode(Node start, int k) {
		if(start==null || k < 1){
			return start;
		}else if(k==1){
			return null;
		}
		int count=0;
		Node current = start;
		Node prev = null;
		while(current != null){
			count++;
			if(count==k){
				prev.next=prev.next.next;
				count=0;
			}
			if(count!=0){
				prev=current;
			}
			current=prev.next;
		}
		return start;	
	}

	private Node deleteNodeRecursive(Node start, int i) {
		if(i<1|| start==null){
			return start;
		}
		if(i==1){
			return start.next;
		}
		start.next=deleteNodeRecursive(start.next, i-1);
		return start;
	}
	
	private Node deleteNode(Node start, int k) {
		if(start==null || k < 0){
			return start;
		}
		if(k==0){
			return start.next;
		}
		Node current = start;
		for(int i=1;i<k;i++){
			current=current.next;
		}
		if(current!=null && current.next!=null){
			current.next=current.next.next;
		}
		return start;
	}
}
 
 
// This code has been contributed by Mayank Jaiswal