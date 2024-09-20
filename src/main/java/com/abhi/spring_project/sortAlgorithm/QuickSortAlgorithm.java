package com.abhi.spring_project.sortAlgorithm;

import org.springframework.context.annotation.Primary;

import java.util.Arrays;

@Primary
public class QuickSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers ;
    }
}
