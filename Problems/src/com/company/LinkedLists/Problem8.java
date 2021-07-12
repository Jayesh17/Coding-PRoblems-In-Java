package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

import java.time.temporal.Temporal;
import java.util.HashSet;

//detect a cycle in the list.
//Problem 11: return that node or null;
public class Problem8 {

    //By using hash: T- O(N) , S - O(N)
    public void method1(LinkedList.Link head)
    {
        HashSet<LinkedList.Link> hash = new HashSet<>();
        LinkedList.Link temp = head;
        LinkedList.Link node = null;
        while (temp != null)
        {
            if(hash.contains(temp))
            {
                node = temp;
                break;
            }
            else {
                hash.add(temp);
                temp=temp.next;
            }
        }

        if(node!=null)
        {
            System.out.println("Starting point of a cycle: "+node.getData());
        }
        else {
            System.out.println("No cycle.");
        }
    }

    //By using tortoes method - slow and fast pointers
    //T - O(N) S- O(1)
    public void method2(LinkedList.Link head)
    {
        LinkedList.Link slow=head;
        LinkedList.Link fast=head;
        LinkedList.Link temp = head;
        boolean check=true;
        while (check = fast.next!=null && fast.next.next!=null)
        {
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast)
                {
                    while(temp!=slow)
                    {
                        temp = temp.next;
                        slow = slow.next;
                    }
                    break;
                }
        }

        if(!check)
        {
            System.out.println("No Cycle");
        }
        else {
            System.out.println("Cycle starts on "+ temp.getData());
        }
    }
}
