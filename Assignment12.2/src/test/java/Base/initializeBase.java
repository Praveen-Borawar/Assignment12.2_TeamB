package Base;

import static io.restassured.RestAssured.given;


import ExtentRepo.extendReports;
import Utils.utils;

public class initializeBase extends extendReports {

	public static void getMethod() {

		given().baseUri(utils.URL()).log().all().get(utils.path1()).then().assertThat().statusCode(200).log().all();

	}

	public static void getQueryMethod() {

		given().baseUri(utils.URL()).log().all().queryParam("page", "2").get(utils.path2()).then().assertThat()
				.statusCode(200).log().all();

	}

	public static void postMethod() {

		given().baseUri(utils.URL()).log().all()

				.body(utils.addBody("TeamB", "Intern")).post(utils.path2()).then().assertThat().statusCode(201).log()
				.all();

	}
	

}
