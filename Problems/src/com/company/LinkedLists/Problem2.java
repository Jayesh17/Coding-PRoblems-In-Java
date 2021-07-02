package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

//Find the middle of the linked list, if even then n/2+1;
public class Problem2 {

    //Time: O(N+N/2) //s:O(1)
    public LinkedList.Link method1(LinkedList.Link head)
    {
        int count=0;
        LinkedList.Link temp = head;
        while(temp.next!=null)
        {
            count++;
            temp = temp.next;
        }
        int mid = (count%2==0)?(count/2):(count/2)+1;
        temp=head;

        while(mid!=0)
        {
            temp=temp.next;
            mid--;
        }
        return temp;
    }

    //tortoese method: O(N/2),O(1)
    public LinkedList.Link method2(LinkedList.Link head)
    {
        LinkedList.Link slow= head;
        LinkedList.Link fast = head;

        while(fast.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
            if(fast==null)
                break;
        }
        return slow;
    }
}
