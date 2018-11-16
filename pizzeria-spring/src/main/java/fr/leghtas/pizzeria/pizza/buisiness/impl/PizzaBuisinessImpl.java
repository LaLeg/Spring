package fr.leghtas.pizzeria.pizza.buisiness.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.leghtas.pizzeria.domain.Pizza;
import fr.leghtas.pizzeria.pizza.buisiness.IPizzaBuisiness;

@Service

public class PizzaBuisinessImpl implements IPizzaBuisiness {

	@Override
	public List<String> getListe() {
		List<String> liste = new  ArrayList<>();
		liste.add("Fruits de mer");
		liste.add("4 Fromages");
		liste.add("Chèvre Miel");
		liste.add("Américaine");

		return liste;
	}

	@Override
	public List<Pizza> getPizzas() {
		List<Pizza> pizzasListe = new ArrayList<>();
		Pizza p1 = new Pizza("Fruits de mer", 10.50);
		Pizza p2 = new Pizza("4 Fromages", 8.90);
		Pizza p3 = new Pizza("Chèvre Miel", 15);
		Pizza p4 = new Pizza("Américaine", 16.50);
		
		pizzasListe.add(p1);
		pizzasListe.add(p2);
		pizzasListe.add(p3);
		pizzasListe.add(p4);
		
		return pizzasListe;
	}

}
