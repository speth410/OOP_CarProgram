package com.company;

public class VehicleFrame implements Chassis {

    private String vehicleFrameType;

    public VehicleFrame() {
        vehicleFrameType = "Unibody";
    }

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        this.vehicleFrameType = vehicleChassis;
    }

    @Override
    public String toString() {
        return "Chassis: " + chassis +
                "\nVehicle Frame: " + vehicleFrameType;
    }
}
