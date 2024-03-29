package hospital;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
	static Paciente listaDePacientes [] = new Paciente [50];
	static Senha listaDeSenhas [] = new Senha [50];
	static int contadorSenha = 1;
	
	public static void main(String[] args) {
	while (true) {
		menuInicial();
	}
	}

	public static void menuInicial() {
		System.out.println("\tBem vindo ao Hospital Saint Rafael!");
		int escolha = Teclado.lerInteiro("1-Paciente\n2-Recepcionista\n3-Medico\nDigite o codigo:");
		switch (escolha) {
		case 1: 
			menuTirarSenha();
			break;
		case 2: 
			Arrays.sort(listaDeSenhas, comparador);
			menuRecepcionista();
			break;
		case 3:
			//menuMedico();
			break;
		}
	}
	
	public static void menuTirarSenha() {
			int escolha = Teclado.lerInteiro("1-Preferencial\n2-Comum\nDIgite o codigo:");
			switch (escolha) {
			case 1:
				Senha senha = new Senha(contadorSenha,"PREF");
				contadorSenha++;
				for(int i = 0; i < listaDeSenhas.length;i++) {
					if (listaDeSenhas[i] == null) {
						listaDeSenhas[i] = senha;
						System.out.println("---------------------------");
						System.out.println("Sua Senha:"+senha.toString());
						System.out.println("---------------------------");
						break;
					}
				}
				break;
			case 2:
				Senha senha1 = new Senha(contadorSenha,"COMU");
				contadorSenha++;
				for(int i = 0; i < listaDeSenhas.length;i++) {
					if (listaDeSenhas[i] == null) {
						listaDeSenhas[i] = senha1;
						System.out.println("---------------------------");
						System.out.println("Sua Senha:"+senha1.toString());
						System.out.println("---------------------------");
						break;
					}
				}
				break;
			
			}
	}
	
	public static void menuRecepcionista() {
		
	}
	 static Comparator<Senha> comparador = new Comparator<Senha>() {
         @Override
         public int compare(Senha senha1, Senha senha2) {
             if (senha1.getGrauDePrioridade().equals("PREF") && senha2.getGrauDePrioridade().equals("COMU")) {
                 return -1; // senha1 vem antes de senha2
             } else if (senha1.getGrauDePrioridade().equals("COMU") && senha2.getGrauDePrioridade().equals("PREF")) {
                 return 1; // senha1 vem depois de senha2
             } else {
                 return 0; // as senhas são do mesmo tipo
             }
         }
     };
}
