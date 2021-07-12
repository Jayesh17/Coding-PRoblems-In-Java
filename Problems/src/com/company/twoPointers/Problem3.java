package com.company.twoPointers;

//Trapping water
public class Problem3 {


    private int max(int st,int end,int[] arr)
    {
        int m = 0;
        for (int i = st; i <= end ; i++) {
            if(arr[i]>m)
            {
                m=arr[i];
            }
        }
        return m;
    }

    private int min(int n1,int n2)
    {
        return (n1<n2)?n1:n2;
    }
    //brute-force : O(N2) O(1)
    public void method1(int[] arr)
    {
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            leftMax = max(0,i,arr);
            rightMax = max(i,arr.length-1,arr);
            result+= (min(leftMax,rightMax)-arr[i]);
        }
        System.out.println("stored  : "+result);
    }

    //Optimal : O(2N) O(2N)
    public void method2(int[] arr)
    {
        int result = 0;
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        int n = arr.length-1;
        int preMax = 0;
        int suffMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>preMax)
            {
                preMax = arr[i];
            }
            if(arr[n-i]>suffMax)
            {
                suffMax = arr[n-i];
            }
            prefix[i] = preMax;
            suffix[n-i] = suffMax;
        }

        /*System.out.println();
        for(int v : prefix)
        {
            System.out.print(v+" ");
        }

        System.out.println();
        for(int v :suffix)
        {
            System.out.print(v+" ");
        }*/

        for (int i = 0; i < arr.length; i++) {
             result+= (min(prefix[i],suffix[i])-arr[i]);
        }
        System.out.println("Stored : "+result);
    }

    //Optimal : O(N) O(1)
    public void method3(int[] arr)
    {
        int low = 0;
        int hi = arr.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int result = 0;

        while (low<=hi)
        {
            if(arr[low]<=arr[hi])
            {
                if(arr[low]>=leftMax)
                {
                    leftMax = arr[low];
                }
                else {
                    result+= (leftMax-arr[low]);
                }
                low++;
            }
            else {
                if(arr[hi]>=rightMax)
                {
                    rightMax = arr[hi];
                }
                else {
                    result+= (rightMax-arr[hi]);
                }
                hi--;
            }
        }

        System.out.println("stored : "+result);
    }
}
