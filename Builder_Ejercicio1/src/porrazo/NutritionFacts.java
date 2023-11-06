package porrazo;

public class NutritionFacts {

	// obligatorias
	public  int servingSize;
	private  int servings;
	// opcionales
	private  int calories;
	private  int fat;
	
	public static ServingSize builder() {
		return new BuilderNutritionFacts();
	}
	
	// Puro invent mio por un error del test
	public NutritionFacts() {
		super();
		this.servingSize = 0;
		this.servings = 0;
		this.calories = 0;
		this.fat = 0;
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}
	public void setServings(int servings) {
		this.servings = servings;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getServingSize() {
		return servingSize;
	}
	public int getServings() {
		return servings;
	}
	public int getCalories() {
		return calories;
	}
	public int getFat() {
		return fat;
	}
	
	
}
