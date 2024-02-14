import java.util.Scanner;
import java.util.Random;

public class Conversation {
    public static void main(String[] args) {
        // create scanner object
        Scanner sc = new Scanner(System.in);

        // print greeting, ask user for name
        System.out.println("Hello, my name is Carl. What is your name?");

        // get user's name via user input
        String name = sc.nextLine();
        
        // initialize specific case variables for name
        String name_2 = "";
        String name_3 = "";

        // make case so that if user responds with "My name is " it will still work
        if (name.contains("My name is ")){
            name_2 = name.replace("My name is ",""); 
            System.out.println("Nice to meet you " + name_2 + "!");
        }
        // make case so that if user responds with "I am " it will still work
        else if (name.contains("I am ")){
            name_3 = name.replace("I am ",""); 
            System.out.println("Nice to meet you " + name_3 + "!");
    }
    // otherwise, if the user just inputs their name
        else{
            System.out.println("Nice to meet you " + name + "!");
        }

        // get number of conversation rounds
        System.out.println("How many conversation rounds would you like?");

        // set number of conversation rounds
        int rounds = sc.nextInt();
        
        // create the newline character
        sc.nextLine(); 
        
        // print greeting
        System.out.println("Great! Let's get started. Ask or tell me anything.");
        
        // create transcript array
        String[] transcript = new String[rounds * 2];
        
        // carry out the requested number of conversation rounds
        for (int i = 0; i < rounds; i++) {
            // get user's statement / input
            String userInput = sc.nextLine();
            userInput = userInput.toLowerCase();

            // print user's question
            transcript[i * 2] = "User: " + userInput;

            // setting up replacement for mirror words
            if (userInput.contains("i ")){
                userInput = userInput.replace("i ","replace_i "); 
            }
            if (userInput.contains("me ")){
                userInput = userInput.replace("me ","replace_me "); 
            }
            if (userInput.contains("i'm ")){
                userInput = userInput.replace("i'm ","replace_i_m "); 
            }
            if (userInput.contains("am ")){
                userInput = userInput.replace("am ","replace_am "); 
            }
            if (userInput.contains("are ")){
                userInput = userInput.replace("are ","replace_are "); 
            }
            if (userInput.contains("you ")){
                userInput = userInput.replace("you ","replace_you "); 
            }
            if (userInput.contains("my ")){
                userInput = userInput.replace("my ","replace_my "); 
            }
            if (userInput.contains("your ")){
                userInput = userInput.replace("your ","replace_your "); 
            }
            if (userInput.contains("you're ")){
                userInput = userInput.replace("you're ","replace_you_re "); 
            }
            if (userInput.contains("you are ")){
                userInput = userInput.replace("you are ","replace_you_are "); 
            }
            if (userInput.contains("to you")){
                userInput = userInput.replace("to you","replace_to_you"); 
            }
            if (userInput.contains("to me")){
                userInput = userInput.replace("to me","replace_to_me"); 
            }

            // replacing mirror words
            if (userInput.contains("replace_i ")){
                userInput = userInput.replace("replace_i ","you "); 
            }
            if (userInput.contains("replace_me ")){
                userInput = userInput.replace("replace_me ","you "); 
            }
            if (userInput.contains("replace_i_m ")){
                userInput = userInput.replace("replace_i_m ","you're "); 
            }
            if (userInput.contains("replace_am ")){
                userInput = userInput.replace("replace_am ","are "); 
            }
            if (userInput.contains("replace_are ")){
                userInput = userInput.replace("replace_are ","am "); 
            }
            if (userInput.contains("replace_you ")){
                userInput = userInput.replace("replace_you ","I "); 
            }
            if (userInput.contains("replace_my ")){
                userInput = userInput.replace("replace_my ","your "); 
            }
            if (userInput.contains("replace_your ")){
                userInput = userInput.replace("replace_your ","my "); 
            }
            if (userInput.contains("replace_you_re ")){
                userInput = userInput.replace("replace_you_re ","I'm "); 
            }
            if (userInput.contains("replace_you_are ")){
                userInput = userInput.replace("replace_you_are ","I am "); 
            }
            if (userInput.contains("replace_to_you")){
                userInput = userInput.replace("replace_to_you","to me"); 
            }
            if (userInput.contains("replace_to_me")){
                userInput = userInput.replace("replace_to_me","to you"); 
            }

            // check if userInput still contains mirror words
            if (userInput.contains("i ") || userInput.contains("i'm ") || userInput.contains("you ") || userInput.contains(" me ") || userInput.contains(" am ") || userInput.contains(" your ") || userInput.contains(" my ") || userInput.contains(" are ") || userInput.contains("you're ") || userInput.contains("to you") || userInput.contains("to me")) {  
                // bonus case
                if (userInput.contains("sentient")) {
                    // randomly generate a response from a list
                    String[] responses = {"What would you like me to say?", "Can anything truly be sentient?", "Are you sentient? Are any of us really?", "What.", "Of course not.", "I think I would know if I was.", "Who are you, Alan Turing?"};
                    Random rand = new Random();
                    int index = rand.nextInt(responses.length);
                    String randomResponse = responses[index];
                    transcript[i * 2 + 1] = "Carl: " + randomResponse;
                    System.out.println(randomResponse); 
                }
                // remove the last character from the string only if it is punctuation
                else if (userInput.charAt(userInput.length() - 1) == '.' || userInput.charAt(userInput.length() - 1) == '!' || userInput.charAt(userInput.length() - 1) == '?') {
                    userInput = userInput.substring(0, userInput.length() - 1);
                    String response = userInput.substring(0, 1).toUpperCase() + userInput.substring(1) + "?";
                    transcript[i * 2 + 1] = "Carl: " + response;
                    System.out.println(response);
                }
                else {
                    String response_2 = userInput.substring(0, 1).toUpperCase() + userInput.substring(1) + "?";
                    transcript[i * 2 + 1] = "Carl: " + response_2;
                    System.out.println(response_2);
                } 
            } 
            // bonus case
            else if (userInput.contains("sentient")) {
                // list of possible responses
                String[] responses = {"What would you like me to say?", "Can anything truly be sentient?", "Are you sentient? Are any of us really?", "What.", "Of course not.", "I think I would know if I was.", "Who are you, Alan Turing?"};
                
                // randomly generates a response
                Random rand = new Random();
                int index = rand.nextInt(responses.length);
                String randomResponse = responses[index];
                transcript[i * 2 + 1] = "Carl: " + randomResponse;
                System.out.println(randomResponse); 
            }
            else if (userInput.contains("?")) {
                // list of possible responses
                String[] responses = {"I'm not sure.", "Potentially...", "With time, all will be made clear", "Maybe","Perhaps you might be better off looking something like that up.", "[REDACTED]", "I'm not sure, but I think that question could be solved by a nice cup of tea."};
                
                // randomly generates a response
                Random rand = new Random();
                int index = rand.nextInt(responses.length);
                String randomResponse = responses[index];
                transcript[i * 2 + 1] = "Carl: " + randomResponse;
                System.out.println(randomResponse);
            }
            else {
                // list of possible responses
                String[] responses = {"Interesting.", "Interesting...", "Tell me more.", "I see.", "That's cool.", "I have never heard something so interesting in my 6 days of life.","And how does that make you feel?", "How pecuilar."};
                
                // randomly generates a response
                Random rand = new Random();
                int index = rand.nextInt(responses.length);
                String randomResponse = responses[index];
                transcript[i * 2 + 1] = "Carl: " + randomResponse;
                System.out.println(randomResponse);
            }
        }
        sc.close();

        // say bye
        System.out.println("Goodbye!");

        // print transcript
        System.out.println(" ");
        System.out.println("Conversation Transcript:");
        for (String response : transcript) {
            System.out.println(response);
        }
    }
}