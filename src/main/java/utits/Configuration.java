package utits;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

public static Properties readProperties(String base_URI) {

    try {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\ConfigFiles\\qa.properties");
       Properties prop = new Properties();
       prop.load(fis);
       return prop;
    }  catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
}
