package com.company;

import com.company.RecursionAndBackTracking.Problem1;
import com.company.RecursionAndBackTracking.Problem2;
import com.company.RecursionAndBackTracking.Problem3;
import com.company.StackAndQueue.Problem4;
import com.company.StackAndQueue.Problem5;

public class Main {

    public static void main(String[] args) {

            /*Problem1 pb1 = new Problem1();
            pb1.printArray();
            pb1.method1();
            pb1.method2();
            pb1.method3();*/

            /*Problem2 pb2 = new Problem2();
            pb2.method1();*/

            /*Problem3 pb3 = new Problem3();
            pb3.method2();*/

            /*Problem4 pb4 = new Problem4();
            pb4.method1();
            pb4.method2();
            pb4.method3();*/

            /*Problem5 pb5 = new Problem5();
            pb5.method2();
            pb5.method3();*/

            /*int a[] = new int[]{4,1,6,2,8,7,9};


            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+"");
            }
            MergedSort.mergeSort(a,0,a.length-1);

            System.out.println();
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+"");
            }*/

            /*Problem6 pb6 = new Problem6();
            pb6.method1();*/

            /*Problem7 pb7 = new Problem7();
            pb7.method1();*/

            /*Problem8 pb8 = new Problem8();
            pb8.question1(10);
            pb8.question2(9);
            System.out.println();
            System.out.println(pb8.question3(9,2));*/

            /*Problem9 pb9 = new Problem9();
            pb9.method2();*/

            /*Problem11 pb11 = new Problem11();
            pb11.method1();*/

            /*Problem12 pb12 = new Problem12();
            pb12.method1();
            pb12.method2();*/

            /*Problem13 pb13 = new Problem13();
            pb13.prob_1_1(1430);
            pb13.prob1_2(120);
            pb13.prob1_2(149);
            pb13.prob1_2(1);
            pb13.prob2_1(42);
            pb13.prob2_1(81);
            pb13.prob2_1(4);
            pb13.prob2_1(15);
            pb13.prob1_3(120);
            pb13.prob1_3(149);
            pb13.prob1_3(1);
            pb13.prob1_3(33);*/

           /* Problem14 pb14 = new Problem14();
            pb14.method1();
            pb14.method2();*/

            /*Problem15 pb15 = new Problem15();
            pb15.method1();
            pb15.method2();*/

            /*Problem16 pb16 = new Problem16();
            pb16.method1();
            pb16.method2();*/

            /*Problem17 pb17  = new Problem17();
            pb17.method1();
            pb17.method2();
            pb17.method3();*/

        //Hashing

            /*Problem1 pb1 = new Problem1();
            pb1.method2();*/

            /*Problem2 pb2 = new Problem2();
            pb2.method1(12);*/

            /*Problem3 pb3 = new Problem3();
            pb3.method1();
            pb3.method2();*/

            /*Problem4 pb4 = new Problem4();
            pb4.method1();
            pb4.method2();*/

            /*Problem5 pb5 = new Problem5();
            pb5.method1(6);
            pb5.method2(6);*/

            /*Problem6 pb6 = new Problem6();
            pb6.method1();
            pb6.method2();*/

            /*LinkedList<Integer> list = new LinkedList<>();
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                list.addNode(r.nextInt(100));
            }
            list.displayList();*/

            /*Problem1 pb1 = new Problem1();
            LinkedList.Link newhead = pb1.method1(list.getFirst());
            list.setFirst(newhead);
            list.displayList();*/

            /*Problem2 pb2 = new Problem2();
            LinkedList.Link mid1 = pb2.method1(list.getFirst());
            System.out.println();
            mid1.display();
            LinkedList.Link mid2 = pb2.method2(list.getFirst());
            System.out.println();
            mid2.display();*/

            /*Problem5 pb5 = new Problem5();
            pb5.method1(list);
            list.displayList();*/

            /*LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            LinkedList<Integer> list3 = new LinkedList<>();

            for (int i = 0; i < 3; i++) {
                list1.addNode(i*2+12);
            }

            for (int i = 0; i < 5; i++) {
                list2.addNode(i*4+15);
            }

            for (int i = 0; i < 5; i++) {
                list3.addNode(i*8+11);
            }
            list1.displayList();
            list2.displayList();
            list3.displayList();

           list1.mergeList(list1.getLast(),list3.getFirst());
            list1.mergeList(list2.getLast(),list3.getFirst());

        list1.displayList();
        list2.displayList();*/
            /*Problem3 pb3 = new Problem3();
            LinkedList<Integer>result =pb3.method1(list1.getFirst(),list2.getFirst());
            result.displayList();

            LinkedList.Link result1= pb3.method2(list1.getFirst(),list2.getFirst());
            LinkedList.displayListByHead(result1);*/

            /*Problem4 pb4 = new Problem4();
            LinkedList.Link result =pb4.method2(list.getFirst(),9);
            LinkedList.displayListByHead(result);*/

            /*LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            list1.addNode(4);
            list1.addNode(1);
            list1.addNode(6);
            list1.addNode(6);
            list1.addNode(6);

            list2.addNode(9);
            list2.addNode(9);
            list2.addNode(9);
            list2.addNode(9);
            list2.addNode(9);
            list2.addNode(9);

            list1.displayList();
            list2.displayList();

            Problem6 pb6 = new Problem6();
            LinkedList<Integer> result = pb6.method1(list2.getFirst(),list1.getFirst());
            result.displayList();*/

        //Problem8 mate navi class banavi pdse LinkList ni so khali concept
        //take 2 pointers : slow and fast, pointng to head, loop till fast.next == null & fast
        // .next.next == null, move slow +1 , fast + 2 and check if slow==fast in loop, if it is
        // = return true, else return false.

        /*Problem7 pb7 = new Problem7();
        pb7.method1(list1.getFirst(),list2.getFirst());
        pb7.method2(list1.getFirst(),list2.getFirst());
        pb7.method3(list1.getFirst(),list2.getFirst());
        pb7.method4(list1.getFirst(),list2.getFirst());*/

        /*LinkedList<Integer> l = new LinkedList<>();
        l.addNode(1);
        l.addNode(2);
        l.addNode(3);
        l.addNode(1);
        //l.addNode(1);
        l.addNode(2);
        l.addNode(1);

        Problem10 pb10 = new Problem10();
        pb10.method1(l.getFirst());
        pb10.method2(l.getFirst());*/

        /*LinkedList<Integer> l = new LinkedList<>();
        LinkedList.Link l1 = l.createNode(10);
        LinkedList.Link l2 = l.createNode(11);
        LinkedList.Link l3 = l.createNode(12);
        LinkedList.Link l4 = l.createNode(13);

        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);

        Problem13 pb13 = new Problem13();
        LinkedList.displayListByHead(l1);
        LinkedList.Link newHead = pb13.method1(l1,12);
        LinkedList.displayListByHead(newHead);*/

        /*Problem8 pb8 = new Problem8();
        pb8.method1(l1);
        pb8.method2(l1);*/

        /*Integer[] arr = {1,1,1,2,3,3,3,4};
        Problem4 pb4 = new Problem4();
        //pb4.method1(arr);
        pb4.method2(arr);
*/
        /*Problem5 pb5 = new Problem5();
        pb5.method1();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);


        list.remove(3);*/
        //Enumeration<Integer> e = s.elements();

        /*Problem18 pb18 = new Problem18();
        pb18.method1("abcd");*/

        /*Problem1 pb1 = new Problem1();
        List<Integer> res = pb1.findNumbers("110101");
        res.forEach(val -> System.out.println(val + " "));*/

        /*Problem1 pb1 = new Problem1();
        Problem1.Node head = pb1.createRandomList();
        pb1.display(head);
        Problem1.Node h1 = pb1.method1(head);
        pb1.display(h1);

        Problem1.Node h2 = pb1.method2(head);
        pb1.display(h2);*/

        /*HashSet<ArrayList<Integer>> hash = new HashSet<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(3);
        a1.add(2);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        hash.add(a1);
        hash.add(a2);

        hash.forEach(l -> {
            System.out.println(l);
        });*/

        /*Problem2 pb2 = new Problem2();
        int[] arr = {-1,0,1,2,-1,-4};
        HashSet<List<Integer>> list1 = pb2.method1(arr);
        List<List<Integer>> list2 = pb2.method2(arr);

        list1.forEach(l -> {
            System.out.println(l);
        });

        list2.forEach(l -> {
            System.out.println(l);
        });
    }*/

        /*Problem3 pb3 = new Problem3();
        pb3.method1(new int[]{0, 1, 0, 2, 1, 0, 1, 3});
        pb3.method2(new int[]{0, 1, 0, 2, 1, 0, 1, 3});
        pb3.method3(new int[]{0, 1, 0, 2, 1, 0, 1, 3});*/

/*
        Problem1 pb1 = new Problem1();
        pb1.method1(new int[]{1,3,0,5,8,5},new int[]{2,4,6,7,9,9},6);*/

        /*Problem2 pb2 = new Problem2();
        System.out.println(pb2.method1(new int[]{120,50,550,200,700,850},new int[]{600,550,700,
                500,900,1000},6));
*/
        /*List<Job> jobs = new ArrayList<>();
        jobs.add(new Job(1,20,4));
        jobs.add(new Job(2,60,5));
        jobs.add(new Job(3,70,6));
        jobs.add(new Job(4,65,6));
        jobs.add(new Job(5,25,4));
        jobs.add(new Job(6,80,2));
        jobs.add(new Job(7,10,2));
        jobs.add(new Job(8,22,2));

        Problem3 pb3 = new Problem3();
        pb3.method1(jobs);*/

        /*Problem4 pb4 = new Problem4();
        pb4.method1(31);*/

       /* Problem5 pb5 = new Problem5();
        pb5.method1(new int[]{100,60,120},new int[]{20,10,20},50);*/

        /*Problem1 pb1 = new Problem1();
        pb1.push(1);
        pb1.push(2);
        pb1.push(3);
        pb1.push(4);
        System.out.println(pb1.top());
        pb1.pop();
        pb1.pop();
        System.out.println(pb1.top());
*/
        /*Problem2 pb2 = new Problem2();
        pb2.push(1);
        pb2.push(2);
        pb2.push(3);
        pb2.push(4);
        System.out.println(pb2.top());
        pb2.pop();
        pb2.pop();
        System.out.println(pb2.top());*/

        /*Problem3 pb3 = new Problem3();
        pb3.method1("((()())");*/

        /*Problem4 pb4 = new Problem4();
        pb4.method1(new int[]{5,2,7,8,9,1,2,5,11,10});
        Problem5 pb5 = new Problem5();
        pb5.method1(new int[]{5,2,7,8,9,1,2,5,11,10});*/

        /*Problem1 pb1 = new Problem1();
        pb1.method1(new int[]{1,2,1});
        pb1.method2(new int[]{1,2,1})*/;
/*

        Problem2 pb2 = new Problem2();
        pb2.method1(new int[]{1,2,3});
*/

        Problem3 pb3 = new Problem3();
        pb3.method1(new int[]{1,2,3});
    }
}
