package mercadolibre;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationMercadoLibre {

    public static void main(String[] args) throws InterruptedException{
        //Definición objeto WebDriver
        WebDriver driver;

        //Declaración de variables
        String baseURL = "https://www.mercadolibre.com";
        String chromePath = System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe";

        //Localización de archivos chromedriver.exe en la propiedad webdriver.chrome.driver
        System.setProperty("webdriver.chrome.driver", chromePath);

        //Abrir navegador
        driver = new ChromeDriver();

        //Navegar en la página (Ingrese al sitio web)
        driver.get(baseURL);

        //Maximizar pantalla
        driver.manage().window().maximize();

        //Clic en opción México(Seleccione México como país)
        WebElement lnkMexico = driver.findElement(By.id("MX"));
        lnkMexico.click();

        //(Busque el término "playstation 4")
        WebElement txtBuscarProductos = driver.findElement(By.name("as_word"));
        txtBuscarProductos.sendKeys("playstation 4");

        //Clic en botón buscar
        WebElement btnBuscar = driver.findElement(By.xpath("//button[@class='nav-search-btn']"));
        btnBuscar.click();
        Thread.sleep(1500);

        //Scroll por pixeles
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1400)","");

        //Clic en elemento filtro Condición "Nuevo"
        WebElement lnkCondicion = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/aside/section[2]/dl[8]/dd[1]/a/span[1]"));
        lnkCondicion.click();
        Thread.sleep(1500);

        //Scroll por pixeles
        //js.executeScript("window.scrollBy(0,1350)","");

        //Clic en elemento filtro Ubicación "Distrito Federal"
        //WebElement lnkUbicacion = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/aside/section[2]/dl[9]/dd[1]/a/span[1]"));
        //lnkUbicacion.click();

        //Obtener el nombre y el precio de los primeros 5 productos
        WebElement title1 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[1]/div/div/div[2]/div[1]/a"));
        System.out.println("El nombre del articulo 1 es : " + title1.getText());

        WebElement price1 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[1]/div/div/div[2]/div[2]/div/div/span[1]/span[2]"));
        System.out.println("El precio del articulo 1 es : " + price1.getText());

        WebElement title2 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[2]/div/div/div[2]/div[1]/a"));
        System.out.println("El nombre del articulo 2 es : " + title2.getText());

        WebElement price2 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[2]/div/div/div[2]/div[2]/div/div/span[1]/span[2]"));
        System.out.println("El precio del articulo 2 es : " + price2.getText());

        WebElement title3 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[3]/div/div/div[2]/div[1]/a"));
        System.out.println("El nombre del articulo 3 es : " + title3.getText());

        WebElement price3 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[3]/div/div/div[2]/div[2]/div/div/span[1]/span[2]"));
        System.out.println("El precio del articulo 3 es : " + price3.getText());

        WebElement title4 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[4]/div/div/div[2]/div[1]/a"));
        System.out.println("El nombre del articulo 4 es : " + title4.getText());

        WebElement price4 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[4]/div/div/div[2]/div[2]/div/div/span[1]/span[2]"));
        System.out.println("El precio del articulo 4 es : " + price4.getText());

        WebElement title5 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[5]/div/div/div[2]/div[1]/a"));
        System.out.println("El nombre del articulo 5 es : " + title5.getText());

        WebElement price5 = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[5]/div/div/div[2]/div[2]/div/div/span[1]/span[2]"));
        System.out.println("El precio del articulo 5 es : " + price5.getText());


        //Cerrar navegador y procesos WebDriver
        //driver.close();
        //driver.quit();
    }
}
