package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

//Merge two sorted linked list to make one sorted list.
public class Problem3 {

    //With external space - returns new list.
    //T- O(N1+N2) S- O(N1+N2)
    public LinkedList method1(final LinkedList.Link head1,
                                   final LinkedList.Link head2)
    {
        LinkedList.Link h1 = head1;
        LinkedList.Link h2 = head2;
        LinkedList<Integer> newList = new LinkedList<>();

        while(h1 != null && h2!=null)
        {
            if((Integer)h1.getData()<=(Integer)h2.getData())
            {
                newList.addNode((Integer)h1.getData());
                h1=h1.next;
            }
            else {
                newList.addNode((Integer)h2.getData());
                h2=h2.next;
            }
        }
        if(h1!=null)
        {
          while (h1!=null)
          {
              newList.addNode((Integer)h1.getData());
              h1=h1.next;
          }
        }
        else
        {
            while (h2!=null)
            {
                newList.addNode((Integer)h2.getData());
                h2=h2.next;
            }
        }
        return newList;
    }

    //in Place sorting and merging
    //T: O(N1+N2) S:O(1)
    public LinkedList.Link method2(final LinkedList.Link head1, final LinkedList.Link head2)
    {
        LinkedList.Link l1,l2,swap,head;
        if((Integer)head1.getData()<(Integer)head2.getData())
        {
            l1=head1;
            l2=head2;
        }
        else {
            l1=head2;
            l2=head1;
        }
        head = l1;
        LinkedList.Link temp=null;
        while (l1!=null)
        {
            while (l1!=null && (Integer)l1.getData()<(Integer)l2.getData() ){
                temp=l1;
                l1=l1.next;
            }
            temp.next = l2;
            if(l1==null)
                break;
            swap = l1;
            l1 = l2;
            l2 = swap;
        }
        return head;
    }
}
