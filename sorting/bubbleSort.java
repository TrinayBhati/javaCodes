class Solution {
    public boolean isPalindrome(int x) {

        // Two-Pointer Approach
        
        
        // Step1: Convert the integer into string.
        // Step2: Point two variable at first and last indices of the string.
        // Step3: Compare the characters at those indices.
        // Step4: Update the variables.

        String s = String.valueOf(x);  // convert integer to string.

        int i = 0;                     // i will initially point to first index.
        int j = s.length() - 1;        // j will initially point to last index. 
        
        // i and j are opposite indices of the string. 
        // 1. If 'i' is first then 'j' is last.
        // 2. Similarly, if 'i' is second then 'j' is second last index of s.
        // This is because they are updated simultaneously.

        while(i <= j)                   // loop will break when i and j cross each other
        {
            if(s.charAt(i) != s.charAt(j))  // characters at indices i and j will be compared.
                // If the characters are unequal then false will be returned.
                return false;
            i++;                                // i is incremented.
            j--;                                // j is decremented.
        }
        
        // If loop ends without returning false, it means that every 'ith' character
        // is equal to every 'jth' character. Thus, the number is palindrome.
        // Hence, return true;
        
        return true;
        
    }
}package sorting;

public class bubbleSort {
    public static void main(String[] args){
        // compare 2 values and put the smaller one ahead n move the next after
        // we compare 2 values and keep moving larger values to the end
        int a[] = {3,2,1,7,5};
        int n = a.length;
        
        for(int i = 0; i<n-1 ; i++){
            for(int j=0; j<n-i-1 ; j++ ){
                if(a[j] > a[j+1]){
                    //swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    }
            }
        }

        for(int i = 0; i<n ; i++){
            System.out.print(a[i] + " ");
        }
    }
}



