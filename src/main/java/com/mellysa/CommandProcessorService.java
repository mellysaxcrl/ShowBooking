package com.mellysa;

import org.springframework.stereotype.Service;

@Service
public class CommandProcessorService {
    public void processCommand(String command) {
        // Implement the logic to process the command here
        System.out.println("Received command: " + command);
    }
}
