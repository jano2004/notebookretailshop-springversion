package serverapplication.demo;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class CSSController {

    @GetMapping(value = "/css/style.css", produces = "text/css")
    public byte[] getStylesheet() throws IOException {
        Resource resource = new ClassPathResource("static/css/style.css");
        try (InputStream inputStream = resource.getInputStream()) {
            return inputStream.readAllBytes();
        }
    }
}