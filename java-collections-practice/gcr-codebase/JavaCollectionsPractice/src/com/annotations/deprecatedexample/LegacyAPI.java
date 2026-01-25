package com.annotations.deprecatedexample;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is deprecated. Avoid using it.");
    }

    public void newFeature() {
        System.out.println("New feature is recommended.");
    }
}