package ru.vsu.cs.volkova;

public class WhethereExt extends Whether {
    private double temperature;

    public WhethereExt(double pressure, String text, double temperature) {
        super(pressure, text);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String description() {
        String result;
        if (temperature < 0) {
            result = "frost";
        }
        else if (temperature < 15) {
            result = "chilly";
        }
        else if (temperature < 30) {
            result = "warm";
        }
        else {
            result = "hot";
        }
        return result;
    }

}
