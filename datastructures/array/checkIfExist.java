/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
*/



class Solution {
    public boolean checkIfExist(int[] arr) {
        
        if (arr.length == 0){
            return false;
        }
        
        for (int n = 0; n<arr.length; n++){
            for (int m = 0; m<arr.length; m++){
                if(arr[n]==arr[m]*2 && n != m){
                    return true;
                }
            }
        }
        
        return false;
        
    }
}
