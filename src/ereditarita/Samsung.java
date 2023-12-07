package ereditarita;

public class Samsung implements ITelevisione {

	@Override
	public String getMarca() {
		
		return "Samsung";
	}

	@Override
	public String getNome() {
		
		return "superTv";
	}

	@Override
	public int getPollici() {
		
		return 50;
	}

	public boolean isSmartTV() {
		return true;
	}
	
}
