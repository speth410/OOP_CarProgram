package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1);

        System.out.println("____________________________________________________");

        Feature[] f = {new InteriorFeature("AM/FM Radio")
                , new ExteriorFeature("Wood Panels")
                , new InteriorFeature("Air Conditioning")
                , new ExteriorFeature("Moonroof")};

        Car car2 = new Car("Honda", new Date(), "Honda", "Prelude"
                , "Coupe", new VehicleChassis("Unibody")
                , new ManufacturedEngine("Honda", new Date(), "H-series"
                , "H23A1"
                , "2WD: Two-Wheel Drive", 4, "88AKI"), f, 2);

        System.out.println(car2);


    }
}
