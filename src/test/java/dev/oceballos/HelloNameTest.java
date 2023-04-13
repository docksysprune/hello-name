package dev.oceballos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloNameTest {

    @Test
    void handleRequest() {
        var sut = new HelloName();
        Assertions.assertEquals("Hello, Miranda!",sut.handleRequest("Miranda"));
    }
}