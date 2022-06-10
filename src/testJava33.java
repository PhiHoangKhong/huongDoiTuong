public class testJava33 {
	public static void main(String[] args) {
		java33 md = new java33(31, 10, 2021);
		System.out.println("Day: " + md.getDay());
		md.setDay(35);
		System.out.println("Day: " + md.getDay());
		md.setDay(10);
		System.out.println("Day: " + md.getDay());

		System.out.println("Month: " + md.getMonth());
		System.out.println("Year: " + md.getYear());
	}
}
