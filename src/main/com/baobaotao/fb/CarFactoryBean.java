package main.com.baobaotao.fb;

import main.com.baobaotao.editor.Car;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by qiangber on 17-4-11.
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0]);
        car.setPrice(Double.parseDouble(infos[1]));
        car.setMaxSpeed(Integer.parseInt(infos[2]));
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
