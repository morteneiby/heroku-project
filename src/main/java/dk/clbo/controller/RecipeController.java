package dk.clbo.controller;

import dk.clbo.model.Recipe;
import dk.clbo.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class RecipeController {

    RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository ){
        this.recipeRepository = recipeRepository;
    }
    @GetMapping("/")
    public String index(){

        Optional<Recipe> x = recipeRepository.findById((long) 1);
        System.out.println(x.get().getDescription());

        for (Recipe r : recipeRepository.findAll()) {
            System.out.println(r.getDescription());
        }

        Optional<Recipe> y = recipeRepository.findByCookTime(20);
        System.out.println(y.get().getDescription());

        Optional<Recipe> c = recipeRepository.findByXxx("XXX");

        System.out.println(c.get().getXxx());

        return "index";
    }



}
