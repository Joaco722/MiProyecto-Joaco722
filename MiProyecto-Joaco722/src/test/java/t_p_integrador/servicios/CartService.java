package t_p_integrador.servicios;

import t_p_integrador.DriverActions;
import t_p_integrador.paginas.CheckoutCart;

public class CartService {
    CheckoutCart checkoutCart;

    public CartService(){this.checkoutCart = new CheckoutCart(); }

    public void proceedCheckout(){
        DriverActions.click(this.checkoutCart.getBtn_checkout());
    }
}
