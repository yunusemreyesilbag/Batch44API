package Base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class jsonplaceholderUrl {

    protected RequestSpecification spec04;

    @Before
    public void setUp(){
        spec04=new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();

    }
}
