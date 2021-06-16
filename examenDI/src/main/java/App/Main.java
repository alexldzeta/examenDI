package App;

import java.util.Scanner;

import Chapa_Pintura.Chapista;
import DAO.ChapistaDAO;
import DAO.MecanicoDAO;
import DAO.VendedorDAO;
import Mecánica.Mecanicos;
import Ventas.Vendedor;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static ChapistaDAO CDAO = new ChapistaDAO();
	private static MecanicoDAO MDAO = new MecanicoDAO();
	private static VendedorDAO VDAO = new VendedorDAO();
	static boolean salir = false;

	public static void main(String[] args) {

		while (!salir) {

			System.out.println("********** MENÚ **********");
			System.out.println("1) Listar todos los chapistas.");
			System.out.println("2) Listar todos los mecánicos.");
			System.out.println("3) Listar todos los vendedores.");

			int numero = sc.nextInt();

			switch (numero) {

			case 1:

				mostrarChapistas();

				break;

			case 2:

				mostrarMecánicos();

				break;

			case 3:

				mostrarVendedores();

				break;

			}

		}

	}
	
	public static void mostrarChapistas() {
		
		for (Chapista cha : CDAO.listarTodos()) {
			
			System.out.println(cha.toString());
			
		}
		
	}
	
	public static void mostrarMecánicos() {
		
		for (Mecanicos mec: MDAO.listarTodos()) {
			
			System.out.println(mec.toString());
			
		}
		
	}
	
	public static void mostrarVendedores() {
		
		for (Vendedor ven : VDAO.listarTodos()) {
			
			System.out.println(ven.toString());
			
		}
		
	}

}
