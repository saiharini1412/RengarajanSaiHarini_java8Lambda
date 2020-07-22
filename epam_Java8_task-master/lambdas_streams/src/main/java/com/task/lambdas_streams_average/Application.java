package com.task.lambdas_streams_average;
import java.util.*;
public class Application {

    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no. of elements:");
			int n = sc.nextInt();
			int[] list = new int[n];
			System.out.println("Enter elements:");
			for(int i=0;i<n;i++) {
				list[i]=sc.nextInt();
			}
			AverageOfList ans = new AverageOfList();
			System.out.println(ans.Avg(list));
		}
    }

}