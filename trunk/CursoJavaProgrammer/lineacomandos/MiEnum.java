
public enum MiEnum {
	CHICO("chico"),MEDIANO("mediano"),GRANDE("grande");
		
	private String s;
	
	MiEnum(String s) {
		this.s = s;
	}
	
	public String getSize() {
		return s;
	}
}
