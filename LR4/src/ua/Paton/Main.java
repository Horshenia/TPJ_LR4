package ua.Paton;

public class Main {
	
	public static void main(String[] arg) {
		System.out.println("1)\nisSpaceChar - перевірює наявність пробелів");
		System.out.println("Character.isSpaceChar(\'0\') = "+Character.isSpaceChar('0'));
		System.out.println("2)\nРакета - 🚀(U+1F680)"
				+ "\nУсміхнене обличчя - ☺(U+263A)"
				+ "\nОбличчя в сонячних окулярах - 😎(U+1F60E)");
		String r = "Рядок";
		System.out.println("3)\nДо: "+r);
		r=r.substring(0,r.length()-1);
		System.out.println("Після: "+r);
	}
}
