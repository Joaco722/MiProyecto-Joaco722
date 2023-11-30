package t_p_integrador.paginas;

import org.openqa.selenium.By;

public class CheckoutShipping {

    By input_email = By.id("customer-email");
    By input_firstname = By.name("firstname");
    By input_lastname = By.name("lastname");
    By input_street = By.name("street[0]");
    By select_country = By.name("country_id");
    By input_city = By.name("city");
    By input_postcode = By.name("postcode");
    By input_phone = By.name("telephone");
    By input_radio = By.name("ko_unique_1");
    By btn_submit = By.xpath("//button[@data-role='opc-continue']");

    public By getInput_email() {
        return input_email;
    }

    public By getInput_firstname() {
        return input_firstname;
    }

    public By getInput_lastname() {
        return input_lastname;
    }

    public By getInput_street() {
        return input_street;
    }

    public By getSelect_country() {
        return select_country;
    }

    public By getInput_city() {
        return input_city;
    }

    public By getInput_postcode() {
        return input_postcode;
    }

    public By getInput_phone() {
        return input_phone;
    }

    public By getInput_radio() {
        return input_radio;
    }

    public By getBtn_submit() {
        return btn_submit;
    }
}
