package com.ssabez.ejercicio314;

import java.util.Scanner;

public class PruebaFecha {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Fecha fecha1 = new Fecha(26, 9, 1992);
		
		fecha1.monstrarFecha();
		System.out.println();
		
		System.out.print("\nIngresar Nueva Fecha \nDIA: ");
		int dia = input.nextInt();
		fecha1.estDia(dia);
		
		//Se crean varios if anidados para que si un valor no es valido el proceso se interrumpa
		
		if(dia > 0 && dia <= 31){//Inicio de if 1
			
			//Si el dia asignado es valido se pide el valor del mes, y se llama al metodo y se le pasa la var
			
			System.out.print("MES: ");
			int mes = input.nextInt();
			fecha1.estMes(mes);
			
			//Si el dia asignado es valido se pide el valor del mes, y se llama al metodo y se le pasa el argumento
			//Si el mes esta dentro del parametro se ejecuta la siguiente parte del codigo
			if(mes > 0 && mes <= 12){//Inicio de if 2
				
				//En el metodo obtMes evalua si el dia corresponde al mes ingresado, si no es asi, asigna un valor
				//cero a la var de instancia para eliminar el valor (si tiene uno valido asignado) que se le asigno
				//en el constructor y así, interrumpir el proceso
				
				if(fecha1.obtMes() == mes){//Inicio if 3
					
					System.out.print("AÑO: ");
					int ano = input.nextInt();
					fecha1.estAno(ano);
					
					if(ano > 0){//Inicio if 4
						System.out.println();
						System.out.print("FECHA ASIGNADA");
						fecha1.monstrarFecha();
					}
					else{//Inicio else 4
						
						System.out.println("FECHA INVALIDA===");
						
					}//Fin else 4
					
				}//Fin if 3
		
			}//Fin de if 2
		
			else{//Inicio else 2
				
			System.out.println("FECHA INVALIDA===");
			
			}//Fin de else 2
		
		}//Fin de if 1
		
		else{//Inicio else 1
			
			System.out.println("FECHA INVALIDA===");
			
		}//Fin de else 1
		
		
		
		
	}

}
