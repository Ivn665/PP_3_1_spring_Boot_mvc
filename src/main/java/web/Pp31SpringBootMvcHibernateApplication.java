package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication(scanBasePackages="web")
public class Pp31SpringBootMvcHibernateApplication {

    public static void main(String[] args){
        SpringApplication.run(Pp31SpringBootMvcHibernateApplication.class, args);
        System.out.println("Started");

        try {
            openHomePage();
        } catch (IOException e) {
            System.out.println("Не удалось автоматически открыть стартовую страницу в браузере");
        }
    }
    private static void openHomePage() throws IOException {
        Runtime rt = Runtime.getRuntime();
        rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8080/users");
    }
}
