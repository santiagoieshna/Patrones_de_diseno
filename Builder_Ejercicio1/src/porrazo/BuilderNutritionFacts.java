package porrazo;

public class BuilderNutritionFacts implements Serving, ServingSize, Opcional {
	private NutritionFacts nutrition;
	
	public ServingSize builder() {
		this.nutrition = new NutritionFacts();
		return this; 
	}
	
	@Override
	public Serving servingSize(int size) {
		builder();
		this.nutrition.setServingSize(size);
		return this;
	}
	
	@Override
	public Opcional serving(int amount) {
		this.nutrition.setServings(amount);
		return this;
	}
	
	@Override
	public Opcional calories(int amount) {
		this.nutrition.setCalories(amount);
		return this;
	}

	@Override
	public Opcional fat(int kilogram) {
		this.nutrition.setFat(kilogram);
		return this;
	}

	@Override
	public NutritionFacts build() {
		return this.nutrition;
	}
}
