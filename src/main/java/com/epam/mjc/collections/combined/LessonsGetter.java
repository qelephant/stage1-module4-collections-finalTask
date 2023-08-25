package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> subjects = new HashSet<>();

        for (List<String> lessons : timetable.values()) {
            subjects.addAll(lessons);
        }
        return allLessons;
    }
}
