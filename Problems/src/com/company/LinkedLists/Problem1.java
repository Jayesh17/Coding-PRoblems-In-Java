package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

//Reverse the linked list.
public class Problem1 {

    //O(N) space:O(1)
    public LinkedList.Link method1(LinkedList.Link head)
    {
        LinkedList.Link newHead=null;
        while(head != null)
        {
            LinkedList.Link next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
