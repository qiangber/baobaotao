package main.com.baobaotao.attr;

import main.com.baobaotao.reflect.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qiangber on 17-4-7.
 */
public class Boss {
    private List favorites = new ArrayList();
    private Car car;

    public List getFavorites() {
        return favorites;
    }

    public void setFavorites(List favorites) {
        this.favorites = favorites;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
