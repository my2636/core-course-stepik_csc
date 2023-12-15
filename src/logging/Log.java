package logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {

    public static void main(String[] args) {
        configureLogging();
        System.out.println(ClassA.class.getPackage());
    }




    private static void configureLogging() {
        final Logger LOGGER = Logger.getLogger(ClassA.class.getName());
        ConsoleHandler h =
        LOGGER.addHandler();
        final Logger LOGGER1 = Logger.getLogger(ClassB.class.getName());
        LOGGER.log(Level.ALL, "All logs:");
        LOGGER.setUseParentHandlers(true);
        LOGGER1.log(Level.WARNING, "Warning:");
        LOGGER1.setUseParentHandlers(true);
    }
}
