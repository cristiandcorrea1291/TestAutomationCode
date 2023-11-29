package seccion21;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class V174 {

	
	//1. SE CREA EL PACKAGE EN EL SRC/TEST/JAVA que se llama rahultshettyacademy.data
	// 2. se crea un nuevo FILE de extension json que se llama PurchaseOrder.json
	
	/*
	 en el archivo json se consignan los 2 conjutos de datos o Datasets
		[	 
			 {
		    "email" : "katherine-melissa.urrego@capgemini.com",
		    "password": "Katherine2023*",
		    "product" : "ZARA COAT 3"
		      
		  },
		  
		  {
		      "email" : "katherine-melissa.urrego@capgemini.com",
		      "password": "Katherine2023*",
		      "product" : "ADIDAS ORIGINAL"
		      
		  }
		  
		 ]
		  
		  con eso se escanareara el jason y se craeará el HashMap AUTOMATICAMENTE
		 
		
	 */
	
	
	// 3. se crea la clase DataReader
	//se confgur ala ruta para que busque y lea el json automaticamente
	// 4. se importa la dependencia del JACKSON DATABIND para convertir el json de string a HashMap
	
	/*
	 * <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-
	 * databind --> <dependency> <groupId>com.fasterxml.jackson.core</groupId>
	 * <artifactId>jackson-databind</artifactId> <version>2.16.0</version>
	 * </dependency>
	 * 
	 */
	
	

	// 4. en el codigo:
	// Estamos leyendo el valor. Eso significa que creamos un objeto de esta clase llamada object mapper,
	//Así que en esta clase hay un método llamado readValue que puede leer la cadena o string y convertirla en un hash map.
	//Así que por eso, para llamar a este método, primero creé un objeto y usando ese objeto, con el punto, llamé al método de esta clase.
	//Y en este método espera dos argumentos.
	//El primer argumento es la cadena que quiero convertir en un hash map.
	//Y en el segundo argumento, necesito decir cómo quiero convertirlo
	//porque ahora hay algo complicado aquí.
	//Entonces, hay dos matrices presentes en tu JSON.... significa dos índices.
	//Esta es una matriz que tiene dos índices.
	//Así que estoy diciendo claramente que continúe y cree dos hash maps
	//y estos dos hash maps póngalos en una lista.
	
	/*
	 //para traer o retrieve los valores del json de acuerdo al requerimiento
		public class DataReader {
		
			public List<HashMap<String, String>> getJsonDataToMap() throws IOException
			{
				//read json to string
			String jsonContent = 	FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\rahultshettyacademy\\data\\PurchaseOrder.json"), 
					StandardCharsets.UTF_8);
			
			//String to HashMap- Jackson Datbind
			
			ObjectMapper mapper = new ObjectMapper();
			  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
		      });
			  return data;
			
			//{map, map}
			}
			
		}
	 */
	
	
	
	//ahora cambiamos el codifo para  llamar los fragmentos de datos a traves de sus index desde el BaseTest P
	//3 . se agrega al SubmitOrderTest.java
	
	
	/*
	 	
	Este código utiliza TestNG's @DataProvider para proporcionar datos a los métodos de prueba. 
	Los datos se obtienen del archivo JSON PurchaseOrder.json mediante la llamada al método getJsonDataToMap. 
	Se espera que este método devuelva una lista de HashMaps, y luego esos HashMaps se utilizan como argumentos para 
	el método de prueba que utiliza este @DataProvider 	
	// video 173
	@DataProvider
			public Object[][] getData() throws IOException {
				 
				List <HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\rahultshettyacademy\\data\\PurchaseOrder.json");
				return new Object[][] { {data.get(0) }, {data.get(1)} };
				
				
				//HashMap<String, String> map = new HashMap<String, String>();//173
				//map.put("email", "katherine-melissa.urrego@capgemini.com");
				//map.put("password", "Katherine2023*");
				//map.put("product", "ZARA COAT 3");
				
				//HashMap<String, String> map1 = new HashMap<String, String>();
				//map1.put("email", "katherine-melissa.urrego@capgemini.com");
				//map1.put("password", "Katherine2023*");
				//map1.put("product", "ADIDAS ORIGINAL");
		
			}
	 */
	
	
	//4 . se agrega al BaseTest.java
	/*Este código define un método getJsonDataToMap que lee el contenido de un archivo JSON y
	 *  utiliza la biblioteca Jackson para convertir ese contenido en una lista de HashMaps. 
	 *  Cada HashMap representará un conjunto de datos que se utilizarán en las pruebas. (en el json tenemos 2 conjunts de datos)
	 * 
	 	//VIDEO 174
				public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException
				{
					//read json to string
				String jsonContent = 	FileUtils.readFileToString(new File(filePath), 
						StandardCharsets.UTF_8);
				
				//String to HashMap- Jackson Datbind
				
				ObjectMapper mapper = new ObjectMapper();
				  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
			      });
				  return data;
				
				//{map, map}
				}
	 */
	
	

}
