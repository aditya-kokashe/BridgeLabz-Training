package com.annotations.deprecatedexample;

public class DeprecatedMain {

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature();   // Deprecated method (will show warning)
        api.newFeature();   // Recommended method
    }
}