package pl.sda.patterns.creational.factory.abstractfactory;

public class FactoryProvider {

    public AbstractFactory saveDate(DataType dataType,
                                    String content,
                                    String path) {
        if (dataType == DataType.CSV) {
            return new CsvFactory();
        } else if (dataType == DataType.PDF) {
            return new PdfFactory();
        } else if (dataType == DataType.JSON) {
            return new JsonFactory();
        } else {
            System.out.println("ups");
            return null;
        }
    }

}
