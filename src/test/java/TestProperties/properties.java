package TestProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties object = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") +"/automation_chitale/src/test/resources/object.properties");
		object.load(fis);
		System.out.println(object.getProperty("url"));

	

}
}
