public class BoletadeCalificaciones {
    String nombre;
    String carrera;
    int calificacion1;
    int calificacion2;
    int calificacion3;
    int calificacion4;
    int calificacion5;
    int calificacion6;
    int calificacion7;
    int n_control;
    int semestre;
    String materia1;
    String materia2;
    String materia3;
    String materia4;
    String materia5;
    String materia6;
    String materia7;
    double calcular_prom(){

        return (calificacion1+calificacion2+calificacion3+calificacion4+calificacion5+
                calificacion6+calificacion7)/7;
    }
    String obtenerBoleta(){
        String cad="";
        cad=cad+"Boleta{nombre:"+nombre+"; ";
        cad=cad+"carrera:"+carrera+"; ";
        cad=cad+"Numero de control:"+n_control+"; ";
        cad=cad+"Semestre:"+semestre+"; ";
        cad=cad+"Materia:"+materia1+"; ";
        cad=cad+"Materia:"+materia2+"; ";
        cad=cad+"Materia:"+materia3+"; ";
        cad=cad+"Materia:"+materia4+"; ";
        cad=cad+"Materia:"+materia5+"; ";
        cad=cad+"Materia:"+materia6+"; ";
        cad=cad+"Materia:"+materia7+"; ";
        cad=cad+"Calificacion de "+materia1+":"+calificacion1+"; ";
        cad=cad+"Calificacion de "+materia2+":"+calificacion2+"; ";
        cad=cad+"Calificacion de "+materia3+":"+calificacion3+"; ";
        cad=cad+"Calificacion de "+materia4+":"+calificacion4+"; ";
        cad=cad+"Calificacion de "+materia5+":"+calificacion5+"; ";
        cad=cad+"Calificacion de "+materia6+":"+calificacion6+"; ";
        cad=cad+"Calificacion de "+materia7+":"+calificacion7+"; ";

        return cad;
    }
}
