package com.optionaldemo.systemutil;

import java.util.Optional;

public class SystemUtility {
    public static void main(String[] args) {

        // 1. Config value
        Optional<String> configValue = getConfig("app.theme");
        String theme = configValue.orElse("light");
        System.out.println("1. Theme: " + theme);

        // 2. Environment variable
        Optional<String> env = Optional.ofNullable(System.getenv("DATABASE_URL"));
        String dbUrl = env.orElse("jdbc:sqlite:local.db");
        System.out.println("2. DB URL: " + dbUrl);

        // 3. Default file path
        Optional<String> filePath = getConfig("log.file.path");
        String path = filePath.orElse("/var/log/app/default.log");
        System.out.println("3. Log file: " + path);

        // 4. API response handling
        Optional<String> apiStatus = callApi();
        String status = apiStatus.orElse("UNKNOWN");
        System.out.println("4. API status: " + status);

        // 5. User preferences
        Optional<String> preference = getUserPreference("notification.sound");
        String sound = preference.orElse("default_beep.wav");
        System.out.println("5. Notification sound: " + sound);
    }

    private static Optional<String> getConfig(String key) {
        // simulate config service
        if ("app.theme".equals(key)) {
        	return Optional.of("dark");        	
        }
        return Optional.empty();
    }

    private static Optional<String> callApi() {
        return Optional.empty(); // simulate failure / no value
    }

    private static Optional<String> getUserPreference(String key) {
        return Optional.empty(); // user has not set preference
    }
}