package BasicLearning_TestNG;
import org.testng.annotations.*;

public class GroupAttributee {
	
	@Test(groups = "Software company")
	public void Infosys () {
		
		System.out.println("Infosys");
	}

		@Test(groups = "Software company")
		public void Wipro () {
			
			System.out.println("Wipro");
		}

			@Test(groups = "Automobile company")
			public void Maruti () {
				
				System.out.println("Maruti");
			}
				

				@Test(groups = "Automobile company")
				public void tata () {
					
					System.out.println("tata");
}
}
