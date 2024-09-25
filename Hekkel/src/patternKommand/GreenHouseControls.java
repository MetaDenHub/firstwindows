package patternKommand;

import java.util.LinkedList;
import java.util.List;

public class GreenHouseControls extends Controller {
	private boolean light = false;

	public class LightOn extends Event {

		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = true;
		}

		public String toString() {
			return "Light is On";
		}
	}

	public class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
		}

		public String toString() {
			return "Light is Off";
		}
	}

	private boolean water = false;

	public class WaterOn extends Event {
		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = true;
		}

		public String toString() {
			return "Water is On";
		}
	}

	public class WaterOf extends Event {
		public WaterOf(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = false;
		}

		public String toString() {
			return "Water is Off";
		}
	}

	private String thermostat = "Day";

	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Night";
		}

		public String toString() {
			return "Thermostat is Night";
		}
	}

	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Day";
		}

		public String toString() {
			return "Thermostat is Day";
		}
	}
	
	private boolean wind = false;
	
	public class OpenWind extends Event {
		public OpenWind(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			wind = true;
		}
		
		public String toString() {
			return "wind is open";
		}
	}
	
	public class CloseWind extends Event {
		public CloseWind(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			wind = false;
		}
		
		public String toString() {
			return "wind is close";
		}
	}

	public class Bell extends Event {
		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}

		public String toString() {
			return "�AM!";
		}
	}

	public class Restart extends Event {
		private LinkedList<Event> eventList = new LinkedList<>();

		public Restart(long delayTime, LinkedList<Event> eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event event : eventList) {
				addEvent(event);
			}
		}

		@Override
		public void action() {
			for (Event event : eventList) {
				event.start();
				addEvent(event);
			}
			start();
			addEvent(this);
		}

		public String toString() {
			return "Restarting";
		}

	}

	public static class Terminate extends Event {
		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}

		public String toString() {
			return "Terminating";
		}
	}
}
