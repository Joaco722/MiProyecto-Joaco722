package t_p_integrador;

import org.testng.Assert;
import t_p_integrador.servicios.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompraTest {
    @BeforeMethod
    public void setup(){
        t_p_integrador.DriverManager.create("edge");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }
    @Test
    public void compraCorrecta() {
        HomeService homeService = new HomeService();
        homeService.select_radiant_tee();

        RadiantTeeService radiantTeeService = new RadiantTeeService();
        radiantTeeService.customize_purchase();
        radiantTeeService.follow_link();

        CartService cartService = new CartService();
        cartService.proceedCheckout();

        ShippingService shippingService = new ShippingService();
        shippingService.completForm("pepe_roni@gmail.com","Pepe",
                                    "Roni","Primero de mayo, 1",
                                    "Argentina", "Concordia",
                                    "3200","34541121122");
        shippingService.submit();

        PaymentService paymentService = new PaymentService();
        paymentService.placeOrder();

        SuccessService successService = new SuccessService();


        Assert.assertEquals(
                successService.getTitleText(),
                "Thank you for purchase!",
                "El titulo no es igual a 'Thank you for purchase!'");

        Assert.assertTrue(
                successService.continueShoppingEnabled(),
                "El boton 'Continue Shopping' no esta habilitado"
        );

        Assert.assertTrue(
                successService.isVisibleCreateAccount(),
                "El boton 'Creat an Account' no es visible"
        );

        Assert.assertTrue(
                successService.isANumberOrderNumber(),
                "El numero de orden no es un numero"
        );

    }
}
