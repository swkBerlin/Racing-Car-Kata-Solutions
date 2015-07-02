package tddmicroexercises.leaderboard;

public class SelfDrivingCar implements IDriver {

    private final String company;

    public String getAlgorithmVersion() {
        return algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

    private String algorithmVersion;

    public SelfDrivingCar(String algorithmVersion, String company) {
        this.algorithmVersion = algorithmVersion;
        this.company = company;
    }

	@Override
	public String getName() {
        return "Self Driving Car - " + company + " (" + getAlgorithmVersion() + ")";
	}
}