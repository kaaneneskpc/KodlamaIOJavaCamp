package homework.core.logging;

import core.logging.Logger;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Database Logged : " + data);
    }
}
