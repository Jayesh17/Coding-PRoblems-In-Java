package com.company;

import com.company.ArrayProblems.*;
import com.company.DS_Algorithms.LinkedList;
import com.company.Hashing.Problem3;
import com.company.Hashing.Problem4;
import com.company.Hashing.Problem6;
import com.company.LinkedLists.Problem1;
import com.company.LinkedLists.Problem2;
import com.company.LinkedLists.Problem5;

import java.util.Random;

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

        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            list.addNode(r.nextInt(100));
        }
        list.displayList();

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

        Problem5 pb5 = new Problem5();
        pb5.method1(list);
        list.displayList();
    }
}
