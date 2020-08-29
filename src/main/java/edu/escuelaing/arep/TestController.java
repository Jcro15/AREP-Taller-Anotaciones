package edu.escuelaing.arep;

public class TestController {

    @RequestMapping("/")
    public static String index() {
        return "Greetings from Spring Boot! 10/10";
    }

    @RequestMapping("/hello")
    public static String hi(){
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "\n" +
                "</head>\n" +
                "<h1 class=\"display-4\" style=\"text-align:center\">Hola mundo</h1>\n" +
                "<img src= \"/logoesc.png\" >"+
                "\n" +
                "<body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" >\n" +
                "<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n" +
                "<script src=\"https://unpkg.com/axios/dist/axios.min.js\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
