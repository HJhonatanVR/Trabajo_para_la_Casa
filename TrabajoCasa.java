import java.util.Scanner;


public class TrabajoCasa{
  static Scanner leer=new Scanner(System.in);
  
   public static void main (String args[]){
   
   System.out.println("Estrucutras repetitivas - 10 ejercicios");
   System.out.println("**************Menu de opciones**************");
   
   String resp1="1";
   char resp2='s';
   
   do{
     System.out.println("Qué ejercicio desea probar? \n 1-Eje.(4.1) \n 2-Eje.(4.2) \n 3-Eje.(4.3) \n 4-Eje.(4.4) \n 5-Eje.(4.5) \n 6-Eje.(4.9) \n 7-Eje.(4.11) \n 8-Eje.(4.13) \n 9-Eje.(4.14) \n 10-Eje.(4.10)");
     resp1=leer.next();

     switch(resp1){
       case "1": Salario(); break;
       case "2": Hamburguesas(); break;
       case "3": Ceros(); break;
       case "4": FocosC(); break;
       case "5": Ahorro(); break;
       case "6": DepositoAhorro(); break;
       case "7": FExponencial(); break;
       case "8": Vendedor(); break;
       case "9": Calificaciones(); break;
       case "10": SueldoTrabajadores(); break;
       default: System.out.println("La opcion no existe");





     }     
       do{
         System.out.println("Desea continuar S/N?");
         resp2=leer.next().charAt(0);
       }while(resp2!='s' && resp2!='S' && resp2!='N' && resp2!='n');    
   }while(resp2=='s' || resp2=='S');
   
    
 }

  //---------------------------------------------------------------------------------------
  public static void Salario(){

    //Datos de entrada
    int anios=6, a=0;
    double sal=1500;
    //Proceso y salida
    System.out.println("Salario inicial de $1500");
    while(a<=anios){
      a++;
      sal=sal+(sal*0.10);
      System.out.println("El profesor recibió en el año " +a+ " el monto de $" +Math.ceil(sal));
    } 
  }
  //---------------------------------------------------------------------------------------
  public static void Hamburguesas(){
  
    //Datos de entrada
    int precio=0, cantH;
    double PagoEfec=0;
    char pagoT;
    
    //Proceso y salida
    System.out.println("Bienvenidos al [--Naufrago Satisfecho--]");
    
    for(int Th=1; Th<=3; Th++ ){
      switch(Th){

        case 1: System.out.println("Cuantas hamburguesas simples desea?"); precio=20; break;
        case 2: System.out.println("Cuantas hamburguesas dobles desea?");  precio=25; break;
        case 3: System.out.println("Cuantas hamburguesas triples desea?"); precio=28; break;
        default: System.out.println("No hay"); break;
        
      }
        cantH=leer.nextInt();
        PagoEfec+=cantH*precio;
    }
        System.out.println("Desea Pagar con Tarjeta S/N?");
        pagoT=leer.next().charAt(0);
        if(pagoT=='s' || pagoT=='S'){
          PagoEfec=PagoEfec+(PagoEfec*0.05);
        }
        System.out.println("El total a pagar es:"+PagoEfec);
      
  }
  //----------------------------------------------------------------------------------------
  public static void Ceros(){
   //Datos de entrada
   int n=0, resp1, count=0, countM=0, countm=0;
   //proceso y salida
   System.out.println("Ingrese N cantidades para determinar cuantos son igual, mayor y menor a cero:");
   n=leer.nextInt();
    
       for(int i=1;i<=n;i++){
               System.out.println("Ingrese el valor " +i+ " que desee:");  
               resp1=leer.nextInt();
             if(resp1==0){
                count+=1;
              }else if(resp1>0){
                countM+=1;      
              }else if(resp1<0){
                countm+=1;
              }   
        }  
        System.out.println("La cantidad de numeros cero son:"+count); 
        System.out.println("La cantidad de numeros mayores a cero son:"+countM);
        System.out.println("La cantidad de numeros menor a cero son:"+countm);   
 }
 //---------------------------------------------------------------------------------------------------------
 public static void FocosC(){
   //Datos de entrada
   int Nf, color, count=0, countt=0, counttt=0;
   //Proceso
   System.out.println("Ingrese el N° de focos que hay en el lote:");
   Nf=leer.nextInt();
   for(int i=1;i<=Nf;i++){
      System.out.println("Que color es el foco N° " +i+ "? \n 1- Verde \n 2- Blanco \n 3- Rojo");
      color=leer.nextInt();

      if(color==1){
        count+=1;
      }else if(color==2){
        countt+=1;
      }else if(color==3){
        counttt+=1;
      }
      
   }  
      System.out.println("N° de color verde son:"+count);
      System.out.println("N° de color blanco son:"+countt);
      System.out.println("N° de color rojo son:"+counttt);    
 }
 //---------------------------------------------------------------------------------................
 public static void Ahorro(){
   //datos de entrada
   double j=1, a=1;
   //proceso
   System.out.println("Su ahorro diario es:");
   for(int i=1;i<=365;i++){
     if(i>=1 && i<=365){
     j=j*3;
     a=j;
     }
     System.out.println("El ahorro del dia "+i+ " es:"+Math.ceil(j));
   }
     System.out.println("Ahorro anual es: "+a);
 }
 //--------------------------------------------------------------------------------------------------------
 public static void DepositoAhorro(){
 //Datos de entrada  
 int i, n;
        double cantidad_01_enero, cantidad_02_febrero, cantidad_03_marzo, cantidad_04_abril, cantidad_05_mayo;
        double cantidad_06_junio, cantidad_07_julio, cantidad_08_agosto, cantidad_09_septiembre, cantidad_10_octubre;
        double cantidad_11_noviembre, cantidad_12_diciembre, intereses, inversion_final, total;
        total = 0;
        //Proceso
        System.out.print("Cuantos anios a futuro desea calcular: ");
        n =leer.nextInt();
        for (i=1; i<=n; i++) {
            System.out.println("Anio: " + i);
            System.out.println("Deposito de enero: ");
            cantidad_01_enero =leer.nextDouble();
          
            System.out.println("Deposito de febrero: ");
            cantidad_02_febrero =leer.nextDouble();
            
            System.out.println("Deposito de marzo: ");
            cantidad_03_marzo =leer.nextDouble();
            
            System.out.println("Deposito de abril: ");
            cantidad_04_abril =leer.nextDouble();
            
            System.out.println("Deposito de mayo: ");
            cantidad_05_mayo =leer.nextDouble();
            
            System.out.println("Deposito de junio: ");
            cantidad_06_junio =leer.nextDouble();
            
            System.out.println("Deposito de julio: ");
            cantidad_07_julio =leer.nextDouble();
            
            System.out.println("Deposito de agosto: ");
            cantidad_08_agosto =leer.nextDouble();
            
            System.out.println("Deposito de septiembre: ");
            cantidad_09_septiembre =leer.nextDouble();
          
            System.out.println("Deposito de octubre: ");
            cantidad_10_octubre =leer.nextDouble();
            
            System.out.println("Deposito de noviembre: ");
            cantidad_11_noviembre =leer.nextDouble();
            
            System.out.println("Deposito de diciembre: ");
            cantidad_12_diciembre =leer.nextDouble(); 
            
            intereses=total*0.1;
            total=total+intereses+cantidad_01_enero+cantidad_02_febrero+cantidad_03_marzo+cantidad_04_abril+cantidad_05_mayo+cantidad_06_junio+cantidad_07_julio+cantidad_08_agosto+cantidad_09_septiembre+cantidad_10_octubre+cantidad_11_noviembre+cantidad_12_diciembre;
            inversion_final=total;
            //Datos de salida
            System.out.println("Valor de intereses: " + intereses);
            System.out.println("Valor de inversion final: " + inversion_final);
            System.out.println();
        }
            System.out.println("Valor de total: " + total);
 }
 //-----------------------------------------------------------------------------------------
 public static void FExponencial(){
   int n;
        double ex=0, factorial=0, x;
      
        System.out.println("Ingrese el valor de x: ");
        x =leer.nextDouble();
        System.out.println("Ingrese el valor de n: ");
        n =leer.nextInt();
        
        for (int i=1; i<=n; i++) {
            System.out.println("Procedimiento " + i);
            if(i==1)
            {
                ex=1;
                factorial=1;
            }
            factorial=factorial*i;
            ex=ex+Math.pow(x,i)/factorial;
            System.out.println();
        }
        System.out.println("Valor de ex: " + ex);
        System.out.println("Valor de factorial: " + factorial);
 }
 //------------------------------------------------------------------------------------------
 public static void Vendedor(){
   //Datos de entrada
   int n, venta1=0, venta2=0;
   double Mglobal=0, Mventa1=0, Mventa2=0, venta;
   //proceso
     System.out.println("Ingrese el numero de ventas realizadas: ");
     n=leer.nextInt();
    
        for (int i=1; i<=n; i++) {
            System.out.println("VENTA N° " +i);
            System.out.println("Recuerde que tiene que ser:\n - Menos de 10 mil \n - Mas de 10 mil pero menos de 20 mil \n Ingresa el monto que cobraste? ");
            venta=leer.nextDouble();
            if(venta<=10000)
            {
                venta1+=1;
                Mventa1=Mventa1+venta;
            }else if(venta>10000 && venta<=20000)
            {
                venta2+=1;
                Mventa2=Mventa2+venta;
            }else{
              System.out.println("Ingrese el monto correcto!");
            }
            Mglobal+=venta;
            System.out.println();
        }
        //datos de salida
        System.out.println("Ventas realizadas por 10 mil o menos: " + venta1);
        System.out.println("Ventas realizadas por mas de 10 mil pero menos de 20 mil: " + venta2);
        System.out.println("Monto de ventas de 10 mil o menos: " +Mventa1);
        System.out.println("Monto ventas de mas de 10 mil pero menos de 20 mil: " +Mventa2);
        System.out.println("Monto global: " +Mglobal);
 }
 //-------------------------------------------------------------------------------------------------------------------------------------
 public static void Calificaciones(){
   //Datos de entrada
   int n, count=0, countt=0;
   double cali;
   //Proceso
   System.out.println("Ingrese la cantidad de alumnos:");
   n=leer.nextInt();
   for(int i=1;i<=n;i++){
     System.out.println("Ingrese la calificacion del alumno N°" +i);
     cali=leer.nextDouble();

     if(cali>=13 && cali<=20){
       System.out.println("El alumno esta aprobado");
       count+=1;
     }else if(cali>=0 && cali<13){
       System.out.println("El alumno esta desaprobado");
       countt+=1;
     }else{
       System.out.println("Esa calificacion no existe!");
     }
   }
    //Datos de salida
     System.out.println("El numero de alumnos aprobados de la UPEU son: " +count);
     System.out.println("El numero de alumnos desaprobados de la UPEU son: " +countt);
 } 
 //--------------------------------------------------------------------------------------------------------------------
 public static void SueldoTrabajadores(){
  int i, n;
        double descuento, horas_trabajadas, sueldo_por_hora, sueldo_semanal;
        String nombre_del_trabajador;
        System.out.print("Ingrese el valor de n: ");
        n=leer.nextInt();
        
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            System.out.print("Ingrese el nombre del trabajador: ");
            nombre_del_trabajador=leer.nextLine();
            System.out.print("Ingrese el valor de horas trabajadas: ");
            horas_trabajadas=leer.nextDouble();
            
            System.out.print("Ingrese el valor de sueldo por hora: ");
            sueldo_por_hora=leer.nextDouble();
            
            sueldo_semanal=horas_trabajadas*sueldo_por_hora;
            descuento=0;
            if(sueldo_semanal>0&&sueldo_semanal<=150)
                descuento=sueldo_semanal*0.05;
            if(sueldo_semanal>150&&sueldo_semanal<=300)
                descuento=sueldo_semanal*0.07;
            if(sueldo_semanal>300&&sueldo_semanal<=450)
                descuento=sueldo_semanal*0.09;
            sueldo_semanal=sueldo_semanal-descuento;
            System.out.println("Nombre del trabajador: " + nombre_del_trabajador);
            System.out.println("Valor de descuento: " + descuento);
            System.out.println("Valor de sueldo semanal: " + sueldo_semanal);
            System.out.println();
        }
 }      
}

 
 

 