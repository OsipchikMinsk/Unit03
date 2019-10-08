package by.epam.unit03.counter;

import java.util.Random;

 class Counter {
    private int min;
    private int max;
    private int count;

     Counter(){
        this.min=0;
        this.max = 1000;
    }

     Counter(int min, int max) {
        this.min = min;
        this.max = max;
        count = new Random().nextInt((max - min) + 1) + min;
    }

     void increase() {
        if (count != max) {
            count++;
        }
    }

     void decrease() {
        if (count != min) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}
