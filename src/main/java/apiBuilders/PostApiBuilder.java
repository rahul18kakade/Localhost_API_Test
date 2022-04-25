package apiBuilders;

import io.cucumber.java.it.Ma;

import java.util.HashMap;
import java.util.Map;

public class PostApiBuilder {

    public Map<String, String> postRequestBodyForUsers(){
        Map<String,String> usersBody= new HashMap<String, String>();
        usersBody.put("firstname","amol");
        usersBody.put("lastname","pawar");
        usersBody.put("subjectid","1");
        return usersBody;
    }

    public Map<String,String> postRequestBodyForSubjects(){

        Map<String,String> subjectsBody = new HashMap<>();
        subjectsBody.put("name","Mentor");
        return subjectsBody;
    }

    public Map<String,String> postRequestBodyForLocation(){
        Map<String,String> locationBody= new HashMap<>();
        locationBody.put("name","Chandigarh");
        return locationBody;
    }
}
