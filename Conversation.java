import java.util.Scanner;
import java.util.Random;

/**
 * a class that hosts a chatbot named carl, who can hold a conversation with the user
 * and respond to the user's input with a variety of canned responses
 */
public class Conversation {
    /**
     * this is a method that returns a random canned response to the user's prompt
     * this is the most general question response type
     * @return a random canned response
     */
    public static String getCannedResponses() {
        String[] cannedResponses = {
            "Interesting.",
            "Tell me more.",
            "I see.",
            "That's cool.",
            "I have never heard something so interesting in my 6 days of life.",
        };
        Random rand = new Random();
        int index = rand.nextInt(cannedResponses.length);
        return cannedResponses[index];
    };
    /**
     * this is a method that returns a random canned response to the user's question
     * when containing the trigger character ? (determined in main)
     * @return a random question based response
     */
    public static String getRandomQuestionResponse() {
        String[] questionResponses = {
            "And how does that make you feel?",
            "How peculiar.",
            "I'm not sure.",
            "With time, all will be made clear.",
            "Perhaps you might be better off looking something like that up.",
            "[REDACTED]",
            "I'm not sure, but I think that question could be solved by a nice cup of tea.",
        };
        Random rand = new Random();
        int index = rand.nextInt(questionResponses.length);
        return questionResponses[index];
    };
    /**
     * this is a method that returns a random response to the user's prompt/question
     * when containing the trigger word sentient (determined in main)
     * @return a random response related to the trigger word sentient
     */
    public static String getRandomSentientResponse() {
        String[] sentientResponses = {
            "What would you like me to say?",
            "Can anything truly be sentient?",
            "Are you sentient? Are any of us really?",
            "What.",
            "Of course not.",
            "I think I would know if I was.",
            "Who are you, Alan Turing?"
        };
        Random rand = new Random();
        int index = rand.nextInt(sentientResponses.length);
        return sentientResponses[index];
    };
    /**
     * this is the main method that runs the chatbot
     * @param args
     */
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

            // replace instances of "i" with placeholder "replace_i"
            if (userInput.contains("i ")){
                userInput = userInput.replace("i ","replace_i "); 
            }
            // replace instances of "me" with placeholder "replace_me"
            if (userInput.contains(" me ")){
                userInput = userInput.replace("me ","replace_me "); 
            }
            // replace instances of "i'm" with placeholder "replace_i_m"
            if (userInput.contains("i'm ")){
                userInput = userInput.replace("i'm ","replace_i_m "); 
            }
            // replace instances of "am" with placeholder "replace_am"
            if (userInput.contains(" am ")){
                userInput = userInput.replace("am ","replace_am "); 
            }
            // replace instances of "are" with placeholder "replace_are"
            if (userInput.contains("are ")){
                userInput = userInput.replace("are ","replace_are "); 
            }
            // replace instances of "you" with placeholder "replace_you"
            if (userInput.contains("you ")){
                userInput = userInput.replace("you ","replace_you "); 
            }
            // replace instances of "my" with placeholder "replace_my"
            if (userInput.contains("my ")){
                userInput = userInput.replace("my ","replace_my "); 
            }
            // replace instances of "your" with placeholder "replace_your"
            if (userInput.contains("your ")){
                userInput = userInput.replace("your ","replace_your "); 
            }
            // replace instances of "you're" with placeholder "replace_you_re"
            if (userInput.contains("you're ")){
                userInput = userInput.replace("you're ","replace_you_re "); 
            }
            // replace instances of "to you" with placeholder "replace_to_you"
            if (userInput.contains("to you")){
                userInput = userInput.replace("to you","replace_to_you"); 
            }
            // replace instances of "to me" with placeholder "replace_to_me"
            if (userInput.contains("to me")){
                userInput = userInput.replace("to me","replace_to_me"); 
            }
            // replace instances of "was" with placeholder "replace_was"
            if (userInput.contains("was")){
                userInput = userInput.replace("was","replace_was"); 
            }
            // replace instances of "were" with placeholder "replace_were"
            if (userInput.contains("were")){
                userInput = userInput.replace("were","replace_were"); 
            }

            // replacing mirror words

            // replace instances of placeholder "replace_i" with mirrored word "you"
            if (userInput.contains("replace_i ")){
                userInput = userInput.replace("replace_i ","you "); 
            }
            // replace instances of placeholder "replace_me" with mirrored word "you"
            if (userInput.contains("replace_me ")){
                userInput = userInput.replace("replace_me ","you "); 
            }
            // replace instances of placeholder "replace_i_m" with mirrored word "you're"
            if (userInput.contains("replace_i_m ")){
                userInput = userInput.replace("replace_i_m ","you're "); 
            }
            // replace instances of placeholder "replace_am" with mirrored word "are"
            if (userInput.contains("replace_am ")){
                userInput = userInput.replace("replace_am ","are "); 
            }
            // replace instances of placeholder "replace_are" with mirrored word "am"
            if (userInput.contains("replace_are ")){
                userInput = userInput.replace("replace_are ","am "); 
            }
            // replace instances of placeholder "replace_you" with mirrored word "I"
            if (userInput.contains("replace_you ")){
                userInput = userInput.replace("replace_you ","I "); 
            }
            // replace instances of placeholder "replace_my" with mirrored word "your"
            if (userInput.contains("replace_my ")){
                userInput = userInput.replace("replace_my ","your "); 
            }
            // replace instances of placeholder "replace_your" with mirrored word "my"
            if (userInput.contains("replace_your ")){
                userInput = userInput.replace("replace_your ","my "); 
            }
            // replace instances of placeholder "replace_you_re" with mirrored word "I'm"
            if (userInput.contains("replace_you_re ")){
                userInput = userInput.replace("replace_you_re ","I'm "); 
            }
            // replace instances of placeholder "replace_to_you" with mirrored word "to me"
            if (userInput.contains("replace_to_you")){
                userInput = userInput.replace("replace_to_you","to me"); 
            }
            // replace instances of placeholder "replace_to_me" with mirrored word "to you"
            if (userInput.contains("replace_to_me")){
                userInput = userInput.replace("replace_to_me","to you"); 
            }
            // replace instances of placeholder "replace_was" with mirrored word "were"
            if (userInput.contains("replace_was")){
                userInput = userInput.replace("replace_was","were"); 
            }
            //  replace instances of placeholder "replace_were" with mirrored word "was"
            if (userInput.contains("replace_were")){
                userInput = userInput.replace("replace_were","was"); 
            }

            // check if userInput still contains mirror words
            if (userInput.contains("i ") || userInput.contains("i'm ") || userInput.contains("you ") || userInput.contains(" me ") || userInput.contains(" am ") || userInput.contains(" your ") || userInput.contains(" my ") || userInput.contains(" are ") || userInput.contains("you're ") || userInput.contains("to you") || userInput.contains("to me") || userInput.contains("was") || userInput.contains("were")){  
                // special bonus case
                if (userInput.contains("sentient")) {
                    // randomly generate a response from the relevant static array
                    String randomResponse = getRandomSentientResponse();

                    // add response to transcript
                    transcript[i * 2 + 1] = "Carl: " + randomResponse;

                    // print response
                    System.out.println(randomResponse);
                }
                // remove the last character from the string only if it is punctuation
                else if (userInput.charAt(userInput.length() - 1) == '.' || userInput.charAt(userInput.length() - 1) == '!' || userInput.charAt(userInput.length() - 1) == '?') {
                    userInput = userInput.substring(0, userInput.length() - 1);
                    String response = userInput.substring(0, 1).toUpperCase() + userInput.substring(1) + "?";
                    
                    // add response to transcript
                    transcript[i * 2 + 1] = "Carl: " + response;
                    
                    // print response
                    System.out.println(response);
                }
                else {
                    // capitalize the first letter of the string and add a question mark to the end
                    String response_2 = userInput.substring(0, 1).toUpperCase() + userInput.substring(1) + "?";
                    
                    // add response to transcript
                    transcript[i * 2 + 1] = "Carl: " + response_2;
                    
                    // print response
                    System.out.println(response_2);
                } 
            } 
            // bonus case (no mirror words mentioned)
            else if (userInput.contains("sentient")) {
                // randomly generate a response from the relevant static array
                String randomResponse = getRandomSentientResponse();

                // add response to transcript
                transcript[i * 2 + 1] = "Carl: " + randomResponse;

                // print response
                System.out.println(randomResponse);
            }
            // case if userInput contains a question mark
            else if (userInput.contains("?")) {
                // randomly generate a response from the relevant static array
                String randomResponse = getRandomQuestionResponse();

                // add response to transcript
                transcript[i * 2 + 1] = "Carl: " + randomResponse;

                // print response
                System.out.println(randomResponse);
            }
            // case if userInput contains no mirror words or special cases
            else {
                // randomly generate a response from a static array
                String randomResponse = getCannedResponses();

                // add response to transcript
                transcript[i * 2 + 1] = "Carl: " + randomResponse;

                // print response
                System.out.println(randomResponse);
            }
        }
        // close scanner
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