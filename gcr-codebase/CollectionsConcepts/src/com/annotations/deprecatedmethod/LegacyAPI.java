package com.annotations.deprecatedmethod;

public class LegacyAPI {
    // Old method marked as deprecated
    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature executed (deprecated).");
    }

    // New recommended method
    public void newFeature() {
        System.out.println("New feature executed.");
    }
}