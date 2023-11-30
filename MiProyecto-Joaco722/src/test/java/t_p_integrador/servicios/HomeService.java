package t_p_integrador.servicios;
import t_p_integrador.DriverActions;
import t_p_integrador.paginas.HomePage;

public class HomeService {

    private HomePage homePage;

    public HomeService(){
        homePage = new HomePage();
    }

    public void select_radiant_tee(){
        DriverActions.click(this.homePage.getElement());
    }

}
