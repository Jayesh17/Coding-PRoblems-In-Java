package com.company.ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {

    //Print whole the pascal array for the given number
    // time O(N2).same space
    public void question1(int num) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row, pre = null;
        for (int i = 0; i < num; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = row;
            pascal.add(row);
        }

        for (int i = 0; i < num; i++) {
                System.out.println();
                System.out.print(pascal.get(i)+" ");
        }
    }
    public int fact(int st,int end)
    {
        int factn = 1;
        while (true)
        {
            if(end==0)
                break;
            factn*=st;
            st--;
            end--;
        }
        return factn;
    }
    //just print the given row of pascal
    public void question2(int num)
    {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < num; i++) {
            row.add((fact(num,i)/fact(i,i)));
        }
        row.add(1);
        for (int i = 0; i <= num; i++) {
            System.out.print(row.get(i)+" ");
        }
    }

    //for specific col: 5 of 3
    public int question3(int row,int col)
    {
        if(col == 0 || col == row)
        {
            return 1;
        }
        return (fact(row,col-1)/fact(col-1,col-1));
    }
}
