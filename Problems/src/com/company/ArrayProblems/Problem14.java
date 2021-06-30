package com.company.ArrayProblems;

//compute power function : pow(x,n)
public class Problem14 {

    Integer[] arr_x = {3,4,5,1,2};
    Integer[] arr_n = {2,-2,2,-3,-5};


    public <T>void printArray(T[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //brute-force Time- O(N)
    public void method1()
    {
        Double ans[] = new Double[arr_x.length];
        for (int i = 0; i < arr_x.length; i++) {
            double x = arr_x[i];
            double n = arr_n[i];
            if(n<0)
                n = -1 * n;
            double pow=1.0;
            for (int j = 1; j <= n; j++) {
                pow*=x;
            }
            if(arr_n[i]<0)
                pow = 1/pow;
            ans[i] = pow;
        }

        printArray(arr_x);
        printArray(arr_n);
        printArray(ans);
    }

    //Time : O(log2n)
    public void method2()
    {
        Double ans[] = new Double[arr_x.length];
        for (int i = 0; i < arr_x.length; i++) {
            double x = arr_x[i];
            double n = arr_n[i];
            if(n<0)
                n = -1 * n;
            double pow=1.0;

            while(n!=0)
            {
                if(n%2==0)
                {
                    x = x*x;
                    n=n/2;
                }
                else {
                    pow = pow * x;
                    n = n-1;
                }
            }
            if(arr_n[i]<0)
                pow = 1/pow;
            ans[i] = pow;
        }

        printArray(arr_x);
        printArray(arr_n);
        printArray(ans);
    }

}
