package pixel.acaademy.setter_injection_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TurkishChef implements Chef {
    @Override
    public String getDailyRecipe(){
        return "Poached Eggs with Garlic Yoghurt, Turkish Style - Cilbir";
    }
}
