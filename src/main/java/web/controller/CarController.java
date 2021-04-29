package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {

   private final CarServiceImpl carServiceImpl = new CarServiceImpl();


    @GetMapping(value = "cars")

    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        model.addAttribute("carList", carServiceImpl.getListFromService(count));
        return "cars";
    }
}
