public class testJava35 {
	public static void main(String[] args) {
		java35 md1 = new java35(15, 5, 2025);
		java35 md2 = new java35(15, 5, 2025);
		java35 md3 = new java35(02, 10, 2002);
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);

		System.out.println("md1 = md2: " + md1.equals(md2));
		
		System.out.println("md1: " + md1.hashCode());
		System.out.println("md2: " + md2.hashCode());
		System.out.println("md3: " + md3.hashCode());
	}
}
