package t_p_integrador.servicios;

import t_p_integrador.DriverActions;
import t_p_integrador.paginas.CheckoutPayment;

public class PaymentService {
    CheckoutPayment checkoutPayment;

    public PaymentService(){
        checkoutPayment=new CheckoutPayment();
    }

    public void placeOrder(){
        DriverActions.click(this.checkoutPayment.getDiv_molesto());
        DriverActions.click(this.checkoutPayment.getSubmit_place_order());
    }

}
