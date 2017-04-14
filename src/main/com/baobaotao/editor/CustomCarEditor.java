package main.com.baobaotao.editor;

import java.beans.PropertyEditorSupport;

/**
 * Created by qiangber on 17-4-10.
 */
public class CustomCarEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (text == null || text.indexOf(",") == -1) {
            throw new IllegalArgumentException("设置的字符串格式不正确");
        }
        String[] infos = text.split(",");
        Car car = new Car();
        car.setMaxSpeed(Integer.parseInt(infos[0]));
        car.setPrice(Double.parseDouble(infos[1]));
        car.setBrand(infos[2]);

        setValue(car);
    }
}
