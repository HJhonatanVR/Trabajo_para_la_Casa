import java.util.Scanner;

class RepasoExamen{
    static Scanner leer=new Scanner(System.in);

    public static void Salario(){

   //Datos de entrada
   int anios=6, a=1;
   double sal=1500;
   //Proceso y salida
   System.out.println("Salario inicial de $1500");
   while(a<=anios){
     a++;
     sal=sal+(sal*0.10);
     System.out.println("El profesor recibió en el año" +a+ " el monto de $" +sal);
   } 
  }

    public static void calcularXXXX02DMP(){

        //datos entrada
        System.out.print("Pregunta 02:");

    }


    public static void main(String[] arg){
         System.out.println("Estrucutras repetitivas - 10 ejercicios");
   System.out.println("**************Menu de opciones**************");
        char continuar='S';
        String opcion;

        do{
            System.out.println("Qué ejercicio desea probar? \n 1-Eje.(4.1) \n 2-Eje.(4.2) \n 3-Eje.(4.3) \n 4-Eje.(4.4) \n 5-Eje.(4.5) \n 6-Eje.(4.6) \n 7-Eje.(4.7) \n 8-Eje.(4.8) \n 9-Eje.(4.9) \n 10-Eje.(4.10)");
     
            opcion=leer.next();

            switch(opcion){
                  case  "01": Salario(); break;
                  case  "02": calcularXXXX02DMP(); break;
                  case  "03": calcularXXXX02DMP(); break;
                  case  "04": calcularXXXX02DMP(); break;
                    default:  System.out.print("Opcion no existe:"); break;
            }
             System.out.println("Desea probar mas algoritmos? S=SI, N=NO");
            continuar=leer.next().charAt(0);
        }while(continuar=='S');

    }

}