package aoc.day01;

import java.util.Arrays;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day01Test {

    @Test
    public void testPart1(){
        // Given
        String init[] = { "+1", "-2", "+3", "+1" };
        List<String> input = Arrays.asList(init);

        // When
        String result = new Day01().part1(input);

        // Then
        assertEquals("3", result);
    }

    @Test
    public void testPart2(){
        // Given
        String init[] = { "+3", "+3", "+4", "-2", "-4" };
        List<String> input = Arrays.asList(init);

        // When
        String result = new Day01().part2(input);

        // Then
        assertEquals("10", result);
    }
}
