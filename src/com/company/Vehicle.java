package com.company;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;

    public Vehicle() {
        vehicleManufacturedDate = new Date();
        vehicleManufacturer = "Generic";
        vehicleMake = "Generic";
        vehicleModel = "Generic";
        vehicleFrame = new VehicleFrame();
        vehicleType = "None";
        driveTrain = "2WD: Two-Wheel Drive";
        vehicleEngine = new ManufacturedEngine();
        vehicleEngine.setEngineType("88 AKI");
        vehicleEngine.setDriveTrain("2WD: Two-Wheel Drive");
    }

    public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer
            , String vehicleMake, String vehicleModel
            , Chassis vehicleFrame, String vehicleType
            , Engine vehicleEngine) {

        this.vehicleManufacturedDate = vehicleManufacturedDate;
        this.vehicleManufacturer = vehicleManufacturer;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleFrame = vehicleFrame;
        this.vehicleType = vehicleType;
        this.vehicleEngine = vehicleEngine;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        vehicleEngine.setEngineManufacturer(manufacturer);
    }

    @Override
    public void setEngineMake(String engineMake) {
        vehicleEngine.setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        vehicleEngine.setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        vehicleEngine.setDriveTrain(driveTrain);
    }

    @Override
    public void setEngineType(String fuel) {
        vehicleEngine.setEngineType(fuel);
    }

    @Override
    public Chassis getChassisType() {
        return vehicleFrame;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        vehicleFrame.setChassisType(vehicleChassis);
    }

    @Override
    public String toString() {
        return "\nManufacturer Name: " + vehicleManufacturer +
                "\nManufactured Date: " + vehicleManufacturedDate +
                "\nVehicle Make: " + vehicleMake +
                "\nVehicle Model: " + vehicleModel +
                "\nVehicle Type: " + vehicleType
                + "\n"
                + vehicleEngine.toString();
    }
}
