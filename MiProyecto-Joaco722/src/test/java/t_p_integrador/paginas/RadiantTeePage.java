package t_p_integrador.paginas;

import org.openqa.selenium.By;

public class RadiantTeePage {

    By link_to_cart = By.xpath("//a[contains(text(), 'shopping cart')]");
    By div_size_l = By.id("option-label-size-143-item-169");
    By div_color_blue = By.id("option-label-color-93-item-50");
    By input_number = By.id("qty");
    By btn_submit = By.id("product-addtocart-button");
    public By getLink_to_cart() {
        return link_to_cart;
    }

    public By getDiv_size_l() {
        return div_size_l;
    }

    public By getDiv_color_blue() {
        return div_color_blue;
    }

    public By getInput_number() {
        return input_number;
    }

    public By getBtn_submit(){
        return btn_submit;
    }
}
