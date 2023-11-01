package FundamentalJava.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class mergedarrays
{
    public static void main(String[] args)
    {
        int arr1[]={2,4,5,6,7,8};
        int arr2[]={2,3,4,5,6,7,8,9,11,12};

        int mergedarray[]=new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;

        while(i< arr1.length)
        {
            mergedarray[k++]=arr1[i++];
        }

        while(j< arr2.length)
        {
            mergedarray[k++]=arr2[j++];
        }
        Arrays.sort(mergedarray);

        HashSet<Integer> duplicates=new HashSet<Integer>();

        for(int pos=0;pos< mergedarray.length;pos++)
        {
            duplicates.add(mergedarray[pos]);
        }
        Iterator<Integer> it= duplicates.iterator();

        int [] withoutdup=new int[duplicates.size()];

        int n=0;
        while(it.hasNext())
        {
            withoutdup[n]= it.next();
            n++;
        }
        System.out.println(Arrays.toString(withoutdup));
    }
}
