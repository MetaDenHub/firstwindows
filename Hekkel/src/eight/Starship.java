package eight;

class AlertStatus {
	public void alert() {
		System.out.println("AlertStatus");
	}
}

class AsteroidsAlert extends AlertStatus {
	public void alert() {
		System.out.println("Asteroids!");
	}
}

class AtackAlert extends AlertStatus {
	public void alert() {
		System.out.println("Atack!");
	}
}

class LandingAlert extends AlertStatus {
	public void alert() {
		System.out.println("Landing!");
	}
}

class StarshipPanel {
	AlertStatus alert = new AlertStatus();
	public void asteroidsAlert() {
		alert = new AsteroidsAlert();
	}

	public void atackAlert() {
		alert = new AtackAlert();
	}

	public void landingAlert() {
		alert = new LandingAlert();
	}

	public void alert() {
		alert.alert();
	}
}

public class Starship {

	public static void main(String[] args) {
		StarshipPanel sp = new StarshipPanel();
		sp.alert();
		sp.asteroidsAlert();
		sp.alert();
		sp.atackAlert();
		sp.alert();
		sp.landingAlert();
		sp.alert();
	}

}
