package com.day1.resumeanalyzer;

import java.util.*;

public class ResumeProcessor {

    private Map<String, ResumeData> resumeIndex = new HashMap<>();

    public void addResume(ResumeData data) {
        resumeIndex.put(data.getEmail(), data);
    }

    public List<ResumeData> getSortedCandidates() {
        List<ResumeData> list = new ArrayList<>(resumeIndex.values());

        list.sort((a, b) ->
                Integer.compare(b.getKeywordCount(), a.getKeywordCount()));

        return list;
    }

    public Map<String, ResumeData> getResumeIndex() {
        return resumeIndex;
    }
}