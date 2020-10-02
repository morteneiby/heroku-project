package dk.clbo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @OneToOne
    private Notes notes;

    @OneToMany(mappedBy = "recipe")
    private Set<Ingredient> ingredients;

    @ManyToMany(mappedBy = "recipes")
    private Set<Category> categories;


}

