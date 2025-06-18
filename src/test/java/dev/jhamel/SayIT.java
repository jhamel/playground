package dev.jhamel;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SayIT {

    @Test
    public void testSay(){
        Say say = new Say();
        assertEquals(say.say(), "Hello World!");

    }

}
