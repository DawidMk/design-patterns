package pl.sda.patterns.structural.facade;

public class WashingFacade {

    private DryingRack dryingRack = new DryingRack();
    private LaundryBasket basket = new LaundryBasket();
    private WashingMachine machine = new WashingMachine();


    public void start() {
        basket.emptyOut();
        machine.loadLaundry();
        machine.chooseProgram();
        machine.setTemperature(50);
        machine.start();
    }


    public void stop() {
        machine.stop();
        machine.extractLaundry();
        dryingRack.removeOldLaundry();
        dryingRack.hangLaundry();

    }
}
