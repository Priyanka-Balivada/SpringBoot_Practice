package com.starterprogram.hello;

// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.nio.file.Paths;
// import java.util.Map;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        // String str = "";

        // try {
        // // create object mapper instance
        // ObjectMapper mapper = new ObjectMapper();

        // // convert JSON file to map
        // Map<String, String> map = mapper.readValue(Paths.get("data.json").toFile(),
        // Map.class);

        // // print map entries
        // for (Map.Entry<String, String> entry : map.entrySet()) {
        // str = entry.getValue().toString();
        // }

        // } catch (Exception ex) {
        // ex.printStackTrace();
        // }

        return "Hello World";
    }
}
