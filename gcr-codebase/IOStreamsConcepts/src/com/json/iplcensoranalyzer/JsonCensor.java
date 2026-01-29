package com.json.iplcensoranalyzer;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class JsonCensor {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            // Read SINGLE JSON OBJECT
            ObjectNode match = (ObjectNode) mapper.readTree(
                    new File("src/com/json/iplcensoranalyzer/ipl.json"));

            match.put("team1",
                    CensorUtil.maskTeam(match.get("team1").asText()));
            match.put("team2",
                    CensorUtil.maskTeam(match.get("team2").asText()));
            match.put("winner",
                    CensorUtil.maskTeam(match.get("winner").asText()));
            match.put("player_of_match",
                    CensorUtil.redactPlayer());

            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File("censored_ipl.json"), match);

            System.out.println("Censored JSON file created!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


