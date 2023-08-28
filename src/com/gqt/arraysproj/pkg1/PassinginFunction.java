package com.gqt.arraysproj.pkg1;

import java.util.Arrays;

public class PassinginFunction {

	public static void main(String[] args) {
		int[] nums = {55,67,44,88,44};
		System.out.println(Arrays.toString(nums));
		change(nums);
		System.out.println(Arrays.toString(nums));

	}
	
	static void change(int[] arr) {
        arr[0] = 100;
	}
}
	

