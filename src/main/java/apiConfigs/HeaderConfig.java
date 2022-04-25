package apiConfigs;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfig {
    public Map<String,String> defaultHeader(){
        Map<String,String> defaultHeader = new HashMap<String,String >();
        defaultHeader.put("Content-Type","application/json");

        return defaultHeader;
    }

}
