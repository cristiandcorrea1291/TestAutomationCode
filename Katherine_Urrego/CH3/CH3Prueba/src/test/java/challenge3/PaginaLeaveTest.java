package challenge3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import challenge3.pageobjects.LogIn;
import challenge3.pageobjects.PaginaAdmin;
import challenge3.pageobjects.PaginaLeave;
import challenge3.pageobjects.PaginaPIM;
import challenge3.pageobjects.PaginaTime;
import challenge3.pageobjects.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginaLeaveTest {

    private WebDriver driver;
    private PaginaLeave paginaleave;

    @BeforeClass
    public void setUp() {
        // Configurar el controlador del navegador y crear una instancia del navegador
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        
        LogIn loginPage = new LogIn(driver);
        // ir a la pagina web
        loginPage.goTo();
        System.out.println("Ingresé a la pagina web");

        // login usando Action Methods del LogIn
        PrincipalPage principalPage = loginPage.loginApplication("Admin", "admin123");
        System.out.println("Inicie sesión en la pagina web");
        
        // ADMIN PAGE
        principalPage.hacerClicEnEnlaceLeave();

        // Esperar a que aparezca el elemento
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test
    public void testCreateLeavePeriod() {
    	paginaleave.leavePeriodsMenu();
    	paginaleave.CreateLeavePeriod();

    }
    
    
    @Test
    public void testAddEntitlementIndivual() {
    	paginaleave.AddMenu();
    	paginaleave.AddEntitlementIndivual();
    }
    
    
    @Test
    public void testAddEntitlementMultiple() {
    	paginaleave.AddMenu();
    	paginaleave.AddEntitlementMultiple();
    }
    
    @Test
    public void testbuscarVac(){
    	paginaleave.buscarVac();
    }

    @Test
    public void testAprobarVac(){
    	paginaleave.AprobarVac();
    }
    
    @Test
    public void testRejectVac(){
    	paginaleave.RejectVac();
    }
 

    @AfterClass
    public void tearDown() {
        // Cerrar el navegador después de todas las pruebas
        driver.quit();
    }
}
