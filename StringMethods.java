package Experiment;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Harshal";
String surname="Deore";
String classname="FusionInstitute";
String course="jAVAPoWErbiPythonC+";
 System.out.println(name.concat(surname));
 System.out.println(classname.charAt(5));
 System.out.println(course.isBlank());
 System.out.println(surname.length());
 System.out.println(classname.replace(classname, surname));
 System.out.println(name.replace(name, surname));
 System.out.println(course.toLowerCase());
 System.out.println(course.toUpperCase());
 System.out.println(name.hashCode());
System.out.println(classname.contains(course));
	}}

 