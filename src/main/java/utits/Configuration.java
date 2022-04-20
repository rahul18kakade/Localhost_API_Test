package utits;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {

public static void readProperties(){

    try {
        FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\ConfigFiles\\qa.properties");
        Properties prop= new Properties();
        prop.load(fis);
    } catch (Exception e) {
        e.printStackTrace();
    }



}

}
