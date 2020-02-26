package hello.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloWorldAppTest
{
    @Autowired
    HelloWorldController _controller;

    @DisplayName("Testing Hello world")
    @Test
    void testGet() {
        assertEquals("Hello World", _controller.sayHello());
    }
}
