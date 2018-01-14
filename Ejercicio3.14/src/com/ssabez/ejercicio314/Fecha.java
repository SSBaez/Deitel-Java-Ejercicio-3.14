package com.ssabez.ejercicio314;

public class Fecha {
	
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int dia, int mes, int año){
		
		
		if(dia > 0 && dia <= 31){
			
			this.dia = dia;
			
			}//Fin de if de dia
			else{
				System.out.println("==FECHA ERRONEA== ---> DIA invalido ¡¡Corregir argumentos!!");
			}//Fin de else dia
		
		if(this.dia != 0){//Inicio de if 1
	
			if(mes > 0 && mes <= 12){//Inicio de if mes, anidado dentro if 1
				
				switch(mes){
				
				case 1:
				
					this.mes = mes;
					break;
			
				case 2:
				
					if(dia <= 28){
						this.mes = mes;
					}
					else{
						System.out.println("==FECHA ERRONEA== ---> DÍA no coicide con MES ¡¡Corregir argumentos!!");
						this.dia = 0; //Esto se hace para q no se imprima el valor ingresado, no valido para el mes
					}
					break;
				
				case 3:
		
					this.mes = mes;
					break;
				
				case 4:
				
					if(dia <= 30){
						this.mes = mes;
					}
					else{
						System.out.println("==FECHA ERRONEA== ---> DÍA no coicide con MES ¡¡Corregir argumentos!!");
						this.dia = 0;
					}
					break;
				
				case 5:
				
					this.mes = mes;
					break;
				
				case 6:
				
					if(dia <= 30){
						this.mes = mes;
					}
					else{
						System.out.println("==FECHA ERRONEA== ---> DÍA no coicide con MES ¡¡Corregir argumentos!!");
						this.dia = 0;
					}
					break;
				
				case 7:
				
					this.mes = mes;
					break;
				
				case 8:
				
					this.mes = mes;
					break;
				
				case 9:
				
					if(dia > 0 && dia <= 30){
						this.mes = mes;
					}
					else{
						System.out.println("==FECHA ERRONEA== ---> DÍA no coicide con MES ¡¡Corregir argumentos!!");
						this.dia = 0;
					}
					break;
				
				case 10:
				
					this.mes = mes;
					break;
				
				case 11:
				
					if(dia > 0 && dia <= 30){
						this.mes = mes;
					}
					else{
						System.out.print("==FECHA ERRONEA== ---> DÍA no coicide con MES ¡¡Corregir argumentos!!");
						this.dia = 0;
					}
					break;
				
				case 12:
				
					this.mes = mes;
					break;
				
				}//Fin de switch
				
			}//Fin de if de mes, anidado dentro de if 1
		
			if(this.mes != 0){//Inicio de if 2, anidado dentro de if 1
		
				if(año > 0){//Inicio de if año		
					
					this.año = año;
					System.out.println("==FECHA ACTUAL==");
					
				}//Fin de if año
				
				else{//Inicio de else año
					
					this.dia = 0;
					this.mes = 0;
					System.out.println("==FECHA ERRONEA== ---> AÑO invalido, debe ser mayor a cero ¡¡Corregir argumentos!!");
					
				}//Fin de else año
		
			}//Fin de if 2, anidado dentro de if 1
		
		}//fin de if 1
		
	}//Aqui termina el Constructor
	

	public int obtDia() {
		return dia;
	}

	public void estDia(int dia) {
		
		if(dia > 0 && dia <= 31){
		this.dia = dia;
		}
		else{
			System.out.print("===DATO ERRONEO, ");
		}
	}

	public int obtMes() {
		return mes;
	}

	public void estMes(int mes) {//Inicio de metodo
		
		if(mes > 0 && mes <= 12){//Inicio de if 1
		
		switch(mes){
		
		case 1:
			
			this.mes = mes;
			break;
		
		case 2:
			
			if(dia > 0 && dia <= 28){
				this.mes = mes;
			}
			else{
				System.out.println("FECHA INVALIDA, DIA NO COINCIDE CON MES");
				this.mes = 0;//Se le asigna cero para que se interrumpa el proceso, si es que el usuario
			}				 //al ingresar una nueva fecha, el dia tiene conflicto con el mes ej. 30FEBRERO
			break;
		
		case 3:
			
			this.mes = mes;
			break;
		
		case 4:
		
			if(dia > 0 && dia <= 30){
				this.mes = mes;
		}
			else{
				System.out.println("FECHA INVALIDA, DIA NO COINCIDE CON MES");
				this.mes = 0;
		}
			break;
		
		case 5:
			
			this.mes = mes;
			break;
		
		case 6:
			
			if(dia > 0 && dia <= 30){
				this.mes = mes;
		}
			else{
				System.out.println("FECHA INVALIDA, DIA NO COINCIDE CON MES");
				this.mes = 0;
		}
			break;
		
		case 7:
			
			this.mes = mes;
			break;
		
		case 8:
			
			this.mes = mes;
			break;
		
		case 9:
			
			if(dia > 0 && dia <= 30){
				this.mes = mes;
		}
			else{
				System.out.println("FECHA INVALIDA, DIA NO COINCIDE CON MES");
				this.mes = 0;
		}
			break;
		
		case 10:
			
			this.mes = mes;
			break;
		
		case 11:
			
			if(dia > 0 && dia <= 30){
				this.mes = mes;
		}
			else{
				System.out.print("FECHA INVALIDA, DIA NO COINCIDE CON MES");
				this.mes = 0;
		}
			break;
		
		case 12:
			
		this.mes = mes;
		break;
		
		}//Fin de switch
		
		}//Fin de if 1
		
		else{//Inicio de else 1
			
			System.out.print("===DATO ERRONEO, ");
			
		}//Fin de else 1

	}//Fin de metodo
	

	public int obtAño() {
		return año;
	}

	public void estAño(int año) {
		
		if(año > 0){
			this.año = año;
		}
		else{
			System.out.print("===DATO ERRONEO, ");
		}
		
	}
	
	public void monstrarFecha(){
		System.out.printf("---> %d/%d/%d", dia, mes, año);
	}

}
