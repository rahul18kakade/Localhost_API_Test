package utits;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

public static String readProperties(String url) {

    String base_URI = null;
    try {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\ConfigFiles\\qa.properties");
        Properties prop = new Properties();
        prop.load(fis);
        base_URI = prop.getProperty("base_URI");


    } catch (Exception e) {
        e.printStackTrace();
    }

    return base_URI;
}
}
