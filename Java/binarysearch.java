// Q12.Write a JAVA program to implement binary search for Array of Integers? 
 
class binarysearch { 
 public static int binarySearch(int[] arr, int target) { 
 int left = 0; 
 int right = arr.length - 1; 
 while (left <= right) { 
 int mid = left + (right - left) / 2; 
 if (arr[mid] == target) { 
 return mid; 
 } else if (arr[mid] < target) { 
 left = mid + 1; 
 } else { 
 right = mid - 1; 
 } 
 } 
 return -1; 
 } 
 public static void main(String[] args) { 
 int[] arr = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 }; 
 int target = 16; 
 int index = binarySearch(arr, target); 
 if (index != -1) { 
 System.out.println("Element " + target + " found at index: " + index); 
 } else { 
 System.out.println("Element " + target + " not found in the array."); 
 } 
 }
}