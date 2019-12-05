package com.company;

public class VehicleChassis implements Chassis {
    private String chassisName;

    public VehicleChassis() {
        chassisName = chassis;
    }

    public VehicleChassis(String chassisName) {
        this.chassisName = chassisName;
    }

    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        chassisName = vehicleChassis;
    }

    @Override
    public String toString() {
        return "Chassis Name: " + chassisName;
    }
}
