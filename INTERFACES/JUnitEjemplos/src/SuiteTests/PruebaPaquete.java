package SuiteTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Demostración Prueba paquete SuiteClases")
@SelectPackages("SuiteClases")

public class PruebaPaquete {

}
