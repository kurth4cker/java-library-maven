// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloUtilTest {
    @Test
    void greeting() {
        var fmt = "hello %s";
        String[] inputs = {
            "world",
            "kurth4cker",
            "",
        };

        for (var input : inputs) {
            var expected = String.format(fmt, input);
            var got = HelloUtil.greeting(input);
            assertEquals(expected, got);
        }

        assertEquals(HelloUtil.greeting("world"), HelloUtil.greeting());
    }
}
