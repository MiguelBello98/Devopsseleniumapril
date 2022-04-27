package configReadExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigDemo {

	Properties pro;

	public ReadConfigDemo() throws Exception {

		FileInputStream fis = new FileInputStream("./configfile/ConfigData.properties");

		pro = new Properties();

		pro.load(fis);

	}
@Test
	public String getAppURL() {

		String appURL = pro.getProperty("appURL");
		return appURL;

	}
	@Test
	public String getAdminUser() {

		return pro.getProperty("userName");

	}
	@Test
	public String getAdminPassword() {

		return pro.getProperty("password");

	}

}
