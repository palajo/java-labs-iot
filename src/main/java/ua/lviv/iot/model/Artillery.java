package ua.lviv.iot.model;

public class Artillery extends AbstractWartechnic {

    int rocketsQuantity;

    public Artillery(double engineVolume, double fuelConsumption, double maxSpeed, int passengersCapacity,
                     double fireRange, Levels damage, Types armorType, int rocketsQuantity) {
        super(engineVolume, fuelConsumption, maxSpeed, passengersCapacity, fireRange, damage, armorType);
        this.rocketsQuantity = rocketsQuantity;
    }

    public Artillery(){
    }

    public int getRocketsQuantity() {
        return rocketsQuantity;
    }

    public void setRocketsQuantity(int rocketsQuantity) {
        this.rocketsQuantity = rocketsQuantity;
    }

}
