package org.robovm.pods;

public final class Log {
    private static Logger logger = Logger.DEFAULT;
    private static LogLevel level = LogLevel.ERROR;

    public static void log(String message, Object... replacements) {
        if (level == LogLevel.DEBUG) {
            logger.log(String.format(message, replacements));
        }
    }

    public static void err(String message, Object... replacements) {
        if (level == LogLevel.ERROR || level == LogLevel.DEBUG) {
            logger.err(String.format(message, replacements));
        }
    }

    public static void setLogger(Logger logger) {
        Log.logger = logger;
    }

    public static void setLogLevel(LogLevel level) {
        Log.level = level;
    }

    public enum LogLevel {
        NONE, ERROR, DEBUG
    }

    public interface Logger {
        void log(String message);

        void err(String message);

        public static final Logger DEFAULT = new Logger() {
            @Override
            public void log(String message) {
                System.out.println(message);
            }

            @Override
            public void err(String message) {
                System.err.println(message);
            }
        };
    }
}
