package eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

class PetSequence {
	protected Pet[] pets = Pets.createArray();
}

public class NonCollectionSequence extends PetSequence {

	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < pets.length;
			}

			@Override
			public Pet next() {
				return pets[index++];
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public Iterable<Pet> reversed() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				return new Iterator<Pet>() {
					int current = pets.length - 1;

					@Override
					public boolean hasNext() {
						return current > -1;
					}

					@Override
					public Pet next() {
						return pets[current--];
					}

					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}

	public Iterable<Pet> randomized() {
		return new Iterable<Pet>() {
			public Iterator<Pet> iterator() {
				List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}

	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsIterator.display(nc.reversed().iterator());
	}
}
