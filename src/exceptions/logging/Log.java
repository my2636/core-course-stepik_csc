package exceptions.logging;

import java.util.logging.*;

public class Log {

    public static void main(String[] args) {
        configureLogging();
        System.out.println(ClassA.class.getPackage());
    }




    private static void configureLogging() {
        final Logger LOGGER = Logger.getLogger("org.stepic.java.logging.ClassA");
        LOGGER.setLevel(Level.ALL);
        final Logger LOGGER1 = Logger.getLogger("org.stepic.java.logging.ClassB");
        LOGGER1.setLevel(Level.WARNING);
        final Logger LOGGERP = Logger.getLogger("org.stepic.java");
        LOGGERP.setLevel(Level.ALL);
        Handler handlerP = new ConsoleHandler();
        handlerP.setLevel(Level.ALL);
        LOGGERP.addHandler(handlerP);
        LOGGERP.setUseParentHandlers(false);
        Formatter formatterP = new XMLFormatter();
        handlerP.setFormatter(formatterP);
    }
}
