/**
 * This is my first Java code, which run javadoc
 * @author  Muyang
 * @version  1.0
 */
public class CountUpExample{
	/**
	 * This method count up the number from zero.
	 * @param  count The number count to.
	 */
	public void Countup(int count){
		for(int i = 1; i <= count; i++){
			System.out.println(i);
		}
		System.out.println("\nAll done!");
	}
	/**
	 * Main now only creates a new instance of 
	 * my program and calls the program's method
	 * @param args The program does not use this parameter.
	 */
	public static void main(String[] args){
		CountUpExample t = new CountUpExample();
		t.Countup(5);
	}
	
}