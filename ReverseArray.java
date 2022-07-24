/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    // static void reverseArray(int a[],int start,int end){
    //     int temp;
    //     while(start<end){
    //         temp=a[start];
    //         a[start]=a[end];
    //         a[end]=temp;
    //         start++;
    //         end--;
    //     }
        
    // }
    // static void printArray(int a[],int size){
    //     for(int i=0;i<size;i++){
    //         System.out.print(a[i]+" ");
    //     }
        
    // }
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		
		for(int i=1;i<=T;i++){
		    int N=sc.nextInt();
		    int a[]=new int[N];
		    for(int j=0;j<N;j++){
		        a[j]=sc.nextInt();
		        
		    }
		  //  for(int k=N-1;k>=0;k--){
		  //      System.out.print(a[k]+" ");
		        
		  //  }
		  int start=0,end=N-1,temp;
		  //reverseArray(a,start,end);
		  //printArray(a,N);
		  while(start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        for(int k=0;k<N;k++){
            System.out.print(a[k]+" ");
         }
         System.out.println();
		}
	}
}