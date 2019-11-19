package FachadaGeral;
import java.util.Scanner;
import ClassesBases.Cultivo;
import Repositorios.RepositorioArray;
import Repositorios.RepositorioLista;
//importar as outras classes

public class FachadaGeral {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Cultivo cultivo = new Cultivo(null, 0, false, 0, 0);
		RepositorioArray repositorioArray = new RepositorioArray();
		RepositorioLista repositorioLista = new RepositorioLista();
				
		in.close();
	}

}
