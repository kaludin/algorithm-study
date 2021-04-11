import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        
        Arrays.sort(arr);
        for(int n=0; n < arr.length-1; n++){
            min = Math.min(min, Math.abs(arr[n]-arr[n+1]));
        }
        
        return min;

    }
}
