package eightbitsbigbyte;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;



/**
 * Created by gillianreynolds-titko on 2/28/17.
 */
public class JasonParser {
    LoginPage page = new LoginPage();


    public void parse() throws IOException{
        byte[] mapData = Files.readAllBytes(Paths.get("http://127.0.0.1:8100/"));
        Map<String,String> myMap = new HashMap<String, String>();

        ObjectMapper objectMapper = new ObjectMapper();
        myMap = objectMapper.readValue(mapData, HashMap.class);
        System.out.println(myMap);
    }

}

