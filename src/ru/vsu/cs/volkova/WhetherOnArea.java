package ru.vsu.cs.volkova;

public class WhetherOnArea {

    public static void main(String[] args) {
        WhethereExt whether = new WhethereExt(92.98, "clear", 32.0);
        WhethereExt whether1 = new WhethereExt(105.4, "cloudy", 15.0);
        Area area = new Area(72.0, 132.0, AreaEnum.plain, whether);
        Area area1 = new Area(45.0, 37.0, AreaEnum.hilly, whether1);
        System.out.println("Width - " + area.getWidth() + " longitude - " + area.getLongitude() + " type of area - "
                + area.toWrite() + ", now this " + whether.getText() + ", pressure " + whether.getPressure() + ", temperature "
                + whether.getTemperature() + ", description - " + whether.description());

        System.out.println("Width - " + area1.getWidth() + " longitude - " + area1.getLongitude() + " type of area - "
                + area1.toWrite() + ", now this " + whether1.getText() + ", pressure " + whether1.getPressure() + ", temperature "
                + whether1.getTemperature() + ", description - " + whether1.description());
    }
}
