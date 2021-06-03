package edu.war.h4ck.classes.class1;

public class Main {

    public static void main(String... args) {
        almaSayHello();
        olgaSayHello();
        // say hello to Nat
        Hello hi = new Hello("Nat");
        System.out.println("What was greeting? "+hi.getGreeting());
    }

    private static void almaSayHello() {

    }

    private static void olgaSayHello() {

    }
/**
 * 1. Homework. Update your function with your hello message.
 * 2. Use git to add it to Github so we can all see your changes
 *
 * BUT HOW?
 *
 * 1. git status    <--- shows you what changed
 * 2. git add --all <--- adds all your changes
 * 3. git commit -am "My super cool message I want you to read." <--- this saves your changes with a message on each file!
 * 4. git push <-- BOOM! put that suff on the Internet. Test.
 */
}
