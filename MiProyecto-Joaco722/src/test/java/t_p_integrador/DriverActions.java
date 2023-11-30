package t_p_integrador;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DriverActions {
    public static void click(By element){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );

        DriverManager.getDriver().findElement(element).click();
    }

    public static void insertText(By element, String text){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );

        //Limpiamos el contenido del input
        DriverManager.getDriver().findElement(element).clear();

        //Ingresamos el texto en el input
        DriverManager.getDriver().findElement(element).sendKeys(text);
    }

    public static String getText(By element) {
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );

        return DriverManager.getDriver().findElement(element).getText();
    }

    public static Boolean isVisible(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
    }

    public static Boolean isEnabled(By element) {
        return DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element),
                        ExpectedConditions.elementToBeClickable(element)
                )
        );
    }

    public static void selectOption(By element, String option){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );

        Select dropdown = new Select(DriverManager.getDriver().findElement(element));
        dropdown.selectByVisibleText(option);
    }

    public static Boolean isANumber(By element){
        DriverManager.getWait().until(
                ExpectedConditions.and(
                        ExpectedConditions.presenceOfElementLocated(element),
                        ExpectedConditions.visibilityOfElementLocated(element)
                )
        );
        String text = DriverManager.getDriver().findElement(element).getText();
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Metodo con todas las malas practicas
    public static void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
