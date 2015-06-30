package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm {
	private final double LowPressureTreshold = 17;
	private final double HighPressureTreshold = 21;

	Sensor sensor;

	boolean on = false;

	public Alarm(Sensor sensor) {
		this.sensor = sensor;
	}

	public Alarm() {
		this(new Sensor());
	}

	public void check() {
		double psiPressureValue = sensor.popNextPressurePsiValue();

		if (psiPressureValue < LowPressureTreshold || psiPressureValue > HighPressureTreshold) {
			on = true;
		}
	}

	public boolean isOn() {
		return on;
	}
}
