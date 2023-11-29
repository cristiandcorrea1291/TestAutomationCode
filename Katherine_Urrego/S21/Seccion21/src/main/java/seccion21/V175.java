package seccion21;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class V175 {

	//VIDEO 175 How to Create Screenshot Utility in Base Test class for catching Failed test
	
	//es que cada vez que una prueba falle, automáticamente tome una captura de pantalla.
	//Luego, debemos implementar un informe, para que la captura de pantalla se adjunte a el informe HTML.
	
	/* en la clase SubmitOrderTest.java se agrega este bloque de codigo
	 	//video 175
		public String getScreenShot(String testCaseName) throws IOException {
		    // Convertir el controlador (driver) a TakesScreenshot
		    TakesScreenshot ts = (TakesScreenshot) driver;
		    // Obtener la captura de pantalla como un archivo (File)
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    // Especificar la ubicación y el nombre del archivo de destino
		    File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		    FileUtils.copyFile(source, file);
		    // Devolver la ruta completa del archivo de captura de pantalla
		    return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		}

	 * */
	
	
	// se continua en la seccion 22
	
}
