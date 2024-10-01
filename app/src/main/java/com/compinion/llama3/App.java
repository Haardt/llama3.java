/*
 * This source file was generated by the Gradle 'init' task
 */
package com.compinion.llama3;

import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new App().getGreeting());

        try {
            Llama3.go(args);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
