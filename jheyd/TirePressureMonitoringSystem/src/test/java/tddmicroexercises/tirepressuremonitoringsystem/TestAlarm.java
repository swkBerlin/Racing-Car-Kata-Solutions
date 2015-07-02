package tddmicroexercises.tirepressuremonitoringsystem;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class TestAlarm {

    @Test
    public void alaramIsOffByDefault() {
        Alarm alarm = new Alarm();
        assertEquals(false, alarm.isOn());
    }
    
    @Test
	public void alarmTurnsOnWhenValueAboveMaxThreshold() throws Exception {
		Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(22.0);
		Alarm alarm = new Alarm(sensor);
		
		alarm.check();
		
		assertThat(alarm.isOn(), is(true));
	}
    
    @Test
	public void alarmTurnsOnWhenValueIsBelowMinThreshold() throws Exception {
    	Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(16.0);
		Alarm alarm = new Alarm(sensor);
		
		alarm.check();
		
        assertThat(alarm.isOn(), is(true));
	}
    
    @Test
	public void alarmDoesntTurnOnWhenValueIsBelowMinThreshold() throws Exception {
    	Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(20.0);
		Alarm alarm = new Alarm(sensor);
		
		alarm.check();
		
        assertThat(alarm.isOn(), is(false));
	}
    
}
