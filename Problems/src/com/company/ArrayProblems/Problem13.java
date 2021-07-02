package com.company.ArrayProblems;

//Search an element in 2d Matrix

//Prob1
// Cond: all the rows are sorted from l to r, and first element of a row is always greater than
// the previous row's last element.

import com.company.DS_Algorithms.BinarySearch;

//Prob2
//Cond: all rows and all the columns are sorted.but not the second case of upper prob.
public class Problem13 {
    int[][] arr1 = {
            {1,2,3,4},
            {50,120,121,130},
            {142,143,149,150}
    };
    int[][] arr2 = {
            {1,2,3,4},
            {13,42,79,130},
            {15,50,81,138}
    };
    //binary search on every row;
    public void prob_1_1(int target)
    {
        int resultIND=-1;
        BinarySearch b = new BinarySearch();
        for (int i = 0; i < arr1.length; i++) {
            resultIND = b.binarySearch(arr1[i],0,arr1[i].length-1,target);
            if(resultIND != -1)
            {
                System.out.println(target+" found at ("+i+","+resultIND+")");
                return;
            }
        }
        System.out.println(target+" Not found");
    }

    public void prob1_2(int target)
    {
        int row_size = arr1.length;
        int col_size = arr1[0].length;

        int i=0;
        int j = col_size-1;
        while((i<row_size && i>=0) && (j<col_size && j>=0))
        {
                if(arr1[i][j] == target)
                {
                    System.out.println(target+" found at ("+i+","+j+")");
                    return;
                }
                if(target > arr1[i][j])
                {
                    i++;
                }
                else
                {
                    j--;
                }
        }
        System.out.println(target+"Not found");
    }

    public void prob2_1(int target)
    {
        int row_size = arr2.length;
        int col_size = arr2[0].length;

        int i=0;
        int j = col_size-1;
        while((i<row_size && i>=0) && (j<col_size && j>=0))
        {
            if(arr2[i][j] == target)
            {
                System.out.println(target+" found at ("+i+","+j+")");
                return;
            }
            if(target > arr2[i][j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        System.out.println(target+"Not found");
    }

    //Time : O(log2(m*n))
    public void prob1_3(int target)
    {
        int row = arr1.length;
        int col = arr1[0].length;

        int low = 0;
        int high = (row*col)-1;

        while(low <= high)
        {
            int mid = low + (high- low)/2;
            if(arr1[mid/col][mid % col] == target)
            {
                System.out.println(target+" found");
                return;
            }
            if(arr1[mid/col][mid % col] < target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        System.out.println(target+" Not found");
    }
}
