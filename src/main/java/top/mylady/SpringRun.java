package top.mylady;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication
public class SpringRun {
    public static void main(String[] args) {

        SpringApplication.run(SpringRun.class, args);
    }
}
