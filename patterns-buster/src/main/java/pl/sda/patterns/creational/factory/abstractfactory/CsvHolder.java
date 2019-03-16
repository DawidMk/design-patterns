package pl.sda.patterns.creational.factory.abstractfactory;

public class CsvHolder implements AbstractFactory<CsvHolder> {
    @Override
    public CsvHolder save(String content, String path) {
        return null;
    }
}
