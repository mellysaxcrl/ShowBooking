package com.mellysa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
class CommandLineInterface implements CommandLineRunner {
    private final CommandProcessorService commandProcessorService;

    @Autowired
    public CommandLineInterface(CommandProcessorService commandProcessorService) {
        this.commandProcessorService = commandProcessorService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 'exit' to quit.");
        while (true) {
            System.out.print("Enter a command: ");
            String input = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            commandProcessorService.processCommand(input);
        }
        scanner.close();
    }
}