package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;
/*
* Exercício final
* Descubra o timeInMillis de uma data e converta para um objeto Date
* Verifique se ele é anterior ou posterior a 15 de maio de 2010
 */


public class ExercicioFinal {
    public static void main(String[] args) {

        Date date = new Date(1970, 11, 30, 22,05, 00);

        long dataemtimemillis = date.getTime(); //descobrindo o timeInMillis

        System.out.println("A data em timeInMillis é: "+dataemtimemillis);

        Date minhadata = new Date(dataemtimemillis); //convertendo o timeInMillis em Date

        Date datacomparacao = new Date(2010,4, 15);

        //comparando as datas:
        if (minhadata.before(datacomparacao)){
            System.out.println("A data informada é anterior à: "+datacomparacao);
        }else {
            System.out.println("A data informada é posterior à: "+datacomparacao);
        }
    }





}
