public class Student {
	private int idNumber;
	private int creditHours;
	private int gradePointAvg;
	private int pointsEarned;
	private char classification;

	public Student() {
		this.idNumber = 0;
		this.creditHours = 0;
		this.pointsEarned = 0;
		this.gradePointAvg = 0;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public int getGradePointAvg() {
		return gradePointAvg;
	}

	public void setIdNumber(int id) {
		this.idNumber = id;
	}

	public void setCreditHours(int credit) {
		this.creditHours = credit;
	}

	public void setPointsEarned(int points) {
		this.pointsEarned = points;
	}

	public int getPointsEarned() {
		// points = creditHours * 4;
		return pointsEarned;
	}

	public int gradePointAvg() {
		gradePointAvg = pointsEarned / creditHours;
		return gradePointAvg;
	}

	public char classify() {
		if(creditHours*4 == pointsEarned) {
			classification = 'A';
		} else if(creditHours*4 != pointsEarned) {
			classification = 'B';
		} else if(creditHours == 1) {
			classification = 'C';
		}
		return classification;
	}


}