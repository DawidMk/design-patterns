package pl.sda.patterns.creational.factory.abstractfactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//TODO change String to Object
//TODO validator jsona -> https://jsonlint.com/
public class JsonFactory implements AbstractFactory<JsonHolder> {
    @Override
    public JsonHolder save(String content, String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("json.json"), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
