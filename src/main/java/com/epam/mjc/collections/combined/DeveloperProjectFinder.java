package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
   public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
    Map<Integer, Set<String>> result = new HashMap<>();

    for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
        String key = entry.getKey();
        int length = key.length();

        if (!result.containsKey(length)) {
            result.put(length, new HashSet<>());
        }
        result.get(length).add(key);
    }

    return result;
}
}
