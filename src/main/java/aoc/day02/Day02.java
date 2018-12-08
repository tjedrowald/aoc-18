package aoc.day02;

import aoc.Day;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Day02 implements Day {

    @Override
    public String part1(List<String> input) {
        int count2 = 0;
        int count3 = 0;
        for (String line : input) {
            Map<Character, AtomicInteger> charCount = new HashMap<>();
            for(char c : line.toCharArray()) {
                if(!charCount.containsKey(c)) charCount.put(c, new AtomicInteger(0));
                charCount.get(c).getAndIncrement();
            }
            boolean isTwo = false;
            boolean isThree = false;
            for (Map.Entry<Character, AtomicInteger> entry : charCount.entrySet()) {
                int value = entry.getValue().get();
                if(value == 2 && !isTwo) {
                    isTwo = true;
                    count2++;
                }
                if(value == 3 && !isThree) {
                    isThree = true;
                    count3++;
                }
            }
        }
        return String.valueOf(count2 * count3);
    }

    @Override
    public String part2(List<String> input) {
        StringBuilder result = new StringBuilder();

        for(String line : input) {
            for(String line2 : input) {
                int changes = 0;
                for (int j = 0; j < line.length(); j++) {
                    if(line.charAt(j) != line2.charAt(j)) changes++;
                }
                if(changes == 1) {
                    for (int j = 0; j < line.length(); j++) {
                        if(line.charAt(j) == line2.charAt(j)) result.append(line.charAt(j));
                    }
                    return result.toString();
                }
            }
        }
        return null;
    }
}
