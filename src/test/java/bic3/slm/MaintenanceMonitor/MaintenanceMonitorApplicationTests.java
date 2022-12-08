package bic3.slm.MaintenanceMonitor;

import bic3.slm.MaintenanceMonitor.controller.MaintenanceMonitorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class MaintenanceMonitorApplicationTests {

	String defaultm = "everything works as expected";

	MaintenanceMonitorController generatortest = new MaintenanceMonitorController();

	@Test
	void MessageGenerated(){

		//System.out.println(generatortest.currentStatus());
		Assertions.assertEquals(defaultm, generatortest.currentStatus());
	}


	@Test
	void ManualEntryDisplayedCorrectly() {

		//method:   https://www.baeldung.com/java-random-string
		byte[] arrlength = new byte[10];
		new Random().nextBytes(arrlength);
		String randString = new String(arrlength);


		generatortest.updateStatus(randString);
		Assertions.assertEquals(randString, generatortest.currentStatus());


	}


	@Test
	void MessageResettoDefault(){

		generatortest.resetStatus();
		Assertions.assertEquals(defaultm, generatortest.currentStatus());

	}


	@Test
	void contextLoads()
	{

	}




}
