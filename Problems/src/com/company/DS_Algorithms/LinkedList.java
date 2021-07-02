package com.company.DS_Algorithms;

public class LinkedList<T> {

    public class Link
    {
        private T data;
        public Link next;

        Link(T data)
        {
            this.data = data;
            next=null;
        }
        public T getData()
        {
            return data;
        }
        public void display()
        {
            System.out.print(data+" ");
        }
    }

    private Link first;
    private Link last;
    private int count;
    public LinkedList()
    {
        count=0;
        first=null;
        last= null;
    }
    public int totalSize()
    {
        return count;
    }
    public void addFirst(T data)
    {
        Link newNode = new Link(data);
        newNode.next = first;
        first = newNode;
        count++;
    }
    public Link getFirst()
    {
        return first;
    }
    public void setFirst(Link head)
    {
        first = head;
    }
    public void addNode(T data)
    {
        count++;
        Link newNode = new Link(data);
        if(first == null)
        {
            first = newNode;
            last=newNode;
            return;
        }
        last.next = newNode;
        last = newNode;
    }
    public void displayList()
    {
        Link curr = first;
        while(curr != null)
        {
            curr.display();
            curr= curr.next;
        }
    }
    public void deleteNodeExceptLast(Link node)
    {
        Link temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        temp.next = null;
        temp=null;
    }
}