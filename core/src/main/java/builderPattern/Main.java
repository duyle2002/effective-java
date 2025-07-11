package builderPattern;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 5).build();
        System.out.println(nutritionFacts);
    }
}
