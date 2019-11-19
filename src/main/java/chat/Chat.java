package chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chat {
public String getGreeting() {
        return "Hello world.";
}

public static void main(String[] args) {
        System.out.println(new Chat().getGreeting());
        SpringApplication.run(Chat.class, args);
}
}
