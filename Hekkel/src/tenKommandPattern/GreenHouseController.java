package tenKommandPattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GreenHouseController {
	public static void main(String[] args) {
		GreenHouseControls gc = new GreenHouseControls();
		// gc.addEvent(gc.new Bell(900));
		LinkedList<Event> eventList = new LinkedList<Event>();
		eventList.add(gc.new ThermostatNight(0));
		eventList.add(gc.new LightOn(2000000000));
		eventList.add(gc.new LightOff(400000000));
		eventList.add(gc.new WaterOn(600000000));
		eventList.add(gc.new WaterOf(800000000));
		eventList.add(gc.new ThermostatDay(1400000000));
		eventList.add(gc.new OpenWind(1000000000));
		eventList.add(gc.new CloseWind(2000000000));

		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1)
			gc.addEvent(new GreenHouseControls.Terminate(new Integer(args[0])));
		gc.run();

	}
}
