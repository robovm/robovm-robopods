/*
 * Copyright (C) 2016 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
