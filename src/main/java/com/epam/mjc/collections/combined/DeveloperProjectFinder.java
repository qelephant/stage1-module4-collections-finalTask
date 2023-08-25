package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;	
import java.util.Set;
import java.util.*;

public class DeveloperProjectFinder {
   public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String project = entry.getKey();
            Set<String> developers = entry.getValue();
            
            if (developers.contains(developer)) {
                result.add(project);
            }
        }

        result.sort((p1, p2) -> {
            int lengthComparison = Integer.compare(p2.length(), p1.length()); 
            return lengthComparison != 0 ? lengthComparison : p2.compareTo(p1); 
        });

        return result;
    }
}
