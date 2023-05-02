package plates.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CustomPlatesApplication
{
    private static final Logger log = LoggerFactory.getLogger(CustomPlatesApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CustomPlatesApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PlatesRepository repository) {
        return args -> {
            String empty = "";
            String line = "-------------------------------";

            repository.save(new Plate("WM09OTU", false, 30.00));
            repository.save(new Plate("AB06NFW", true, 40.50));
            repository.save(new Plate("BN45BWE", false, 120.11));
            repository.save(new Plate("LN09OTU", false, 100.00));
            repository.save(new Plate("AB06DEG", true, 40.50));
            repository.save(new Plate("BN32BWE", false, 11.11));

            // fetch plates containing "OTU"
            log.info(empty);
            log.info("Plates found with findPlateByRegistrationNumberContaining(\"OTU\"):");
            log.info(line);
            repository.findPlateByRegistrationNumberContaining("OTU").forEach(plate -> log.info("{}", plate));
            log.info(empty);
        };
    }

}
