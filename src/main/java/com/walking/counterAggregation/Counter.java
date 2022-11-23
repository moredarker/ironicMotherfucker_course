package com.walking.counterAggregation;

public class Counter {
    public final String NAME;
    public final String UNIT;
    public int counter;

    public Counter(String name, String unit) {
        this(name, 0, unit);
    }

    public Counter(String name, int counter, String unit) {
        this.counter = counter;
        this.NAME = name;
        this.UNIT = unit;
    }

    public String getName() {
        return NAME;
    }

    public String getUnit() {
        return UNIT;
    }

    public int getCounter() {
        return counter;
    }

    void setCounter(int counter) {
        this.counter = counter;
    }
}

