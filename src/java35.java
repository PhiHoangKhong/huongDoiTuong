public class java35 {
	private int day, month, year;

	public java35(int day, int month, int year) {
		if (day >= 1 && day <= 31)
			this.day = day;
		else
			this.day = 1;

		if (month >= 1 && month <= 12)
			this.month = month;
		else
			this.month = 1;

		if (year > 0)
			this.year = year;
		else
			this.year = 1;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31)
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0)
			this.year = year;
	}

//	@Override
//	public String toString() {
//		return "java35 [day=" + day + ", month=" + month + ", year=" + year + "]";
//	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		java35 other = (java35) obj;
		if (day != other.day)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
}
