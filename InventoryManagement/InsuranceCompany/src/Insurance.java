
public class Insurance {
	private int insuranceID,insuranceNumber;
	private String insuranceType;
	private int premiumFee;
	private String premiumMode;
	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insurance(int insuranceID, int insuranceNumber, String insuranceType, int premiumFee, String premiumMode) {
		super();
		this.insuranceID = insuranceID;
		this.insuranceNumber = insuranceNumber;
		this.insuranceType = insuranceType;
		this.premiumFee = premiumFee;
		this.premiumMode = premiumMode;
	}
	public int getInsuranceID() {
		return insuranceID;
	}
	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}
	public int getInsuranceNumber() {
		return insuranceNumber;
	}
	public void setInsuranceNumber(int insuranceNumber) {
		this.insuranceNumber = insuranceNumber;
	}
	public String getType() {
		return insuranceType;
	}
	public void setType(String type) {
		this.insuranceType = type;
	}
	public int getPremiumFee() {
		return premiumFee;
	}
	public void setPremiumFee(int premiumFee) {
		this.premiumFee = premiumFee;
	}
	public String getPremiumMode() {
		return premiumMode;
	}
	public void setPremiumMode(String premiumMode) {
		this.premiumMode = premiumMode;
	}
	

}
