package com.example.libs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
    @Test
    void shouldAdd2plus2() {
        assertEquals(4, MathUtils.add(2, 2));
    }
}