package serverapplication.demo.computer.office.pc.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class OfficePCStyle {
    @GetMapping(value = "/css/specifiedStyles/officePC.css", produces = "text/css")
    public byte[] getStylesheet() throws IOException {
        Resource resource = new ClassPathResource("static/css/specifiedStyles/officePC.css");
        try (InputStream inputStream = resource.getInputStream()) {
            return inputStream.readAllBytes();
        }
    }
}
