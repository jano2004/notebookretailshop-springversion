package serverapplication.demo.Computer.Office.Notebook;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.io.InputStream;

@RestController
public class OfficeNotebookStyle {
    @GetMapping(value = "/css/specifiedStyles/officeNB.css", produces = "text/css")
    public byte[] getStylesheet() throws IOException {
        Resource resource = new ClassPathResource("static/css/specifiedStyles/officeNB.css");
        try (InputStream inputStream = resource.getInputStream()) {
            return inputStream.readAllBytes();
        }
    }
}
