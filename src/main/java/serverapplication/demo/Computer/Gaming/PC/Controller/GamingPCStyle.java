package serverapplication.demo.Computer.Gaming.PC.Controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class GamingPCStyle {
    @GetMapping(value = "/css/specifiedStyles/gamingPC.css", produces = "text/css")
    public byte[] getStylesheet() throws IOException {
        Resource resource = new ClassPathResource("static/css/specifiedStyles/gamingPC.css");
        try (InputStream inputStream = resource.getInputStream()) {
            return inputStream.readAllBytes();
        }
    }
}
