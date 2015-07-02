package tddmicroexercises.leaderboard;

public class Driver implements IDriver {

    private final String name;
    private final String country;

    public Driver(String name, String country) {
        this.name = name;
        this.country = country;
    }

	@Override
	public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}