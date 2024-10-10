package randoop.grt_mock.com.beust.jcommander.internal;

import com.beust.jcommander.internal.Console;

/**
 * Do not wait for user input.
 */
public class DefaultConsole {
    public static char[] readPassword(Console instance, boolean echoInput) {
        return new char[0];
    }
}