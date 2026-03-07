package Pages;

import Hooks.BrowserDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import static Hooks.BrowserDriver.driver;

public class MetodosPage {

    //region
    public static SimpleDateFormat formatoFechaActual = new SimpleDateFormat("ddMM");
    public static String fechaActual = formatoFechaActual.format(new Date());
    static Random randomNUM = new Random();
    public static int randomNumber = 100 + randomNUM.nextInt(900);
    public static By okBtn = By.className("btn-success");
    public static By confirmarBtn = By.className("swal2-confirm");

    //endregion
    public MetodosPage() {
    }

    public static void esClickeable(int duracion, By elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duracion));
        WebElement elementoClickeable = wait.until(ExpectedConditions.elementToBeClickable(elemento));

        if (elementoClickeable.isDisplayed()) {
            elementoClickeable.click();
        }
    }

    public static void seleccionarOptLista(int duracion, By dwnElememto, By OptElemento) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duracion));
        boolean opcionesVisibles = false;
        int intentos = 0;
        while (!opcionesVisibles && intentos < 5) {
            try {
                driver.findElement(dwnElememto).click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(OptElemento));
                opcionesVisibles = true;

            } catch (Exception e) {
                intentos++;
                System.out.println("Intento " + intentos + ": Las opciones no están visibles. Volviendo a hacer clic en el dropdown.");
            }
        }

        if (opcionesVisibles) {
            driver.findElement(OptElemento).click();
        } else {
            System.out.println("No se pudieron mostrar las opciones después de varios intentos.");
        }
    }

    public static void clickearHastaDesaparecer(By elemento) throws InterruptedException {
        try {
            while (driver.findElement(elemento).isDisplayed()) {
                try {
                    System.out.println("Botón visible, intentando hacer clic.");
                    driver.findElement(elemento).click();
                    System.out.println("Clic realizado con éxito.");
                    Thread.sleep(500);
                } catch (org.openqa.selenium.ElementClickInterceptedException e) {
                    System.out.println("El botón no es clicable en este momento.");
                }
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("El botón  ya no está presente en la página.");
        }
    }

    public static void clickearHastaExistir(By elemento1, By elemento2) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            while (true) {
                try {
                    // Intentar hacer clic en el botón
                    WebElement botonElemento = wait.until(ExpectedConditions.elementToBeClickable(elemento1));
                    botonElemento.click();
                    System.out.println("Botón presionado. Verificando si el modal aparece...");

                    // Verificar si el modal ha aparecido
                    WebElement modalElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento2));
                    if (modalElemento.isDisplayed()) {
                        System.out.println("El modal ha aparecido.");
                        break;  // Sale del bucle si el modal aparece
                    }
                } catch (org.openqa.selenium.ElementClickInterceptedException e) {
                    System.out.println("El clic fue interceptado, reintentando...");
                    Thread.sleep(1000); // Espera antes de reintentar
                } catch (org.openqa.selenium.TimeoutException e) {
                    System.out.println("No se pudo encontrar el botón o el modal en el tiempo esperado.");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Error en la espera.");
            Thread.currentThread().interrupt();
        }
    }

    public static void confirmarCreacion() {
        driver.findElement(confirmarBtn).click();
        driver.findElement(okBtn).click();
    }

    public static void esperarHastaDesaparecer(int duracion, By elemento) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duracion));
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(elemento));
            System.out.println("El elemento ha desaparecido.");
        } catch (TimeoutException e) {
            System.out.println("El elemento no desapareció dentro del tiempo especificado.");
        }
    }

    public static void cerrarModal1(int duracion, By elemento) throws InterruptedException {
        Thread.sleep(500);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duracion));
        WebElement elementoClickeable = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        while (elementoClickeable.isDisplayed()) {
            System.out.println("Modal visible, presionando ESC.");
            elementoClickeable.sendKeys(Keys.ESCAPE);
            Thread.sleep(500);
        }
        System.out.println("Modal cerrado exitosamente.");
    }
    public static void esperarVisibilidad(int duracion, By elemento) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duracion));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}
