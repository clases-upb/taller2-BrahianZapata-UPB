/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo (int dinero_taquilla, int total_recaudos,int total_retiros){
        try {
            final int base = 2000000;

            if (base != dinero_taquilla)
                return -1;
            
            int saldo_taquilla = base + total_recaudos - total_retiros;
                return saldo_taquilla;
        } 
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip (float consumo_cliente){
        try {
            if(consumo_cliente <= 0)
                return "Error calculando consumo";
            final float propina_porcentanje = 0.1f;
            final float consumo_porcentaje = 0.08f;
            float propina = consumo_cliente*propina_porcentanje;
            float impoconsumo = consumo_cliente*consumo_porcentaje;
            int valor_total = (int)((propina)+(impoconsumo)+consumo_cliente);
            String totalString = "valor comida:$ "+ consumo_cliente +  " - valor propina $"+ propina +" - valor impoconsumo $ "+ impoconsumo + " - total a pagar $ "+ valor_total;
            return totalString;
            
        } 
        catch (Exception e) {
            return "Error calculando consumo";
        }
    }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int part_ganados, int part_perdidos,int part_empatados){
        try {
            if (part_ganados < 0 || part_perdidos < 0 || part_empatados <0)
                return -1;
            final int ganado = 3;
            final int empatado = 1;
            short total_puntos = (short)((part_ganados*ganado)+(part_empatados*empatado));
                return total_puntos;
        } 
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitivao(int nota1, int nota2, float nota3, int nota4, int nota5,float porc1, float porc2, float porc3,float porc4, float porc5){
        try {
            final float porc_final = porc1+porc2+porc3+porc4+porc5;
            if (porc_final  < 1 || porc_final > 1)
                return -1;
            
            float definitiva = (nota1*porc1)+(nota2*porc2)+(nota3*porc3)+(nota4*porc4)+(nota5*porc5);
                return definitiva;
            
                
        
        } 
        catch (Exception e) {
           return -1;
        }
    } 

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar (float porcentaje1, float porcentaje2,float porcentaje3,float porcentaje4,float porcentaje5,float not1,float not2, float not3, float not4){
        try {
            final float PUNTAJE_MINIMO = 3.0f;
            float totalActual = not1 * porcentaje1 + not2 * porcentaje2 + not3 * porcentaje3 + not4 * porcentaje4;
            float notaNecesaria = 0;
            float sumaPorcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;
            if (sumaPorcentajes >=0 && sumaPorcentajes <=1){
                notaNecesaria = (PUNTAJE_MINIMO - totalActual) / porcentaje5;
                return notaNecesaria;
            }
                else{
                    return -1;
                }
        }
        catch (Exception e) {
            return -1;
        }
        
    }

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_salario(int horas_normales,int horasExtras_diu, int horasExtras_noc, double valor_hora){
        try {
            double salario_total = 0;
            final float recargo_diurno = 0.15f;
            final float recargo_nocturno = 0.35f;
            final byte cienporciento = 1;
            double salarioHr_normales = horas_normales * valor_hora;
            double salarioHr_Diu = horasExtras_diu * valor_hora * (cienporciento+recargo_diurno);
            double salarioHr_Noc = horasExtras_noc * valor_hora * (cienporciento+recargo_nocturno);


            if (horas_normales > 0 )
                salario_total = (salarioHr_normales+salarioHr_Diu+salarioHr_Noc);
            return (float)salario_total;

            
        } 
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo (float base, float altura){
        try {
            float area = 0;
            final float nro = 0.5f;
        
            if (base <= 0 || altura <= 0)
                return -1;
            
            area = nro * base *altura;
                return area;

        } 
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado){
        try {
            final byte cuatro = 4;
            float perímetro = 0;

            if (lado <= 0 )
                return -1;
            
            perímetro = lado * cuatro;
            return perímetro;
            
        } 
        catch (Exception e) {
            return -1;
        }
    }

    
    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro (float radioBase, float altura){
        try {
            final double pi = 3.1415927;
            float volumen = 0;
        
            if(radioBase <= 0 || altura <= 0)
                return -1;
            
            volumen = (float)(pi * radioBase*radioBase * altura);
                return volumen;
            
            
        } 
        catch (Exception e) {
            return -1;
        }
    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio){
        try {
            final double pi = 3.1415927;
            float area = 0;

            if (radio <= 0 )
                return -1;
            
            area = (float)(pi * radio * radio);
                return area;
            
        } 
        catch (Exception e) {
            return -1;
        }
    }



}
