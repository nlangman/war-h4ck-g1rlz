package edu.war.h4ck.classes.class1;

public class Hello {

    String greeting = null;

    // this is the default constructor
    Hello() {
        greeting = "Hello ";
    }
    // Constructor
    Hello(String name) {
        this();
        System.out.println(greeting +name+"!");
    }

    public String getGreeting() {
        return this.greeting;
    }
}
