package com.company.twoPointers;

import java.util.HashMap;
import java.util.Random;

//Deep copy of linked list having naxt and random pointers.
public class Problem1 {
    public class Node<T>
    {
        private T data;
        Node next;
        Node random;

        Node(T data)
        {
            this.data = data;
            next = null;
            random = null;
        }

        Node(T data,Node next)
        {
            this.data = data;
            this.next = next;
            random = null;
        }
        public void addNext(Node next)
        {
            this.next = next;
        }
        public void addRandom(Node random)
        {
            this.random = random;
        }
    }
    public Node createRandomList()
    {
        Random r = new Random();
        Node n = new Node(r.nextInt());
        Node head = new Node(1);
        Node p1 = new Node(2);
        Node p2 = new Node(3);
        Node p3 = new Node(4);

        head.addNext(p1);
        p1.addNext(p2);
        p2.addNext(p3);

        head.addRandom(p2);
        p1.addRandom(p3);
        p3.addRandom(head);

        return head;
    }
    public void display(Node head)
    {
        System.out.println();
        Node p = head;
        while (p!=null)
        {
            System.out.print(p.data);
            if(p.random!=null)
            {
                System.out.print("("+p.random.data+")"+" ");
            }
            p=p.next;
        }
    }

    public void displayList(Node head)
    {
        System.out.println();
        Node p = head;
        while (p!=null)
        {
            System.out.print(p.data+" ");
            p=p.next;
        }
    }
    //using Hash : T- O(N) S-O(N)
    public Node method1(Node head)
    {
        HashMap<Node,Node> hash = new HashMap<>();
        Node temp = head;
        while (temp!=null)
        {
            Node n = new Node(temp.data);
            hash.put(temp,n);
            temp = temp.next;
        }
        temp = head;
        Node newTemp;
        while (temp!=null)
        {
            newTemp = hash.get(temp);
            newTemp.addNext(hash.get(temp.next));
            newTemp.addRandom(hash.get(temp.random));
            temp = temp.next;
        }

        return hash.get(head);
    }

    //linear : T(N+N+N) S-(1)
    public Node method2(Node head)
    {
        Node newHead=null;

        Node ptr1 = head;
        Node ptr2;
        while (ptr1!=null)
        {
            ptr2 = ptr1.next;
            Node n = new Node(ptr1.data);
            if (newHead==null)
                newHead = n;
            n.addNext(ptr2);
            ptr1.addNext(n);
            ptr1 = ptr2;
        }

        ptr1 = head;
        while (ptr1!=null)
        {
            if(ptr1.random!=null)
                ptr1.next.random = ptr1.random.next;
            ptr1=ptr1.next.next;
        }

        ptr1=head;
        newHead = head.next;
        while (ptr1!=null)
        {
            ptr2=ptr1.next.next;
            if(ptr2!=null)
                ptr1.next.next = ptr2.next;
            ptr1.next = ptr2;
            ptr1 = ptr2;
        }
        return newHead;
    }
}
