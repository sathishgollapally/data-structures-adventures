package com.dsa.practice;
/*Given an array of integers, search a given key in the array using linear search.
Input Format
The first line of input contains two integers N and K. N is the size of the array and K is the key. The second line contains the elements of the array.

Output Format
If the key is found, print the index of the array, otherwise print -1.

Constraints
1 <= N <= 102
0 <= ar[i] <= 109

Example
Input
5 15
-2 -19 8 15 4
Output
3
*
*/

public class LinearSearch {
       public static void main(String[] args) {


    }

    public static int linearSearch(int arr[], int key) {
           for(int i = 0; i< arr.length; i++) {
               if(arr[i] == key)
                   return i;
           }
           return -1;
    }
}
