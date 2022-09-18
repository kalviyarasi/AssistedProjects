package project3;
public class CircularInsertion {      
        public class Node{    
            int data;    
            Node next;    
            public Node(int data) {    
                this.data = data;    
            }    
        }        
        public Node head = null;    
        public Node tail = null;        
        public void addAtEnd(int data){    
            Node newNode = new Node(data);       
            if(head == null) {       
                head = newNode;    
                tail = newNode;    
                newNode.next = head;    
            }    
            else {       
                tail.next = newNode;     
                tail = newNode;    
      
                tail.next = head;    
            }    
        }    
          
        public void display() {    
            Node current = head;    
            if(head == null) {    
                System.out.println("List is empty");    
            }    
            else {    
                System.out.println("insertion at the circularlinked list: ");    
                 do{        
                    System.out.print(" "+ current.data);    
                    current = current.next;    
                }while(current != head);    
                System.out.println();    
            }    
        }    
            
        public static void main(String[] args) {    
            CircularInsertion cl = new CircularInsertion();    
                
            //Adding 1 to the list    
            cl.addAtEnd(1);    
            cl.display();    
            //Adding 2 to the list    
            cl.addAtEnd(2);    
            cl.display();    
            //Adding 3 to the list    
            cl.addAtEnd(3);    
            cl.display();    
            //Adding 4 to the list    
            cl.addAtEnd(4);    
            cl.display();    
        }    
}    