//2. 450DSA Maximum and minimum of an array using minimum number of comparisons

import java.io.*;

class GFG {
    int j = 10;
    void hello() {
        System.out.println(j);
    }
	public static void main (String[] args) {
	   // GFG gfg = new GFG();
	   // gfg.hello();
	   // System.out.println(j);
		int arr[] = {1,2,3,4,5};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for ( int i=0; i<arr.length; i++) {
		    if (arr[i]<min)  
		        min = arr[i];
		    if (arr[i]>max)
		        max = arr[i];
		}
		System.out.println("MIN "+min);
		System.out.println("MAX "+max);
	}
}