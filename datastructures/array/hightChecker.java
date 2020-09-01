/*
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.
*/



class Solution {
    public int heightChecker(int[] heights) {
        int[] A = new int[heights.length];
        
        /* create a copy of array */
        for(int i = 0; i < heights.length; i++){
            A[i] = heights[i];
        }
        
        /* bubble sort */
        for(int i=0; i < A.length; i++){
            for(int j = A.length-1; j>i; j--){
                if(A[j] < A[j-1]){
                    int temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
        
        /* compare */
        int n = 0;
        for(int i=0; i< A.length; i++){
            if (A[i] != heights[i]){
                n++;
            }
        }
        return n;
    }            
}
   
