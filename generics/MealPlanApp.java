
interface MealPlan {  
    String getDescription();  
}  


class VegetarianMeal implements MealPlan {  
    @Override  
    public String getDescription() {  
        return "Vegetarian Meal";  
    }  
}  

class VeganMeal implements MealPlan {  
    @Override  
    public String getDescription() {  
        return "Vegan Meal";  
    }  
}  

 
class Meal<T extends MealPlan> {  
    private T meal;  

    public Meal(T meal) {  
        this.meal = meal;  
    }  

    public T getMeal() {  
        return meal;  
    }  
}  


class MealPlanGenerator {  
    public <T extends MealPlan> void validateAndGenerateMealPlan(T mealPlan) {  
        System.out.println("Generating " + mealPlan.getDescription());  
    }  
}  


public class MealPlanApp {  
    public static void main(String[] args) {  
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());  
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());  

        MealPlanGenerator generator = new MealPlanGenerator();  
        generator.validateAndGenerateMealPlan(vegetarianMeal.getMeal());  
        generator.validateAndGenerateMealPlan(veganMeal.getMeal());  
    }  
}