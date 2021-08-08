package dsca.project;

public class Pollutant {

	public int ID;
	public String pollutant;
	public String amount;
	public String measurementDate;

	public Pollutant(int ID, String pollutant, String amount, String measurementDate) {
		setID(ID);
		setPollutant(pollutant);
		setAmount(amount);
		setMeasurementDate(measurementDate);
	}

	public Pollutant() {

	}

	public int getID() {
		return ID;
	}

	private void setID(int ID) {
		this.ID = ID;
	}

	public String getPollutant() {
		return pollutant;
	}

	private void setPollutant(String pollutant) {
		this.pollutant = pollutant;
	}

	public String getAmount() {
		return amount;
	}

	private void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMeasurementDate() {
		return measurementDate;
	}

	private void setMeasurementDate(String measurementDate) {
		this.measurementDate = measurementDate;
	}

	@Override
	public String toString() {
		return "ID: " + ID + ", Pollutant: " + pollutant + ", Amount: " + amount + ", Measurement Date: "
				+ measurementDate;
	}

}
