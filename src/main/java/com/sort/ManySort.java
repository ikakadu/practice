package com.sort;

public class ManySort {
	
	public static void main(String[] args) {
		int arr[] = {32,43,23,53,23,5,30};
		
		  // ManySort.funBubbleSort(arr);
//		  ManySort.funSelectionSort(arr); 
//		   QuickSort.quickSort(arr, 0, arr.length-1);
		   ManySort.quickSort(arr, 0, arr.length-1);
//		InsertSort.insertSort(arr);
		  System.out.println("---------------------"); 
		  for (int num : arr) {
		  System.out.print(num+" "); 
		  }
		 
	}
	
	public static int[] funSelectionSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			
			if(arr[i]!=arr[minIndex]) {
				
				arr[i] = arr[i]^arr[minIndex];
				arr[minIndex] = arr[i]^arr[minIndex];
				arr[i] = arr[i]^arr[minIndex];
				}
			
			
			for (int num : arr) {
				System.out.print(num+" ");
			}
			System.out.println();
			
			
			
//			temp = arr[i];
//	        arr[i] = arr[minIndex];
//	        arr[minIndex] = temp;
			
		}
		
		
		
		return arr;
	}
	
	
	public static int[] funBubbleSort(int arr[]) {
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
		return arr;
	}
	
	public static void quickSort(int[] arr,int low,int high) {
		int start = low;
		int end = high;
		int key = arr[low];
		while(end>start) {
			while(end>start&&arr[end]>=key) {
				end--;
			}
			if(arr[end]<key) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}
			
			while(end>start&&arr[start]<=key) {
				start++;
			}
			if(arr[start]>key) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
			}
		}
		
		if(start>low) quickSort(arr, low, start-1);
		if(high>end)  quickSort(arr, end+1, high);
		
	}
}
