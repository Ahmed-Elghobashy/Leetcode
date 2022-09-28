import java.lang.*;

class Solution {
    public String longestPalindrome(String s) {
          
        int[][] arr = new int[s.length()][s.length()];
        if (s.length() == 1)
            return s;
        int minBound = -1;
        int maxBound = -1;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            if (s.charAt(i) == s.charAt(j)) {
                arr[i][i] = 1;
                if (arr[i][j] == 1 && j-i >= (maxBound - minBound) ) {
                    minBound = i;
                    maxBound = j;
                }

            }

            if (i < s.length() - 1) {
                j = i + 1;
                if (s.charAt(i) == s.charAt(j)) {
                    arr[i][j] = 1;
                    if (arr[i][j] == 1 && j-i >= (maxBound - minBound) ) {
                        minBound = i;
                        maxBound = j;
                    }
                }

            }
        }

        int diff = 2;
        int i1 = 0;
        int j1 = diff;

        while (diff < s.length()) {
            if (i1 >= j1)
                continue;
            if (j1 >= s.length()) {
                i1 = 0;
                diff++;
                j1 = diff;
                continue;
            }


            if (s.charAt(i1) == s.charAt(j1)) {

                if (arr[i1 + 1][j1 - 1] == 1)
                    arr[i1][j1] = 1;
                if (arr[i1][j1] == 1 && diff >= (maxBound - minBound) ) {
                    minBound = i1;
                    maxBound = j1;
                }


            }
            i1++;
            j1++;
        }


//         for (int i = 0; i < s.length(); i++) {
//             for (int j = 0; j < s.length(); j++) {
//                 System.out.print(arr[i][j] + " ");

//             }
//             System.out.println("");
//         }


        int maxSoFar = maxBound - minBound;
        System.out.println("Max is " + maxBound + "  Min is :" + minBound);
        // if(maxSoFar==1)
        // {
        //     return s.substring(0,1);
        // }
        if (maxSoFar == s.length())
            return s;


        return s.substring(minBound, maxBound + 1);


    }
}
