package ereditarita;

public class LG implements ITelevisione {

	@Override
	public String getMarca() {
		
		return "LG";
	}

	@Override
	public String getNome() {
		
		return "grandeTv";
	}

	@Override
	public int getPollici() {
		
		return 100;
	}

}
