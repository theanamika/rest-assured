package APITEST;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
public class E_commerce {
	public String accessToken;
	public static String baseurl = "https://ecommerceservice.herokuapp.com";
	// it will not execute that method
	@Test ( priority = 0, enabled= false)
	public void sign_up()
	{
		RestAssured.baseURI = baseurl;
		 String requestbody = "{\r\n"
		 		+ "	\"email\": \"anamika22345@gmail.com\",\r\n"
		 		+ "	\"password\": \"anamika3456\"\r\n"
		 		+ "}\r\n"
		 		+ "";
		
		 //This time i want to know what my response is in my console
		 Response response = given()
				 .header("content-Type","application/json")
				 .body(requestbody)
				
				 .when()
				 .post("/user/signup")
				
				 .then()
				 .assertThat().statusCode(201).contentType(ContentType.JSON)
				 //to extract the response
				 .extract().response();
		 //to print response
		 System.out.println(response.asString());
		 //
		 // i have to convert into jsOn, converting response to variable
		
		 String jsonresponse = response.asString();
		 //
		 JsonPath responsebody =new JsonPath(jsonresponse); // basically convert normal string to json path
		 System.out.println(responsebody.get("message"));
		 
	
		
	}
	@Test ( priority = 1)
	public void login()
	{
		RestAssured.baseURI = baseurl;
		 String requestbody = "{\r\n"
		 		+ "	\"email\": \"anamika22345@gmail.com\",\r\n"
		 		+ "	\"password\": \"anamika3456\"\r\n"
		 		+ "}\r\n"
		 		+ "";
		
		 //This time i want to know what my response is in my console
		 Response response = given()
				 .header("content-Type","application/json")
				 .body(requestbody)
				
				 .when()
				 .post("/user/login")
				
				 .then()
				 .assertThat().statusCode(200).contentType(ContentType.JSON)
				 //to extract the response
				 .extract().response();
		 //to print response
		 System.out.println(response.asString());
		 //
		 // i have to convert into jsOn, converting response to variable
		
		 String jsonresponse = response.asString();
		 //
		 JsonPath responsebody =new JsonPath(jsonresponse); // basically convert normal string to json path
		 System.out.println(responsebody.get("acessToken"));
		 accessToken = responsebody.get("accessToken");
		
		
		
	
		
	}
}