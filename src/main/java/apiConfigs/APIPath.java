package apiConfigs;

public class APIPath {

    public static final class apiPath{
//      GET request
        public static final String GET_LIST_OF_USERS= "/users";
        public static final String GET_SINGLE_USER= "/users/1";
        public static final String GET_LIST_OF_SUBJECTS= "/subjects";
        public static final String GET_SINGLE_SUBJECT= "/subjects/1";
        public static final String GET_LIST_OF_LOCATIONS= "/location";
        public static final String GET_SINGLE_LOCATION= "/location/1";
//      POST request
        public static final String CREATE_USER= "/users";
        public static final String CREATE_SUBJECT= "/subjects";
        public static final String CREATE_LOCATION= "/location";
//      DELETE request
        public static final String DELETE_USER= "/users/12";
        public static final String DELETE_SUBJECT= "/subjects/12";
        public static final String DELETE_LOCATION= "/location/7";
//      PUT request
        public static final String EDIT_USER= "/users/";
        public static final String EDIT_SUBJECT= "/subjects/";
        public static final String EDIT_LOCATION= "/location/";

    }
}
