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

	public void fill() {
		pezCount = MAX_PEZ;
	}

	public String getCharacterName() {
		return characterName;
	}
}

