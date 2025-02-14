package PracticasAngel;

enum CarTypes{
    NEW,
    OLD
}

public class Car {
    String model;
    String brand;
    String registration;
    // tipo de vehiculo. Matricula antigua y moderna
    CarTypes type = CarTypes.NEW;

    boolean validateRegistration() {
        if(type.equals(CarTypes.OLD)) {
            if(registration.length() == 8) {
                return true;
            }
            else {
                return false;
            }
        }else {
            if(registration.length() == 7) {
                return true;
            }
            else {
                return false;
            }
        }

    }
}