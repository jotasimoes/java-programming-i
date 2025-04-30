
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static ArrayList<Recipe> bookRecipe = new ArrayList<Recipe>();

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    // Initial prompt for the file
    System.out.println("File to read: ");
    String file = sc.nextLine();
    loadRecipes(file);

    // Command prompt
    System.out.println("\nCommands:");
    System.out.println("list - lists the recipes");
    System.out.println("stop - stops the program");
    System.out.println("find name - searches recipes by name");
    System.out.println("find cooking time - searches recipes by cooking time");
    System.out.println("find ingredient - searches recipes by ingredient");

    // Now process the commands
    while (true) {
        System.out.println("\nEnter command: ");
        String command = sc.nextLine();

        if (command.equals("list")) {
            ListRecipes();
        } else if (command.equals("stop")) {
            break;
        } else if (command.equals("find name")) {
            System.out.println("Searched word: ");
            String search = sc.nextLine();
            searchRecipeName(search);
        } else if (command.equals("find cooking time")) {
            System.out.println("Max cooking time: ");
            int maxTime = Integer.valueOf(sc.nextLine());
            searchRecipeTime(maxTime);
        } else if (command.equals("find ingredient")) {
            System.out.println("Ingredient: ");
            String searchedIngredient = sc.nextLine();
            searchRecipeIngredient(searchedIngredient);
        }
    }
}
    
    public static void  searchRecipeIngredient(String searchedIngredient){       
        System.out.println("Recipes:");
        for(Recipe recipe:bookRecipe){
            for(int i=0;i<recipe.getIngredients().size();i++){
                if(recipe.getIngredients().get(i).equals(searchedIngredient)){
                    System.out.println(recipe.toString());
                }
                
            }
            
            
            
            
        }
    }
    
    public static void  searchRecipeTime(int maxTime){
        System.out.println("Recipes:");
        for(Recipe recipe:bookRecipe){
            if(recipe.getTime()<=maxTime){
                System.out.println(recipe.toString());
            }
        }
    }
    
    
    public static void searchRecipeName(String name){
        System.out.println("Recipes:");
        for(Recipe recipe:bookRecipe){
            if(recipe.getName().contains(name)){
                System.out.println(recipe.toString());
            }
        }
        
        
        
    }
    
    
    

    private static void loadRecipes(String file) {
    bookRecipe.clear();  // Ensure we clear the list before adding new recipes

    try (Scanner reader = new Scanner(Paths.get(file))) {
        while (reader.hasNextLine()) {
            String nameTemporario = reader.nextLine();
            int timeTemporario = Integer.valueOf(reader.nextLine());
            ArrayList<String> ingredientsTemporario = new ArrayList<>();

            while (reader.hasNextLine()) {
                String ingredient = reader.nextLine();

                if (ingredient.isEmpty()) {
                    break;
                }
                ingredientsTemporario.add(ingredient);
            }

            // Add the recipe to bookRecipe
            Recipe temporaryRecipe = new Recipe(nameTemporario, timeTemporario, ingredientsTemporario);
            bookRecipe.add(temporaryRecipe);
        }
    } catch (Exception e) {
        System.out.println("Error reading the file: " + e.getMessage());
    }
}

    
   public static void ListRecipes() {
    System.out.println("Recipes:");
    for (Recipe recipe : bookRecipe) {
        System.out.println(recipe.toString());
    }
}
}
