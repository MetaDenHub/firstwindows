package patternKommand;

import patternKommand.MoistureControls.Terminate;

public class MoistureController {
	public static void main(String[] args) {
		
		MoistureControls mc = new MoistureControls();
		Event[] evList = {mc.new LightOn(3000), mc.new LightOff(540456), mc.new MoistureOn(1000), 
				mc.new MoistureOff(1000)};
		
		
		mc.addEvent(mc.new Restart(10000, evList));
		if (args.length == 1)
			mc.addEvent(new MoistureControls.Terminate(new Integer(0)));
		mc.run();
		
	}
}
