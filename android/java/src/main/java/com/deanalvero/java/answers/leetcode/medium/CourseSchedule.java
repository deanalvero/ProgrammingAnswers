package com.deanalvero.java.answers.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses < 1) {
            return false;
        }

        int[] courses = new int[numCourses];
        for (int[] prerequisite: prerequisites) {
            courses[prerequisite[0]]++;
        }

        Queue<Integer> okCourses = new LinkedList<>();
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == 0) {
                okCourses.offer(i);
            }
        }

        while (!okCourses.isEmpty()) {
            int course = okCourses.poll();
            for (int[] prerequisite: prerequisites) {
                if (prerequisite[1] == course) {
                    courses[prerequisite[0]]--;

                    if (courses[prerequisite[0]] == 0) {
                        okCourses.offer(prerequisite[0]);
                    }
                }
            }
        }
        for (int course: courses) {
            if (course != 0) {
                return false;
            }
        }
        return true;
    }
}
