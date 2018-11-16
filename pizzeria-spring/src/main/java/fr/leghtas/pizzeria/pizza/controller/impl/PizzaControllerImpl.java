package fr.leghtas.pizzeria.pizza.controller.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import fr.leghtas.pizzeria.domain.Pizza;
import fr.leghtas.pizzeria.pizza.buisiness.IPizzaBuisiness;
import fr.leghtas.pizzeria.pizza.controller.IPizzaController;
@Controller
public class PizzaControllerImpl implements IPizzaController{
@Autowired
private IPizzaBuisiness pizzaBuisiness;
	@Override
	@RequestMapping("/test")
	
	public String test(Model model) {
		
		String chaine = "Tests : Controller et Vue";
		model.addAttribute("ch", chaine);
		return "test";
	}
	@RequestMapping("/tableau")
	public String getTableau (Model model) {
	
		List<String> liste = new ArrayList<String>();
		liste.add("Bonjour");
		liste.add("Bonsoir");
		liste.add("Salut");
		liste.add("Helloo");
		
		model.addAttribute("liste", liste);
		
		
		return "tableau";
	}
@RequestMapping("/pizzas")
public String afficherPizzas (Model model) {
List<String> pizzas = pizzaBuisiness.getListe();
model.addAttribute("pizzas", pizzas);
return "pizza/pizzas";

}
@RequestMapping("/pizzaprix")
public String afficherPizzasPrix (Model model) {
	List<Pizza> pizzas = pizzaBuisiness.getPizzas();
	model.addAttribute("pizzasprix", pizzas);
	
	
	return "pizza/pizzas-prix" ;
}
}
