package main.com.baobaotao.context;

import main.com.baobaotao.reflect.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by qiangber on 17-4-6.
 */
@Configuration
public class Beans {

    @Bean(name = "car")
    public Car buildCar() {
        return new Car("大众", "white", 150);
    }
}
