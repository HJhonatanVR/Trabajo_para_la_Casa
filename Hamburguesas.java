
import java.util.Scanner;

public class Hamburguesas{
  static Scanner leer=new Scanner(System.in);
  public static void main (String args[]){
   int nHamburgesas;
    double precioHamburgesa=0;
    double preSumaPago=0;
    String pagoTarjeta="NO";
    for(int tipoHam=1;tipoHam<=3;tipoHam++){
        switch (tipoHam) {
          case 1:System.out.println("Ingrese la Cantidad de Hamburguesas en Simple:"); precioHamburgesa=20; break;  
          case 2:System.out.println("Ingrese la Cantidad de Hamburguesas en Doble:"); precioHamburgesa=25; break;  
          case 3:System.out.println("Ingrese la Cantidad de Hamburguesas en Triple:"); precioHamburgesa=28; break;        
          default: System.out.println("El tipo de Hamburgesas no existe");
            break;
        }
        nHamburgesas=leer.nextInt();
        preSumaPago+=precioHamburgesa*nHamburgesas;      
    }
    
    System.out.println("El Costo Total a pagar por las Hamburguesas es:"+preSumaPago); 
    
   
    
  }
}