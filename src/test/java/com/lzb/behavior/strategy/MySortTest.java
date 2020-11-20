package com.lzb.behavior.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @Author : LZB
 * @Description :
 */

public class MySortTest {


    @Test
    public void sort() {
        int[] arr = new int[]{6, 1, 2, 3, 5, 4, 10, -1, 0, 6};
        Sort sort = new MySort(SortStrategy.BUBBLE_SORT);
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
