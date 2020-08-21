package seven;

/**
 * Делегування не підтримується мовою Джава, але цього ефекту можна досягнути за
 * допомогою методів:
 */
class SpaceShipControls {
	void up(int velocity) {
	};

	void down(int velocity) {
	};

	void left(int velocity) {
	};

	void right(int velocity) {
	};

	void forward(int velocity) {
	};

	void back(int velocity) {
	};

	void turboBoost() {
	};
}

public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();

	public SpaceShipDelegation(String name) {
		this.name = name;
	}

	private void up(int velocity) {
		controls.up(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	private void right(int velocity) {
		controls.right(velocity);
	}

	private void forward(int velocity) {
		controls.forward(velocity);
	}

	private void back(int velocity) {
		controls.back(velocity);
	}

	private void turboBoost() {
		controls.turboBoost();
	}

	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA protector");
		protector.forward(100);
	}

}
