package aoc.day01;

import aoc.Day;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day01 implements Day {

    @Override
    public String part1(List<String> input) {
        int result = 0;
        for (String line : input)
            result += Integer.valueOf(line);
        return String.valueOf(result);
    }

    @Override
    public String part2(List<String> input) {
        List<Integer> integers = new ArrayList<>();
        int result = 0;
        while(true) {
            for (String line : input) {
                if (integers.contains(result)) {
                    return String.valueOf(result);
                }
                integers.add(result);
                result += Integer.valueOf(line);
            }
        }
    }
}
