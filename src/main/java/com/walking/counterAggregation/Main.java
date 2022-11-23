package com.walking.counterAggregation;

public class Main {
    public static void main(String[] args) {
        CounterService service = new CounterService();
        service.initCounters(new Counter[] {
            new Counter("Газ", "м³/ч"),
            new Counter("Холодная вода", "м³"),
            new Counter("Горячая вода", "м³"),
            new Counter("Электричество", "м³")}
        );

        Main.printCounter(service);

        System.out.println(service.getCounterByName("Электричество"));
    }

    private static void printCounter(CounterService service) {

        for (Counter counter : service.getAllCounters()) {
            System.out.println(counter.getName() + ": " + counter.getCounter());
        }
    }
}