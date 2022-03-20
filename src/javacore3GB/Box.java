package javacore3GB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> listBox = new ArrayList<>();


    // задание d
    public float getWeight() {
        float a = 0;
        for (T Fruit : listBox) {
            a += Fruit.getWeight();
        }
        return a;
    }

    // задание f
    public void swapFruitToBox(Box<T> box) {
        listBox.addAll(box.listBox);
        box.listBox.clear();
    }

    // задание e
    public boolean compare (Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.00001;
    }

    // задание g
    public void boxFritAdd(T t) {
        listBox.add((T) t);
    }
}

