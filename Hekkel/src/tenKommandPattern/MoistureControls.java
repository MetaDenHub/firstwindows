package tenKommandPattern;

public class MoistureControls extends GreenHouseControls {
	public static class Terminate extends Event {

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}
		@Override
		public String toString() {
			return "terminating";
		}

	}

	public class MoistureOn extends Event {
		private boolean moisture = false;
		public MoistureOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			moisture = true;
		}
		
		@Override
		public String toString() {
			return "moisturing";
		}
	}
	
	public class MoistureOff extends Event {
		private boolean moisture = false;
		public MoistureOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			moisture = false;
		}
		
		@Override
		public String toString() {
			return "no moisturing";
		}
	}
	
	public class Restart extends Event {
		Event[] evList;
		public Restart(long delayTime, Event[] evList) {
			super(delayTime);
			this.evList = evList;
			for (Event event : evList) {
				addEvent(event);
			}
		}

		
		@Override
		public void action() {
			
		}
		
		@Override
		public String toString() {
			return "restarting";
		}
	}
}
