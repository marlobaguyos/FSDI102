package Practice.JavaObjects;

//Anything between { } is known as class scopre
class PezDispenser {
	//constant by making all CAPs
	final private int MAX_PEZ = 12;
	final private String characterName;

	public PezDispenser(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return characterName;
	}
}

