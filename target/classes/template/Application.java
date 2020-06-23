package ${projPackage};
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;


/****
 * @Author:${Author}
 * @Description:
 * @Date ${Date}
 *****/
@SpringBootApplication
@MapperScan("${projPackage}.dao")
@Component("${projPackage}")
public class ${serviceName}Application {
    public static void main(String[] args) {
        SpringApplication.run(${serviceName}Application.class);
    }

}