package com.abhi.spring_project.sortAlgorithm;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm{

    @Override
    public int[] sort(int[] numbers) {
        Arrays.sort(numbers);
        return numbers ;
    }
}
