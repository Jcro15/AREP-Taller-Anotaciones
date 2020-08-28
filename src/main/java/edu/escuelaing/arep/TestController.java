package edu.escuelaing.arep;

public class TestController {

    @RequestMapping("/test")
    public static String index() {
        return "Greetings from Spring Boot! 10/10";
    }
}
