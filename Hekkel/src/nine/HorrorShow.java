package nine;

interface Monster {
	void menace();
}

interface DangerMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerMonster {

	@Override
	public void menace() {
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}

interface Vampire extends DangerMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drinkBlood() {
		// TODO Auto-generated method stub
		
	}
	
}

public class HorrorShow {
	static void u(Monster b) {b.menace();}
	static void v(DangerMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) {
		l.kill();
	}
	
	static DangerMonster barney() {
		return new DragonZilla() {
			@Override
			public void menace() {
				System.out.println("menace");
			}

			@Override
			public void destroy() {
				System.out.println("destroy");
			}
		};
	}

	static Vampire vlad() {
		return new Vampire() {

			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void menace() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void kill() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void drinkBlood() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
	
	public static void main(String[] args) {
		u(barney());
		v(barney());
		u(vlad());
		v(vlad());
		w(vlad());
	}
	
}
