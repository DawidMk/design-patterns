package pl.sda.patterns.creational.factory.abstractfactory;

public class PdfFactory implements AbstractFactory<PdfHolder> {

    @Override
    public PdfHolder save(String content, String path) {
        return null;
    }
}
