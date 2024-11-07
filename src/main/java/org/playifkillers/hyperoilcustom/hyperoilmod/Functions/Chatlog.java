package org.playifkillers.hyperoilcustom.hyperoilmod.Functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Chatlog {

    private static final String LOG_DIR = "chatlogs";
    private static final String LOG_FILE = "chat.log";

    public static void logToFile(String message) {
        File dir = new File(LOG_DIR);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(dir, LOG_FILE), true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
