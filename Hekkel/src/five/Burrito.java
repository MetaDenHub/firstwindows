package five;

public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("Not spicy at all");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("A litle hot");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("Maybe too hot..");
		}
	}

	public static void main(String[] args) {
		Burrito burr = new Burrito(Spiciness.NOT);
		Burrito hotburr = new Burrito(Spiciness.MEDIUM);
		Burrito jalapeno = new Burrito(Spiciness.FLAMING);
		burr.describe();
		hotburr.describe();
		jalapeno.describe();
	}

}
