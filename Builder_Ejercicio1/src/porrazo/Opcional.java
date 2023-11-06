package porrazo;

public interface Opcional extends NutritionFactsBuilder{
	Opcional calories(int amount);
	Opcional fat(int kilogram);
	NutritionFacts build();
}
