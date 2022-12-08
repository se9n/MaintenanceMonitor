package bic3.slm.MaintenanceMonitor;

import bic3.slm.MaintenanceMonitor.controller.MaintenanceMonitorController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaintenanceMonitorApplicationTests {

	@Test
	void MessageGenerated(){


		String defaultm = "everything works as expected";

		MaintenanceMonitorController generatortest = new MaintenanceMonitorController();
		System.out.println(generatortest.currentStatus());
		Assertions.assertEquals(defaultm, generatortest.currentStatus());
	}

	void contextLoads() {
	}




}
