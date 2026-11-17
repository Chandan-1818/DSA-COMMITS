/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count=0;
        int i=0;
        while(i<arr.length){
            if (arr[i]== target){
                count++;
            }
            if(arr[i]<=target){
                i++;
            }else{
                return count;
            }
        }
        return count;
    }
}

