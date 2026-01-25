package com.annotations.logexecution;

public class PerformanceService {

    @LogExecutionTime
    public void fastTask() {
        for (int i = 0; i < 100000; i++) {
        }
    }

    @LogExecutionTime
    public void slowTask() {
        for (int i = 0; i < 10000000; i++) {
        }
    }
}