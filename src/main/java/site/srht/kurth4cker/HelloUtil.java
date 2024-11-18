// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

public final class HelloUtil {
    private HelloUtil() {}

    public static String greeting() {
        return greeting("world");
    }

    public static String greeting(String to) {
        return String.format("hello %s", to);
    }
}
