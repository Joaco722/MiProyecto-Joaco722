package t_p_integrador.servicios;

import t_p_integrador.DriverActions;
import t_p_integrador.paginas.CheckoutShipping;

public class ShippingService {

    CheckoutShipping checkoutShipping;

    public ShippingService (){
        checkoutShipping=new CheckoutShipping();
    }

    public void completForm(String email, String firstname, String lastname, String street, String country, String city, String postcode, String phonenumber){
        DriverActions.insertText(this.checkoutShipping.getInput_email(), email);
        DriverActions.insertText(this.checkoutShipping.getInput_firstname(), firstname);
        DriverActions.insertText(this.checkoutShipping.getInput_lastname(), lastname);
        DriverActions.insertText(this.checkoutShipping.getInput_street(), street);
        DriverActions.selectOption(this.checkoutShipping.getSelect_country(),country);
        DriverActions.insertText(this.checkoutShipping.getInput_city(), city);
        DriverActions.insertText(this.checkoutShipping.getInput_postcode(),postcode);
        DriverActions.insertText(this.checkoutShipping.getInput_phone(),phonenumber);
        DriverActions.click(this.checkoutShipping.getInput_radio());
    }
    public void submit(){
        DriverActions.click(this.checkoutShipping.getBtn_submit());
    }
}
