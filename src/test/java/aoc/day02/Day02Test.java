package aoc.day02;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Day02Test {

    @Test
    public void testPart1(){
        // Given
        String init[] = { "abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab" };
        List<String> input = Arrays.asList(init);

        // When
        String result = new Day02().part1(input);

        // Then
        assertEquals("12", result);
    }

    @Test
    public void testPart2(){
        // Given
        String init[] = { "abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz" };
        List<String> input = Arrays.asList(init);

        // When
        String result = new Day02().part2(input);

        // Then
        assertEquals("fgij", result);
    }
}