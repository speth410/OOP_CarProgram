package com.company;

import java.util.Date;

public class Car extends Vehicle {
    private Feature[] feature = new Feature[10];
    private int carAxle;

    public Car() {
        super();
        feature = new Feature[]{new InteriorFeature("No Interior Features")
                , new ExteriorFeature("No Exterior Features")};
        carAxle = 2;
    }

    public Car(String vehicleManufacturer, Date vehicleManufacturedDate, String vehicleMake
            , String vehicleModel, String vehicleType, Chassis vehicleFrame, Engine vehicleEngine
            , Feature[] feature, int carAxle) {

        super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame
                , vehicleType, vehicleEngine);

        this.feature = feature;
        this.carAxle = carAxle;
    }

    public String getExteriorFeatures() {
        String allFeatures = "";

        for (Feature value : feature) {
            if (value instanceof ExteriorFeature) {
                if (allFeatures.length() == 0) {
                    allFeatures += value;
                } else {
                    allFeatures += "\n\t\t\t\t : " + value;
                }
            }
        }
        return allFeatures;
    }

    public String getInteriorFeatures() {
        String allFeatures = "";

        for (Feature f : feature) {
            if (f instanceof InteriorFeature) {
                if (allFeatures.length() == 0) {
                    allFeatures += f;
                } else {
                    allFeatures += "\n\t\t\t\t : " + f;
                }
            }
        }
        return allFeatures;
    }

    @Override
    public String toString() {
        String allFeatures = "";

        for (Feature f : feature) {
            if (allFeatures.length() == 0) {
                allFeatures += f;
            } else {
                allFeatures += "\n\t\t: " + f;
            }
        }
        return super.toString() + "\n" +
                "Features: " + allFeatures + "\n" +
                "Car Axle: " + carAxle;
    }
}
