package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class utils {

	public static String URL() {

		String URL = "https://reqres.in";
		return URL;
	}

	public static String addBody(String name, String job) {
		String body = "{\r\n" + "    \"name\": \"" + name + "\",\r\n" + "    \"job\": \"" + job + "\"\r\n" + "}";
		return body;
	}

	public static String path1() {
		String path1 = "/api/users/2";
		return path1;
	}

	public static String path2() {
		String path2 = "/api/users/";
		return path2;
	}

	public static String getCurrentDateTime() {

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'_hh-mm-ss'Z' ");
		Date date = new Date();
		String a = formatter.format(date);
		return a;

	}
}
