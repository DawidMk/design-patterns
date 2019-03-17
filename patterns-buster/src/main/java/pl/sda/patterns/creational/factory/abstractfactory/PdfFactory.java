package pl.sda.patterns.creational.factory.abstractfactory;

public class PdfFactory implements AbstractFactory<PdfHolder> {
    @Override
    public PdfHolder save(String content, String path) {
        //TODO https://www.baeldung.com/java-pdf-creation
        return null;
    }
}
