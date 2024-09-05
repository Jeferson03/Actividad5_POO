package notas;

public class Notas {
    double[] listaNotas;
    
    public Notas(){
    listaNotas =  new double[5];
    }
    double promedioNotasIngresadas(){
        double suma = 0;
        for(int i=0;i<listaNotas.length; i++){
            suma = suma + listaNotas[i];
        }
        return (suma/listaNotas.length);
    }
    double desviacionEstandar(){
        double promedio = promedioNotasIngresadas();
        double suma = 0;
        for(int i=0; i<listaNotas.length; i++){
            suma += Math.pow(listaNotas[i] - promedio,2);
        }
        return Math.sqrt(suma/listaNotas.length);
    }
    double mayorNota(){
        double mayor = listaNotas[0];
        for (int i=0; i<listaNotas.length; i++){
            if (listaNotas[i]>mayor){
                mayor = listaNotas[i];
            }
        }
      return mayor;                     
    }
    double menorNota(){
        double menor = listaNotas[0];
        for (int i=0; i<listaNotas.length; i++){
            if (listaNotas[i]<menor){
                menor = listaNotas[i];
            }
        }
        return menor;
    }

}

