package com.task.lambdas_streams_average;

import java.util.Arrays;
public class AverageOfList {
	double Avg(int[] list) {
		return Arrays.stream(list).mapToDouble(i -> (double)i).average().getAsDouble();
	}
}
