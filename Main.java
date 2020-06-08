import java.util.Scanner;

public class Main{
  static Scanner leer=new Scanner(System.in);
  public static void main (String args[]){
    char resp;
   do{
   System.out.println("Estrucutras repetitivas - 10 ejercicios");
   System.out.println("Desa continuar S/N?");
   resp=leer.nextLine().charAt(0);
   }while (resp!='n' && resp!='s' && resp!='N' && resp!='S' );
  }
}
 //Datos de enttrada
   char resp11, resp3;
   int resp2, resp4;
   S=20;
   D=25;
   T=28;
   //Proceso
   do{
   System.out.println("Bienvenidos al Naufrago Satisfecho \n Digite la primera letra de la hamburguesa que desea pedir? \n S: Simple \n D: Doble \n T: triple");
   resp11=leer.nextLine().charAt(0);
   }while(resp11!='s' && resp11!='S' && resp11!='d' && resp11!='D' && resp11!='t' && resp11!='T');
   
   System.out.println("Cuantas desea?");
   resp2=leer.nextInt();
 