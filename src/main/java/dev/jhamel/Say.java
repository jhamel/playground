package dev.jhamel;

public class Say {
    public static final String HELLO_WORLD = "Hello World!";

    public String say() {
        return HELLO_WORLD;
    }
    public String name(){
        return null;
    }
    public void printName(){
        System.out.println(name().toUpperCase());
    }
}
