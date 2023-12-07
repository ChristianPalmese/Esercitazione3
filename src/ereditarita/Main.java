package ereditarita;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Lepre lepre1= new Lepre();
		System.out.println(lepre1.getNZampe());
		Umano umano1 = new Umano();
		System.out.println(umano1.getNZampe());
		Tigre tigre1 = new Tigre();
		System.out.println(tigre1.getNZampe());
		List <Animale> animali = new LinkedList<>();
		animali.add(lepre1);
		animali.add(umano1);
		//animali.add(new Animale());
		animali.add(tigre1);
		
		for(Animale i :animali) {
			System.out.println(i+" "+ i.getNZampe());
			if(i instanceof Lepre) {
				System.out.println("ho trovato una lepre ");
			}
		}
		
		List<ITelevisione> televisioni = new ArrayList<>();
		televisioni.add(new Samsung());
		televisioni.add(new LG());
			for(ITelevisione i :televisioni) {
				System.out.println(i.getMarca()+ " "+ i.getNome()+" "+i.getPollici());
				if(i instanceof Samsung) {
					Samsung samsung = (Samsung) i;
					System.out.println(samsung.isSmartTV());
				}
			}
	}

}
