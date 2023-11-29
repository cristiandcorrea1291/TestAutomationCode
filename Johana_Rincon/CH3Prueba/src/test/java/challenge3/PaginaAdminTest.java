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
import challenge3.pageobjects.PrincipalPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginaAdminTest {

    private WebDriver driver;
    private PaginaAdmin paginaAdmin;

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
        principalPage.hacerClicEnEnlaceAdmin();

        // Esperar a que aparezca el elemento
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    }

    @Test
    public void testCrearUsuario() {
        paginaAdmin.botonAdd();
        paginaAdmin.llenarFormulariosAdmin();
        // Agregar aserciones según sea necesario
    }
    
    
    @Test
    public void testBuscarUsuario() {
        paginaAdmin.buscarAdm();
    }
    
    
    @Test
    public void testEditarUsuario() throws InterruptedException {
        PaginaAdmin.EditarUsuario();
        PaginaAdmin.LlenarformEditar();
        // Agregar aserciones según sea necesario
    }

    @Test
    public void testEliminarUsuario() {
        paginaAdmin.EliminarUsuarioIconoBarril();
        // Agregar aserciones según sea necesario
    }

 

    @AfterClass
    public void tearDown() {
        // Cerrar el navegador después de todas las pruebas
        driver.quit();
    }
}
