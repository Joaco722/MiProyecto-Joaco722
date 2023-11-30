package t_p_integrador.paginas;

import org.openqa.selenium.By;

public class HomePage {

    By title_element= By.xpath("//*[@alt='Radiant Tee']");

    public By getElement() {
        return title_element;
    }
}
