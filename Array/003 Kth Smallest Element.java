// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}
	

    
 // } Driver Code Ends


//User function Template for Java

public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    for(int i=l; i<=r; i++){
        minHeap.add(arr[i]);
    }
    for(int i=0; i<k-1; i++){
        minHeap.remove();
    }
    return minHeap.peek();
} 

// { Driver Code Starts.


}
  // } Driver Code Ends
