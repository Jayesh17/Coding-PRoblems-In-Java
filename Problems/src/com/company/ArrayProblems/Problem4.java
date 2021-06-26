package com.company.ArrayProblems;

public class Problem4 {
    int arr[] = new int[] {-2,1,-3,4,-1,2,1,-5,4,3,1,2,3};

    //O(N3)
    public void method1()
    {
        int sum=0;
        int curr_sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr.length; j++) {
                curr_sum=0;
                for (int k = i; k <= j; k++) {
                    curr_sum += arr[k];
                }
                if(curr_sum>sum)
                {
                    sum=curr_sum;
                }
            }
        }
        System.out.println("max sum is :"+sum);
    }

    //O(N2)
    public void method2()
    {
        int sum=0;
        int curr_sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            curr_sum=0;
            for (int j = i; j < arr.length; j++) {

                curr_sum+=arr[j];
                if(curr_sum>sum)
                {
                    sum=curr_sum;
                }
            }
        }
        System.out.println("max sum is :"+sum);
    }

    //kadane's algo : O(N)
    public void method3()
    {
        int max = arr[0];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum < 0)
            {
                sum=0;
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.println("max sum is :"+max);
    }
}
