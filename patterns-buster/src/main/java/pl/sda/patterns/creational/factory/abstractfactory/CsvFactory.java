package pl.sda.patterns.creational.factory.abstractfactory;

public class CsvFactory implements AbstractFactory<CsvHolder> {
    @Override
    public CsvHolder save(String content, String path) {
        //TODO https://www.baeldung.com/apache-commons-csv
        return null;
    }
}
