package application;

import java.util.ArrayList;

public class HeapSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HeapSorting.printArray(a);
//		HeapSorting.performHeapSort(a, a.length	);
		
	}
	
	public ArrayList<String> sortArray(ArrayList<String> a)  {
		performHeapSort(a, a.size()	);
		return a;
	}
	
	
	
	 void performHeapSort(ArrayList<String> a, int n)
	{

		//First Heapify
		for ( int i = n/2 -1; i >= 0; i--)
			heapify(a,i,n);
		
		//Delete the first object from the next set of Heapify
		for ( int i = n -1; i >= 0; i--)
		{

			String temp = a.get(0);
			a.set(0, a.get(i));
			a.set(i, temp);
		
			heapify(a, 0,i);

		}
	}

	static void heapify(ArrayList<String> a, int i, int n)
	{
		int top = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		String temp;

		if (left < n)
		{
			int comparetopLeft = a.get(top).compareTo(a.get(left));  
			if (comparetopLeft < 0) {
				top = left;
			}
		}
		if (right < n)
		{
			int comparetopRight = a.get(top).compareTo(a.get(right));  
			if (comparetopRight < 0) {
				top = right;

			}
		}

		if (top != i)
		{
			temp = a.get(i);
			a.set(i, a.get(top));
			a.set(top, temp);
			System.out.println("temp  "+temp);

			heapify(a, top, n);
		}

	}
	
}