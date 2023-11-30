package t_p_integrador.paginas;

import org.openqa.selenium.By;

public class CheckoutCart {

    By btn_checkout= By.xpath("//button[@data-role='proceed-to-checkout']");

    public By getBtn_checkout() {
        return btn_checkout;
    }
}
