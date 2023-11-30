package t_p_integrador.paginas;

import org.openqa.selenium.By;

public class CheckoutPayment {

    By div_molesto = By.className("billing-address-details");
    By submit_place_order = By.xpath("//button[@title='Place Order']");

    public By getDiv_molesto() {
        return div_molesto;
    }

    public By getSubmit_place_order() {
        return submit_place_order;
    }
}
