public class java33 {
	private int day, month, year;

	public java33(int d, int m, int y) {
		if (d >= 1 && d <= 31)
			this.day = d;
		else
			this.day = 1;

		if (m >= 1 && m <= 12)
			this.month = m;
		else
			this.month = 1;

		if (y > 0)
			this.year = y;
		else
			this.year = 1;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int ngay) {
		if (ngay >= 1 && ngay <= 31)
			this.day = ngay;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int thang) {
		if (thang >= 1 && thang <= 12)
			this.month = thang;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int nam) {
		if (nam > 0)
			this.year = nam;
	}

}
