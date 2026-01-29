package com.json.iplcensoranalyzer;

public class CensorUtil {

    // Mask team name
    public static String maskTeam(String teamName) {
        if (teamName == null || teamName.isEmpty()) {
            return "***";
        }

        if (teamName.contains(" ")) {
            return teamName.split(" ")[0] + " ***";
        }
        return "***";
    }

    // Redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}

