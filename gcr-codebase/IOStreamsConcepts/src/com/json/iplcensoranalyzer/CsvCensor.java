package com.json.iplcensoranalyzer;

import java.io.*;

public class CsvCensor {
    public static void main(String[] args) {

        try (
            BufferedReader reader = new BufferedReader(
                    new FileReader("src/com/json/iplcensoranalyzer/ipl.csv"));
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("src/com/json/iplcensoranalyzer/censored_ipl.csv"))
        ) {

            String header = reader.readLine();
            writer.write(header);
            writer.newLine();

            String line;
            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                data[1] = CensorUtil.maskTeam(data[1]); // team1
                data[2] = CensorUtil.maskTeam(data[2]); // team2
                data[5] = CensorUtil.maskTeam(data[5]); // winner
                data[6] = CensorUtil.redactPlayer();    // player_of_match

                writer.write(String.join(",", data));
                writer.newLine();
            }

            System.out.println("Censored CSV file created!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

