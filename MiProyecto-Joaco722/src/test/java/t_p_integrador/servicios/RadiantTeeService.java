package t_p_integrador.servicios;

import t_p_integrador.DriverActions;
import t_p_integrador.paginas.RadiantTeePage;

public class RadiantTeeService {

    RadiantTeePage radiantTeePage = new RadiantTeePage();

    public RadiantTeeService(){this.radiantTeePage=new RadiantTeePage(); }

    public void customize_purchase(){
        DriverActions.click(this.radiantTeePage.getDiv_size_l());
        DriverActions.click(this.radiantTeePage.getDiv_color_blue());
        DriverActions.insertText(this.radiantTeePage.getInput_number(),"2");
        DriverActions.click(this.radiantTeePage.getBtn_submit());
    }

    public void follow_link (){
        DriverActions.click(this.radiantTeePage.getLink_to_cart());
    }

}
