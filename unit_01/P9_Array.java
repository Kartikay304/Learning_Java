package unit_01;

import java.util.Scanner;

/* Tasks given below:
 *               obj.sortAnArray(array);
 *               obj.findTheDuplicateElements(array);
 *               obj.findSecondLargestAndSecondSmallestElement(array);
 *               obj.leftRotationInArray(array);
 *               obj.removeElementInArray(array); // (optional)
 */

public class P9_Array {

	public static void main(String[] args) {
		
		QuestionsOnArray obj = new QuestionsOnArray();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Enter 10 elements::");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("MENU\n1.Sort The Array.\n2.Find Dublicate Elements.\n3.Find Second Larget and Smallest Element.\n4.Left Rotate The Array.\n5.Remove Element.\nEnter your choice::");
		int ch = sc.nextInt();
		switch(ch) {
			case 1: obj.sortAnArray(arr,0,9); for(int i=0;i<10;i++) System.out.print(arr[i]+" "); break;
			case 2: obj.findTheDuplicateElements(arr); break;
			case 3: obj.findSecondLargestAndSecondSmallestElement(arr); break;
			case 4:	obj.leftRotationInArray(arr); break;
			case 5:	obj.removeElementInArray(arr); break;
			default: System.out.println("INVALID Choice");
		}
		sc.close();
	}
}

class QuestionsOnArray {
	
	void mergeArray(int arr[],int s,int e) {
		int i=s,k=s,mid=s+(e-s)/2,j=mid+1;
		int[] temp = new int[e+1];
		while(i<=mid && j<=e) {
			if(arr[i]<arr[j]) temp[k++]=arr[i++];
			else temp[k++]=arr[j++];
		}
		while(i<=mid) temp[k++]=arr[i++];
		while(j<=e) temp[k++]=arr[j++];
		for(i=s;i<=e;i++) arr[i]=temp[i];
	}
	
	void sortAnArray(int arr[],int s,int e){
		 if(s<e) {
			 int mid = s+(e-s)/2;
			 sortAnArray(arr,s,mid);
			 sortAnArray(arr,mid+1,e);
			 mergeArray(arr,s,e);
		 }
	}
	
	void findTheDuplicateElements(int arr[]) {
 		int visited = -1;  
		int [] fr = new int [arr.length]; 
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited) fr[i] = count;  
        }
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited && fr[i]>1 ) System.out.println(arr[i] + " - " + fr[i]);  
        }  
	}
	
	int minSecondSmallestNum(int arr[]) {
		 int i,count=0,index=0;
		    for(i=0;i<9;i++) {
		        if(count==1) break;
		        if(arr[i]!=arr[i+1]) {count++; index++; }
		        else index++;
		    }
		    return arr[index];
	}
	
	int maxSecondLargestNum(int arr[]) {
			int i,count=0,index=0;
			for(i=9;i>0;i--) {
				if(count==1) break;
				if(arr[i]!=arr[i-1]) { count++; index++; }
				else index++;
			}
			return arr[10-index-1];
		}
	
	void findSecondLargestAndSecondSmallestElement(int arr[]) {
		sortAnArray(arr,0,9);
		System.out.println("Second smallest number is:: "+minSecondSmallestNum(arr));
		System.out.println("Second largest number is :: "+maxSecondLargestNum(arr));
	}
	
	void leftRotateByOne(int arr[]) {
		int temp=arr[0];
		for(int i=0;i<9;i++) {
			arr[i]=arr[i+1];
		}
		arr[9]=temp;
	}
	
	void leftRotationInArray(int arr[]) {
		System.out.print("How many time do you want to left shift array? ");
		Scanner obj = new Scanner(System.in);
		int d = obj.nextInt();
		for(int i=0;i<d;i++) leftRotateByOne(arr);
		for(int i=0;i<10;i++) System.out.print(arr[i]+" ");
		obj.close();
	}
	
	void removeElementInArray(int arr[]) {
		System.out.print("Enter the index of the element which you want to remove::");
		Scanner obj = new Scanner(System.in);
		int index = obj.nextInt();
		for(int i=index;i<9;i++){
			arr[i]=arr[i+1];
		}
		arr[9]=0;
		for(int i=0;i<9;i++) System.out.print(arr[i]+" ");
		obj.close();
	}
	
}
