package LuisOtB.CraftealoTu.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TraductorService {

    @Autowired
    static
    RestTemplate restTemplate;

    public static String getTraduccion() {
        String url = "https://api.mymemory.translated.net/get?q=";
        ResponseData json = restTemplate.getForObject(url, ResponseData.class);
        return json.translatedtext;
    }
    
}

class ResponseData {
    public String translatedtext;

}
