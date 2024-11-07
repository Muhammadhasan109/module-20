package apiauto;

public class APITest {
    @Test
    public void getUserTest(){
        //Define baseURI
        RestAssured.baseURI = "https://regres.in/";
        //Test GET api/user?page=1 with total data 6 per page
        given().when().Get("api/usrs?page=1")

    }
}
