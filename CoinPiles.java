// Given an array, arr[] of size N and an integer K which means there are N piles of coins and 
// the ith contains arr[i] coins. The task is to adjust the number of coins in each pile such that 
// for any two piles if a be the number of coins in the first pile and b be the number of coins in the second pile then |a – b| ≤ K. 
// Input: arr[] = {2, 2, 2, 2}, K = 0 
// Output: 0 
// For any two piles the difference in the number of coins is ≤ 0. 
// So, no need to remove any coins.
// Input: arr[] = {1, 5, 1, 2, 5, 1}, K = 3 
// Output: 2 
// If we remove one coin each from both the piles containing 
// 5 coins, then for any two piles the absolute difference 
// in the number of coins is ≤ 3. 

import java.io.*;

class CoinPiles {

	static int min_val(int[] a) {
		int min = 2147483647;
		for (int el : a) {
			if (el < min) {
				min = el;
			}
		}
		return min;
	}
	static int minimumCoins(int a[], int n, int k) {
		int cnt = 0;
		int minVal = min_val(a);
		for (int i = 0; i < n; i++) {
			int diff = a[i] - minVal;
			if (diff > k) { 
				cnt += (diff - k);
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		int a[] = { 1, 5, 1, 2, 5, 1 };
		int n = a.length;
		int k = 3;
		System.out.println(minimumCoins(a, n, k));
	}
}
