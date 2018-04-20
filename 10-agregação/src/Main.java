public class Main {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Marcio");
		System.out.println(cli1);
		System.out.println(cli1.getNome());
		
		Telefone t1 = new TelefoneCelular("53", "99883344"); // Celular
		Telefone t2 = new TelefoneResidencial("32349993"); // Residencial
		
		cli1.addTelefone(t1);
		cli1.addTelefone(t2);
		cli1.addTelefone(new TelefoneCelular("988776622"));
		
		Telefone[] tels = cli1.getTelefones();
		System.out.println(tels.length);
		for (Telefone t : tels) { // for each
			System.out.println(t);
		}
		
		cli1.removeTelefone(t1);
		System.out.println("Telefone restantes:");
		for (Telefone t : cli1.getTelefones()) {
			System.out.println(t);
		}
		
		// System.out.println(t1);
		// System.out.println(t2);
		
		// CO-VARIÂNCIA
		TelefoneCelular tc = new TelefoneCelular("99883334");
		TelefoneResidencial tr = new TelefoneResidencial("32445555");
		// TelefoneResidencial é covariante de Telefone
		Telefone tr2 = new TelefoneResidencial("2323233");
		
		// Telefone é abstrato
		// Telefone t3 = new Telefone("22233333");
		
		
		Telefone tn1 = new TelefoneCelular("999887722");
		Telefone tn2 = new TelefoneCelular("999887722");
		System.out.println(tn1 == tn2);
		System.out.println(tn1.equals(tn2));
		
		
		
		
		
		
		
	}
}
