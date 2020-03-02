package com.bartmont.HelloApp.controller;

import com.bartmont.HelloApp.model.Pizza;
import com.bartmont.HelloApp.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HelloController {

    @Autowired
    PizzaRepository pizzaRepository;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("pizza", new Pizza());
        return "home";
    }

    @PostMapping("/pizza")
    public String pizza(@ModelAttribute Pizza pizza){
        pizzaRepository.save(pizza);
        return "pizza";
    }

    @GetMapping("/allPizzas")
    public String pizza(Model model){
        List<Pizza> allPizzas = (List<Pizza>) pizzaRepository.findAll();
        model.addAttribute("allPizzas", allPizzas);
        return "pizzas";
    }


}
