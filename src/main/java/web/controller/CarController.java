package web.controller;

import dao.CarDAO;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarDAO carDao = new CarDAO();

    @GetMapping(value = "carss")

    public String printWelcome(ModelMap model) {
        model.addAttribute("carList", carDao.getCarList());

        return "cars";
    }
}
