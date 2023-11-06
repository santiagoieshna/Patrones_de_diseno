package porrazo;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		
		int servingSize = 12;
		int serving = 3;
		int calories = 56;
		int fat = 26;
		
		NutritionFacts nutrition = NutritionFacts.builder()
								   .servingSize(servingSize)
								   .serving(serving)
								   .calories(calories)
								   .fat(fat)
								   .build();
		assertNotNull(nutrition);
		System.out.println(nutrition.getServingSize());
	}

}
