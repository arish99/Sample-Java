import java.util.Stack;

public class LinkedList {
    class Node{
        int data;Node next;
        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    Node head = null;
    void insertAtEnd(int d)
    {
        if(head==null)
        {
            head  = new Node(d);
            return;
        }
        Node t = head;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next = new Node(d);
    }
    void insertAtHead(int d)
   {
    if(head==null)
    {
        head  = new Node(d);
        return;
    }
    Node n = new Node(d);
    n.next = head;
    head = n;
   }
   void insertAtPos(int d,int p)
   {
       Node n = new Node(d);
       Node t = head;
       for(int i=1;i<p-1;i++)//1->2->3->4->5
       {
           t=t.next;
       }
       n.next = t.next;
       t.next = n;

   }
   void deleteAtEnd()
   {
       if(head==null)
       {
           System.out.print("List is empty");
           return;
       }
       if(head.next==null)
       {
           head=null;
           return;
       }
       Node p = null;
       Node t = head;
       while(t.next!=null)
       {
           p=t;
           t=t.next;
       }
       p.next = null;
   }
   void deleteAtHead()
   {
       if(head==null)
       {
           System.out.print("List is empty");
           return;
       }
       head = head.next;
   }
   void deleteAtPos(int pos)
   {
       Node t = head;
       for(int i=1;i<pos-1;i++)
       {
           t=t.next;
       }
       t.next = t.next.next;
   }
   void dataReverse(){
       Stack<Integer> stk = new Stack<>();
       Node t = head;
       while(t!=null)
       {
           stk.push(t.data);
           t=t.next;
       }
       t = head;
       while(t!=null)
       {
           t.data = stk.pop();
           t=t.next;
       }
   }
   void reverse()
   {
       Node p = head;
       Node q = null;
       Node r = null;
       while(p!=null)
       {
           r = q;
           q = p;
           p = p.next;
           q.next=r;
       }
     head = q;
   }
   void recReverse()
   {
       head = rec(head);
   }
   Node rec(Node p)
   {
       Node h;
       if(p.next==null)
       {
           h = p;
           return h;
       }
       h = rec(p.next);
       Node q = p.next;
       q.next = p;
       p.next=null;
       return h;
   }
   void recDisplayReverse(Node n){
       if(n.next!=null)
       {
           recDisplayReverse(n.next);
       }
       System.out.print(n.data+"->");
   }
   void deleteAlternate(Node p)
   {
       if(p==null)
       {
           return;
       }
       Node n = p.next;
       if(n==null)
       {
           return;
       }
       p.next = n.next;
       
   }
   void printList()
   {
       if(head==null)
       {
           System.out.print("List is empty");
           return;
       }
       Node t = head;
       while(t!=null)
       {
           System.out.print(t.data+"->");
           t=t.next;
       }
   }
   public static void main(String[] args) {
       LinkedList ob = new LinkedList();
       ob.insertAtEnd(10);
       ob.insertAtEnd(20);
       ob.insertAtEnd(30);
       ob.insertAtHead(49);
       ob.insertAtEnd(50);
       //ob.recDisplayReverse(ob.head);
       ob.printList();
   }

}
