package web.controller;

import dao.CarDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {
    private final CarDAO carDao = new CarDAO();

    @GetMapping(value = "cars")

    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count >= 5) {
            model.addAttribute("carList", carDao.getCarList());
        } else {
            model.addAttribute("carList", carDao.getCarList().subList(0, count));
        }
        return "cars";
    }
}
