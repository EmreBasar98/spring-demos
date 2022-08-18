package mebas.diexample.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"TR", "default"})
@Service("i18nService")
public class i18nTurkishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Merhaba Dünya";
    }
}
