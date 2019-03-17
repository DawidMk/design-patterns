package pl.sda.patterns.structural.facade;

public class WashingMachine {

    public void loadLaundry() {

    }

    public void setTemperature(int degrees) {
        if(degrees == 0){
            throw new RuntimeException
                    ("should not be 0");
        }

    }

    public void chooseProgram() {

    }

    public void start() {

    }

    public void stop() {

    }

    public void extractLaundry() {
    }
}
