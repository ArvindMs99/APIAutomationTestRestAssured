import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTest2 {

    final static String url="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";

    @Test
    public static void VerifyResponseStatus2(){
        int statusCode= given().queryParam("CUSTOMER_ID","68195")
                .queryParam("PASSWORD","1234!")
                .queryParam("Account_No","1")
                .when().get("https://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
        given().when().get(url).then().assertThat().statusCode(200);

        if(statusCode==200)
        {
            System.out.println("TEST PASSED2");
        }
        else
        {
            System.out.println("TEST FAILED2");
        }
    }
}