package com.algorithmsoptimization.StringConcatenation;

public class StringUsingBuilder {
    public void concat(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append("A");
        }
    }
}
