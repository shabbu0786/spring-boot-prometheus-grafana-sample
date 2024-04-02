package jp.ahaoretama.springbootprometheusgrafanasample.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

   @RequestMapping("/error")
   public String handleError() {
       // Your custom error handling logic goes here
       return "error"; // Return the name of your custom error page
   }

   public String getErrorPath() {
       return "/error";
   }
}