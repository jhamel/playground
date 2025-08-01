package dev.jhamel;



import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SayIT {

    @Test
    public void testSay(){
        Say say = new Say();
        assertEquals(say.say(), "Hello World!");
        System.out.println("----->"+Locale.getDefault());
        System.out.println("----->"+Locale.getDefault());
        System.out.println("----->"+Locale.getDefault());
        System.out.println("----->"+Locale.getDefault());
    }

}
