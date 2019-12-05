package com.company;

import java.util.Date;

public class ManufacturedEngine implements Engine {

    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    public ManufacturedEngine() {
        engineManufacturer = "Generic";
        engineManufacturedDate = new Date();
        engineMake = "Generic";
        engineModel = "Generic";
        engineCylinders = 0;
        engineType = "85 AKI";
        driveTrain = "2WD: Two-Wheel Drive";
    }

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate
            , String engineMake, String engineModel, String engineType
            , int engineCylinders, String driveTrain) {

        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = engineManufacturedDate;
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;

    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = engineManufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = engineType;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public Date getEngineManufacturedDate() {
        return engineManufacturedDate;
    }

    public String getEngineMake() {
        return engineMake;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getEngineCylinders() {
        return engineCylinders;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    @Override
    public String toString() {
        return "\nEngine Manufacturer: " + engineManufacturer
                + "\nEngine Manufactured: " + engineManufacturedDate
                + "\nEngine Make: " + engineMake
                + "\nEngine Model: " + engineModel
                + "\nEngine Type: " + engineType
                + "\nEngine Cylinders: " + engineCylinders
                + "\nDrive Train: " + driveTrain;
    }
}
