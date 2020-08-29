/*
Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array.
*/


class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i=0; i<arr.length; i++){
            int m = -1;
            for (int j = i+1; j<arr.length; j++){
                if (arr[j] > m){
                    m = arr[j];
                }
            }
            
            arr[i] = m;
        }
        return arr;
    }
}
