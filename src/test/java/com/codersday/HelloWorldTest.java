package com.codersday;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class HelloWorldTest {

    void test_getHelloWorld_equals() {
        // given
        String expected = "HelloWorld";

        // when
        String result = HelloWorld.getHelloWorld();

        // then
        assertEquals(expected, result);
    }

    void test_getHelloWorld_notEquals() {
        // given
        String notExpected = "GoodbyeWorld";

        // when
        String result = HelloWorld.getHelloWorld();

        // then
        assertNotEquals(notExpected, result);
    }
}