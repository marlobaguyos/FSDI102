package Practice.JavaObjects;

//Anything between { } is known as class scopre
class PezDispenser {
	//constant by making all CAPs
	public static final int MAX_PEZ = 12;
	final private String characterName;
	private int pezCount;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
		pezCount = 0;
	}

	public void fill(int pezAmount) {
		pezCount += pezAmount;
	}

	public void fill() {
		fill(MAX_PEZ);
	}

	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}

	public boolean isEmpty() {
		boolean isActaullyEmpty = pezCount == 0;
		return isActaullyEmpty;
	}

	public String getCharacterName() {
		return characterName;
	}
}

