package pl.sda.patterns.creational.factory.abstractfactory;

import static pl.sda.patterns.creational.factory.abstractfactory.DataType.*;

public class FactoryProvider {

    public AbstractFactory getFactory(DataType dataType) {
        if (CSV == dataType) {
            return new CsvFactory();
        } else if (PDF == dataType) {
            return new PdfFactory();
        } else if (JSON == dataType) {
            return new JsonFactory();
        } else {
            System.out.println("ups");
            return null; //TODO exception
        }
    }

    public void saveData(DataType dataType,
                         String content,
                         String path) {
        AbstractFactory factory = getFactory(dataType);
        factory.save(content, path);
    }

}
