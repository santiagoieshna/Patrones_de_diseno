package porrazo;

public class NutritionFacts {

	// obligatorias
	private  int servingSize;
	private  int servings;
	// opcionales
	private  int calories;
	private  int fat;
	
	private void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}
	private void setServings(int servings) {
		this.servings = servings;
	}
	private void setCalories(int calories) {
		this.calories = calories;
	}
	private void setFat(int fat) {
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
