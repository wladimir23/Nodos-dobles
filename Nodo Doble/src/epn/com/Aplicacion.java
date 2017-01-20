package epn.com;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		 
		   Lista lista = new Lista();
	        Integer DatoB,DatoI;
	            

			String tecla = null;
			Scanner Teclado = new Scanner(System.in);//ingreso de datos
			Scanner scanner = new Scanner (System.in);
			do {
				System.out.println("Menu de opciones");
				System.out.println("1.insertar al inicio ");
				System.out.println("2.insertar final ");
				System.out.println("3.Insertar Antes de ");
				System.out.println("4.Insertar Despues de");
				System.out.println("5.Eliminar");
				System.out.println("6.Buscar");
				System.out.println();
				System.out.println("Ingresar opcion:");
				int opcion = scanner.nextInt();
				boolean opc = (opcion <= 6);
				if (opc) {
					
						switch (opcion) {
					case 1: System.out.println ("Que dato quieres insertar al frente de la Lista:  ");
                 DatoI = new Integer(Teclado.nextInt());
                 lista.insertarAlFrente(DatoI);
                 break;
					case 2:System.out.println ("Que dato quieres insertar Atras de la Lista:  ");
                 DatoI = new Integer(Teclado.nextInt());
                 lista.insertarAtras(DatoI);
                 break;
					case 3:System.out.println ("Que dato quieres insertar Antes de la Lista:  ");
                 DatoI = new Integer(Teclado.nextInt());
                 System.out.println ("Atras de que dato quieres insertar el :"+DatoI);
                 DatoB = new Integer(Teclado.nextInt());
                 lista.insertarAntesDe(DatoB,DatoI);
                 break;
						
					case 4:System.out.println ("Que dato quieres insertar Despues de la Lista:  ");
                 DatoI = new Integer(Teclado.nextInt());
                 System.out.println ("Despues de que dato quieres insertar el :"+DatoI);
                 DatoB = new Integer(Teclado.nextInt());
                 lista.insertarDespuesDe(DatoB,DatoI);
                 break;
						
						
					case 5:System.out.println ("Que dato quieres ELiminar de la Lista: ");
                 DatoB = new Integer(Teclado.nextInt());
                 lista.eliminarNodo(DatoB);
                 break; 
                 
					 case 6: System.out.println ("Que dato quieres buscar: ");
                 DatoB = new Integer(Teclado.nextInt());
                 lista.buscar(DatoB);
                 break;
						}		
				
				System.out.print("\n¿Quiere seguir?\n");
				tecla = new Scanner(System.in).nextLine();
				}
			} while (tecla.equals("s") || tecla.equals("S"));
	 
		}
	}






