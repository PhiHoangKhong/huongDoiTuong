public class testHoaDonCaPhe {
	public static void main(String[] args) {
		HoaDonCaPhe hd = new HoaDonCaPhe("Trung Nguyen", 10, 1.5);
		System.out.println("Tong tien: " + hd.tinhTongTien());
		System.out.println("check kl > 2kg: " + hd.checkKhoiLuong(2));
		System.out.println("check kl > 1kg: " + hd.checkKhoiLuong(1));
		System.out.println("check tong tien > 20$: " + hd.checkGiaTien(20));
		System.out.println("check tong tien > 10$: " + hd.checkGiaTien(10));
	}
}
