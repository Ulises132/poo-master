public class DatosCalificacion {
    public static void main(String[] args){
        BoletadeCalificaciones p1=new BoletadeCalificaciones();//Instanciamiento
        //Configurar el objeto dando valores a sus atributos
        p1.nombre="Leonardo";
        p1.carrera="Sistemas";
        p1.n_control=24020303;
        p1.semestre=2;
        p1.materia1="Calculo";
        p1.materia2="Fund.Prog";
        p1.materia3="Taller de Etica";
        p1.materia4="Mat. Discretas";
        p1.materia5="Taller de Admon";
        p1.materia6="Fund. Invest";
        p1.materia7="Tutorias";
        p1.calificacion1=70;
        p1.calificacion2=79;
        p1.calificacion3=89;
        p1.calificacion4=87;
        p1.calificacion5=90;
        p1.calificacion6=100;
        p1.calificacion7=83;

        System.out.println(p1.obtenerBoleta());

        BoletadeCalificaciones p2=new BoletadeCalificaciones();
        p2.nombre="Jose";
        p2.carrera="Industrial";
        p2.n_control=24060423;
        p2.semestre=1;
        p2.materia1="Dinamica";
        p2.materia2="Calculo";
        p2.materia3="Taller de Etica";
        p2.materia4="Mat. Discretas";
        p2.materia5="Taller de Admon";
        p2.materia6="Fund. Invest";
        p2.materia7="Tutorias";
        p2.calificacion1=73;
        p2.calificacion2=76;
        p2.calificacion3=97;
        p2.calificacion4=100;
        p2.calificacion5=100;
        p2.calificacion6=76;
        p2.calificacion7=82;
        String res=p2.obtenerBoleta();
        System.out.println(res);

        BoletadeCalificaciones p3=new BoletadeCalificaciones();
        p3.nombre="Emiliano";
        p3.carrera="Electrica";
        p3.n_control=24024091;
        p3.semestre=1;
        p3.materia1="Transitores";
        p3.materia2="Calculo";
        p3.materia3="Taller de Etica";
        p3.materia4="Mat. Discretas";
        p3.materia5="Taller de Admon";
        p3.materia6="Fund. Invest";
        p3.materia7="Tutorias";
        p3.calificacion1=85;
        p3.calificacion2=75;
        p3.calificacion3=92;
        p3.calificacion4=100;
        p3.calificacion5=71;
        p3.calificacion6=82;
        p3.calificacion7=91;
        String res2=p3.obtenerBoleta();
        System.out.println(res2);

        System.out.println("Promedio de: "+":"+p1.nombre+p1.calcular_prom());
        System.out.println("Promedio de: "+":"+p2.nombre+p2.calcular_prom());
        System.out.println("Promedio de: "+":"+p3.nombre+p3.calcular_prom());
    }
}
