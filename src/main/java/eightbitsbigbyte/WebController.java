package eightbitsbigbyte;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.IOException;

/**
 * Created by gillianreynolds-titko on 2/28/17.
 */

@Controller
public class WebController extends WebMvcConfigurerAdapter {

    JasonParser jasonParser = new JasonParser();

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(LoginPage loginForm) {
        return "form";
    }

    @PostMapping("/")
    public boolean checkPersonInfo(@Valid LoginPage loginForm) throws IOException{

        jasonParser.parse();
        if (loginForm.getName().equals("Admin") && loginForm.getPassword().equals("password")) {
            return true;
        }

        return false;
    }



}
