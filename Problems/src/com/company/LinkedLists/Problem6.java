package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

//Add 2 nums as a Linked LIst, return reversed sum as a Linked list.
public class Problem6 {

    public LinkedList method1(final LinkedList.Link head1, final LinkedList.Link head2)
    {
        LinkedList.Link l1 = head1;
        LinkedList.Link l2 = head2;
        int sum =0;
        int carry=0;
        LinkedList<Integer> newList = new LinkedList<>();
        while (l1!=null || l2!=null || carry>0)
        {
            sum=0;
            if(l1!=null)
            {
                sum = (sum + (int)l1.getData());
            }
            if(l2!=null)
            {
                sum = (sum + (int)l2.getData());
            }
            if(carry>0)
            {
                sum = sum+carry;
                if(l1==null && l2==null)
                {
                    sum = carry;
                }
            }
            carry = sum / 10;
            sum = sum % 10;
            newList.addNode(sum);
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return newList;
    }
}
