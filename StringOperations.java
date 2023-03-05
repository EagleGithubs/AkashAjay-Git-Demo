package Experiment;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "RutUJAThoKal";
System.out.println(name.length());

String capital = name.replaceAll("[^a-z]", "");
System.out.println(capital.length());

String noncapital = name.replaceAll("[^A-Z]","");
System.out.println(noncapital.length());
	}

}
