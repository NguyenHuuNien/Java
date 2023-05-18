package learnRegex;

public class TestRegex {

	public static void main(String[] args) {
		String s = "";
		s = s.toLowerCase();
//		if(s.length()==0) return s;
		s = s.replaceAll("[^a-zA-Z0-9[' '],]*", " ");
		s = s.replaceAll("[' ']+", " ");
		s = s.replaceAll("[^a-zA-z0-9]*[,]", ",");
		s = s.replaceAll("^[^a-zA-Z0-9]+", "");
		s = s.replaceAll("[^a-zA-Z0-9]+$", "");
		s = s.substring(0, 1).toUpperCase() + s.substring(1) + "?";
		System.out.println(s);
	}
}
