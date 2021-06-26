package com.company.ArrayProblems;

//merged two sorted arrays
public class Problem3 {
    int first[] = new int[] {1,6,8,8,8,12,15,20};
    int second[] = new int[] {2,2,2};

    public void printArray(int[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    //it will create new sorted array
    //space: O(N);
    //time : O(N);
    public void method1()
    {
        int FN= first.length;
        int SN= second.length;
        int third[] = new int[first.length+second.length];
        int FP = 0;
        int SP = 0;
        int TP = 0;

        while(FP != FN && SP != SN)
        {
            if(first[FP] <= second[SP])
            {
                third[TP] = first[FP];
                TP++;
                FP++;
            }
            else
            {
                third[TP] = second[SP];
                SP++;
                TP++;
            }
        }
        if(FP != FN)
        {
            while(FP != FN)
            {
                third[TP] = first[FP];
                TP++;
                FP++;
            }
        }
        else
        {
            while(SP != SN)
            {
                third[TP] = second[SP];
                SP++;
                TP++;
            }
        }
        printArray(first);
        printArray(second);
        printArray(third);
    }

    public void method2()
    {
        int n= first.length+second.length;
        int fn= first.length;
        int sn = second.length;
        int fp = 0;
        int sp = (int) Math.ceil(n/2);
        int nextn = sp;
        int ind1=0,ind2=0;
        printArray(first);
        printArray(second);
        while(true) {
            if (sp == n) {
                sp = (int) Math.ceil(nextn / 2);
                nextn = sp;
                if (sp == 0)
                    break;
            }
            if(fp < fn && sp < fn)
            {
                ind1 = fp;
                ind2 = sp;
                if(first[ind1]>first[ind2])
                {
                    int temp = first[ind1];
                    first[ind1] = first[ind2];
                    first[ind2] = temp;
                }
            }
            else if(fp < fn && sp >= fn)
            {
                ind1 = fp;
                ind2 = (sp-1)-fn;
                if(ind2 == fn)
                    continue;
                if(first[ind1] > second[ind2])
                {
                    int temp = first[ind1];
                    first[ind1] = second[ind2];
                    second[ind2] = temp;
                }
            }
            else if(fp >= fn && sp >= fn)
            {
                ind1 = (fp-1)-fn;
                ind2 = (sp-1)-fn;
                if(ind2 == fn)
                    continue;
                if(second[ind1]>second[ind2])
                {
                    int temp = second[ind1];
                    second[ind1] = second[ind2];
                    second[ind2]= temp;
                }
            }
            fp++;
            sp++;
        }

        printArray(first);
        printArray(second);
    }
}
