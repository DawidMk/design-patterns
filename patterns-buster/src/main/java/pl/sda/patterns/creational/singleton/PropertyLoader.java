package pl.sda.patterns.creational.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//TODO read connection.properties from the file
class PropertyLoader {

    private Properties properties = new Properties();

    public void init() {
        if (properties.isEmpty()) {
            InputStream stream = this.getClass().getClassLoader().getResourceAsStream("connection.properties");


            try {
                properties.load(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String getDb() {
        return getProperty("db");
    }

    public String getPassword() {
        return getProperty("password");
    }

    public String getUser() {
        return getProperty("user");
    }

    public String getAddress() {
        return getProperty("address");
    }

    private String getProperty(String property) {
        return properties.getProperty(property);
    }


}