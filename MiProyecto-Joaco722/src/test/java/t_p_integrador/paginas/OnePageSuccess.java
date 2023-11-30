package t_p_integrador.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import t_p_integrador.DriverActions;
import t_p_integrador.DriverManager;


public class OnePageSuccess {



    By txt_title;

    By btn_cont_shop= By.linkText("Continue Shopping");

    By btn_register = By.cssSelector(".action.primary");

    By txt_number_order=By.xpath("//h1[@class='page-title']");

    public OnePageSuccess (){
        DriverActions.wait(10);
        txt_title = By.xpath("//h1[@class='page-title']/span");
    }


    public By getTxt_title() {
        return txt_title;
    }

    public By getBtn_cont_shop() {
        return btn_cont_shop;
    }

    public By getBtn_register() {
        return btn_register;
    }

    public By getTxt_order_number() {
        return txt_number_order;
    }
}
