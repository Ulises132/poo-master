import java.util.Scanner;
public class fastTrackFundamentos {
    public static void main(String[]args) {
        /*
        //Variables en java
        int a;
        double b;
        float c;
        String d;
        boolean e;

        a=3;
        b=20.50;
        d="Esto es una cadena";
        e=true;

        String nombre="Jorge  Estudillo";
        //Constantes
        final double pI=3.141516;
        Scanner intro=new Scanner(System.in);
        System.out.println(b);
        b=intro.nextDouble();
        System.out.println(b);


        //Condicionales <, >, <=, >=, !=, ==
        //Operadores logicos &&, ||, !

        int valor=21;
        int calif=82;
        if (!(valor>=20 || calif>85)){
            if (valor==20){
                System.out.println("Es exactamente 20");
            }else {
                System.out.println("Es superior a 20");
            }
        }else{

            System.out.println("Es menor o igual a 20");
        }
        System.out.println("Fin del programa");
    }

        //Condicionales multiples "switch"
        int opcion;
        opcion=4;
        switch (opcion){
            case 1:
                System.out.println("Vale 1");
                break;
            case 2:
                System.out.println("Vale 2");
                break;
            case 3:
                System.out.println("Vale 3");
                break;
            default:
                System.out.println("Valor no permitido");
                break;

        }

            System.out.println(sumar(3,5));
            multiplica(6,10);

        //Arreglos
        //int[]edades={18,20,21,25,19,22,};
        //String nombres[]={"Leo","Abraham","Rebeca"};
        int edades[]=new int[10];
        edades[6]=16;
        System.out.println(edades[6]);
        System.out.println(edades[1]);
        System.out.println(edades[0]);

        String[] paises=new String[5];
        paises[0]="Mexico";
        System.out.println(paises[0]);


        /*System.out.println(edades[1]);
        System.out.println(nombres[nombres.length-1]);
        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }*/

        //Matrices, son arreglos bidimensionales
        int[][] calificaciones={{1,2,3},
                                {4,5,6},
                                {7,8,9}};
        System.out.println(calificaciones[0][2]);
        for (int i=0;i<calificaciones.length;i++){
            for (int j=0;j<calificaciones[0].length;j++){
                System.out.println(calificaciones[j][i]);
            }
        }
        double[][] calif_poo=new double[27][6];
        calif_poo[6][0]=99;
        System.out.println(calif_poo[6][0]);
    }//Fin del main

}
