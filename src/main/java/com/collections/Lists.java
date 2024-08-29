package com.collections;

import java.util.List;
import java.util.Objects;

public class Lists {
    public static Integer indexOf(String color, List<String> colors) {
        int index = 0;
        for (String current : colors) {
            if (Objects.equals(current, color)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static Integer indexOfByIndex(String color, List<String> colors, Integer startIndex) {
        for (int i = startIndex; i < colors.size(); i++) {
            if (Objects.equals(colors.get(i), color)) {
                return i;
            }
        }
        return -1;
    }

    public static Integer indexOfEmpty(List<String> colors) {
        int i = 0;
        while (i < colors.size()) {
            if (Objects.equals(colors.get(i), "")) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static Integer put(String color, List<String> colors) {
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).isEmpty()) {
                colors.set(i, color); // Use set to replace the empty spot
                return i;
            }
        }
        return -1;
    }

    public static Integer remove(String color, List<String> colors) {
        int count = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (Objects.equals(colors.get(i), color)) {
                colors.remove(i);
                i--; // Adjust the index after removal to avoid skipping elements
                count++;
            }
        }
        return count;
    }
}
