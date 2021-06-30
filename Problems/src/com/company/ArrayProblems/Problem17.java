package com.company.ArrayProblems;

import java.util.Arrays;

//Find the unique paths.
//only bottom and right
public class Problem17 {

    //recursively go to the individual path and return successful paths.
    //Time in expontencial
    public int findUniquePaths_1(int i ,int j,int colSize,int rowSize,int finalI,int finalJ)
    {
        if(i == rowSize || j == colSize)
            return 0;
        if(i == finalI && j == finalJ)
            return 1;
        else
            return (findUniquePaths_1(i+1,j,colSize,rowSize,finalI,finalJ) + findUniquePaths_1(i,
                    j+1,
                    colSize,rowSize,finalI,finalJ));
    }
    public void method1()
    {
            System.out.println("Total paths : "+findUniquePaths_1(0,0,3,3,2,1));
    }

    //Recursion with dynamic programming and hashing
    //Time : O(n*m) space : O(2*(n*m))
    public int findUniquePaths_2(int i ,int j,int colSize,int rowSize,int finalI,int finalJ,
                                 int[][] hash)
    {
        if(i == rowSize || j == colSize)
            return 0;
        if(i == finalI && j == finalJ)
            return 1;
        if(hash[i][j] != -1)
            return hash[i][j];
        else
            return hash[i][j]=
                    (findUniquePaths_2(i+1,j,colSize,rowSize,finalI,finalJ,hash) + findUniquePaths_2(i,
                    j+1,
                    colSize,rowSize,finalI,finalJ,hash));
    }
    public void method2()
    {
        final int rowSize = 3;
        final int colSize = 3;
        int[][] hash = new int[rowSize][colSize];
        for (int i = 0; i < hash.length; i++) {
            Arrays.fill(hash[i],-1);
        }
        System.out.println("Total paths : "+findUniquePaths_2(0,0,3,3,2,1,hash));
    }

    // By combination Formula, only works when start is 0,0 and end is m-1,n-1
    //Time : O(m-1) or O(n-1)
    //Space : O(1)
    public void method3()
    {
        final int rowSize = 3;
        final int colSize = 3;
        int N = rowSize+colSize-2;
        int R = colSize-1;
        double res = 1.0;
        for (int i = 1; i <= colSize; i++) {
            res*=((N-R+i)/i);
        }
        System.out.println("Total paths : "+res);
    }
}
