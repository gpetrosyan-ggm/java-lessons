package com.demo.lesson12.homework.enums;

public enum Technique {
    TV(2, "220 v", 200),
    MIXER(1, "220v"),
    FRIDGE(1, "220v", "big");

    private int count;
    private String powerUnit;
    private int channel;
    private String volume;

    Technique(int count, String powerUnit, int channel) {
        this.count = count;
        this.powerUnit = powerUnit;
        this.channel = channel;
    }

    Technique(int count, String powerUnit) {
        this.count = count;
        this.powerUnit = powerUnit;
    }

    Technique(int count, String powerUnit, String volume) {
        this.count = count;
        this.powerUnit = powerUnit;
        this.volume = volume;
    }

    public int getCount() {
        return count;
    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public int getChannel() {
        return channel;
    }

    public String getVolume() {
        return volume;
    }
}
