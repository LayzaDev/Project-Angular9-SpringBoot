package layzadev.github.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Diz ao spring boot que essa classe deve inicializar a aplicação e também configura todo o escaneamento de injeção de dependências.
@SpringBootApplication
public class ClientsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientsApplication.class, args);
    }
}
