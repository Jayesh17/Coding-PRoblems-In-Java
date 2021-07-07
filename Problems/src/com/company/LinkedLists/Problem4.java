package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

//Remove nth node from the back
public class Problem4 {

    //T-O(2N) , S- O(1)
    public LinkedList.Link method1(LinkedList.Link head,int n)
    {
        LinkedList.Link h1 = head;
        int cnt = 1;
        while(h1.next!=null)
        {
            h1=h1.next;
            cnt++;
        }
        int target = cnt-n;
        if(target<0)
            return head;

        if(target==0)
        {
            LinkedList.Link temp = head;
            head=head.next;
            temp=null;
            return head;
        }

        cnt = 1;
        h1=head;
        while(cnt<target)
        {
            h1=h1.next;
            cnt++;
        }

        LinkedList.Link temp = h1.next;
        h1.next = h1.next.next;
        temp.next = null;
        temp = null;
        return head;
    }

    public LinkedList.Link method2(LinkedList.Link head,int n)
    {
        LinkedList.Link slow,fast;
        slow=head;
        fast=head;
        int cnt=1;
        while(cnt!=n)
        {
            fast = fast.next;
            cnt++;
        }
        if(fast.next==null)
        {
            LinkedList.Link temp = head;
            head=head.next;
            temp=null;
            return head;
        }
        while (fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        LinkedList.Link temp = slow.next;
        slow.next=temp.next;
        temp.next=null;
        temp=null;
        return head;
    }
}
