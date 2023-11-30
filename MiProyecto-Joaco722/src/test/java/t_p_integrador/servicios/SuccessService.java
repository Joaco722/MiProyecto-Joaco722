package t_p_integrador.servicios;

import t_p_integrador.DriverActions;
import t_p_integrador.DriverManager;
import t_p_integrador.paginas.OnePageSuccess;

public class SuccessService {
    OnePageSuccess onePageSuccess;

    public SuccessService(){
        onePageSuccess= new OnePageSuccess();
    }

    public OnePageSuccess getOnePageSuccess() {
        return onePageSuccess;
    }

    public String getTitleText(){
        return DriverActions.getText(this.onePageSuccess.getTxt_title());
    }

    public Boolean continueShoppingEnabled() {
        return DriverActions.isEnabled(this.onePageSuccess.getBtn_cont_shop());
    }

    public Boolean isVisibleCreateAccount() {
        return DriverActions.isVisible(this.onePageSuccess.getBtn_register());
    }


    public boolean isANumberOrderNumber() {
        return DriverActions.isANumber(this.onePageSuccess.getTxt_order_number());
    }


}
