package separate;

public class Separate {
	String[] array;
	
	public String[] separate(String original) {
		array = original.split("\\*");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		return array;
	}
}
