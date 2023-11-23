package MVC;

public class Model {

		public float num;
		
		public void multiply(float fattore1, float fattore2)
		{
			
			num = fattore1*fattore2;
			
			return;
		}
		
		public void clear()
		{
			num = 0;
			
			return;
		}
}
