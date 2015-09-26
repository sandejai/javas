package string;

public class StripDoubleQuotes {

	public static void main(String[] args) {
		
		String Tid = "   \"ome0336--\"   ".trim();
		System.out.println(Tid + Tid.length());
		
		if((Tid.startsWith("\"")) && (Tid.endsWith("\""))){
			System.out.println("Ys");
			Tid = Tid.substring(1, Tid.length()-1);
			System.out.println("New" + Tid);
		}
	}
}
