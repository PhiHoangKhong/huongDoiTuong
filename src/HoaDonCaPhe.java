public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1kg;
	private double khoiLuong;

	public HoaDonCaPhe(String ten, double gia, double kl) {
		this.tenLoaiCaPhe = ten;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}

	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;
	}
	
	public boolean checkKhoiLuong(double kl) {
		return this.khoiLuong > kl;
	}
	
	public boolean checkGiaTien(double tongTien) {
		return tinhTongTien() > tongTien;
	}
}
