package com.walking.counterAggregation;

public class CounterService {
    Counter[] counters = new Counter[4];

    Counter[] getAllCounters() {
        return counters;
    }

    void initCounters(Counter[] counters) {
        this.counters = counters;
    }

    Counter getCounterByName(String name) {
        for (Counter counter : this.getAllCounters()) {
            if (counter.getName().equals(name)) {
                return counter;
            }
        }
        return null;
    }

    int increase(String name, int value) {
        Counter counter = getCounterByName(name);
        counter.setCounter(counter.getCounter() + value);

        return counter.getCounter();
    }

    int increase(String name) {
        return increase(name, 1);
    }

    int reset(String name) {
        getCounterByName(name).setCounter(0);
        return 0;
    }
}
