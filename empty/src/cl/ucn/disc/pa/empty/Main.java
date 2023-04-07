package cl.ucn.disc.pa.empty;
import edu.princeton.cs.stdlib.StdDraw;
import java.awt.*;

/**
 * The Main class.
 *
 *
 */
public class Main{
    /**
     * The Main.
     * @param args to use.
     */
    public static void main(String[] args) {

        /**
         * Definimos la Escala de la pantalla
         */
        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.enableDoubleBuffering();

        /**
         * Dibujamos la primera linea intentando que no se salga de el marco y multiplicandola por un numero aleatorio
         */
        double x01 = 0.9 * Math.random();
        double y01 = 0.9 * Math.random();
        double x11 = 0.9 * Math.random();
        double y11 = 0.9 * Math.random();

        /**
         * Dibujamos Las lineas que le siguien
         */

        //2
        double x02 = x01 - 0.04;
        double y02 = y01 - 0.04;
        double x12 = x11 - 0.04;
        double y12 = y11 - 0.04;
        //3
        double x03 = x01 - 0.08;
        double y03 = y01 - 0.08;
        double x13 = x11 - 0.08;
        double y13 = y11 - 0.08;
        //4
        double x04 = x01 - 0.12;
        double y04 = y01 - 0.12;
        double x14 = x11 - 0.12;
        double y14 = y11 - 0.12;
        //5
        double x05 = x01 - 0.16;
        double y05 = y01 - 0.16;
        double x15 = x11 - 0.16;
        double y15 = y11 - 0.16;
        //6
        double x06 = x01 - 0.20;
        double y06 = y01 - 0.20;
        double x16 = x11 - 0.20;
        double y16 = y11 - 0.20;

        /**
         * Le otorgamos la velocidad a las lineas de manera aleatoria pero reducida
         */
        double vx01 = 0.0009 * Math.random();
        double vy01 = 0.0009 * Math.random();
        double vx11 = 0.0009 * Math.random();
        double vy11 = 0.0009 * Math.random();

        double vx02 = vx01;
        double vy02 = vy01;
        double vx12 = vx11;
        double vy12 = vy11;

        double vx03 = vx01;
        double vy03 = vy01;
        double vx13 = vx11;
        double vy13 = vy11;

        double vx04 = vx01;
        double vy04 = vy01;
        double vx14 = vx11;
        double vy14 = vy11;

        double vx05 = vx01;
        double vy05 = vy01;
        double vx15 = vx11;
        double vy15 = vy11;

        double vx06 = vx01;
        double vy06 = vy01;
        double vx16 = vx11;
        double vy16 = vy11;

        /**
         * Definimos los colores que queremos que tengan las lineas
         */
        Color[] colors = {Color.BLACK, Color.DARK_GRAY, Color.BLUE, Color.RED, Color.MAGENTA, Color.PINK};

        /**
         * Creamos un ciclo while que va actualizando tanto el movimiento como el rebote de las lineas
         */
        while (true) {
            /**
             * .clear para borrar las lineas ya dibujadas y remplazarla por las nuevas
             */
            StdDraw.clear();

            /**
             * Con esto definimos que si la linea toca los marcos que vaya en direccion opuesta a la que tiene, en si que "Rebote"
             */
            //Linea 1
            if (Math.abs(x01 + vx01) > 1.0) {
                vx01 = -vx01;
            }
            if (Math.abs(y01 + vy01) > 1.0) {
                vy01 = -vy01;
            }
            if (Math.abs(x11 + vx11) > 1.0) {
                vx11 = -vx11;
            }
            if (Math.abs(y11 + vy11) > 1.0) {
                vy11 = -vy11;
            }
            //Linea 2
            if (Math.abs(x02 + vx02) > 1.0) {
                vx02 = -vx02;
            }
            if (Math.abs(y02 + vy02) > 1.0) {
                vy02 = -vy02;
            }
            if (Math.abs(x12 + vx12) > 1.0) {
                vx12 = -vx12;
            }
            if (Math.abs(y12 + vy12) > 1.0) {
                vy12 = -vy12;
            }
            //Linea 3
            if (Math.abs(x03 + vx03) > 1.0) {
                vx03 = -vx03;
            }
            if (Math.abs(y03 + vy03) > 1.0) {
                vy03 = -vy03;
            }
            if (Math.abs(x13 + vx13) > 1.0) {
                vx13 = -vx13;
            }
            if (Math.abs(y13 + vy13) > 1.0) {
                vy13 = -vy13;
            }
            //Linea 4
            if (Math.abs(x04 + vx04) > 1.0) {
                vx04 = -vx04;
            }
            if (Math.abs(y04 + vy04) > 1.0) {
                vy04 = -vy04;
            }
            if (Math.abs(x14 + vx14) > 1.0) {
                vx14 = -vx14;
            }
            if (Math.abs(y14 + vy14) > 1.0) {
                vy14 = -vy14;
            }
            //Linea 5
            if (Math.abs(x05 + vx05) > 1.0) {
                vx05 = -vx05;
            }
            if (Math.abs(y05 + vy05) > 1.0) {
                vy05 = -vy05;
            }
            if (Math.abs(x15 + vx15) > 1.0) {
                vx15 = -vx15;
            }
            if (Math.abs(y15 + vy15) > 1.0) {
                vy15 = -vy15;
            }
            //Linea 6
            if (Math.abs(x06 + vx06) > 1.0) {
                vx06 = -vx06;
            }
            if (Math.abs(y06 + vy06) > 1.0) {
                vy06 = -vy06;
            }
            if (Math.abs(x16 + vx16) > 1.0) {
                vx16 = -vx16;
            }
            if (Math.abs(y16 + vy16) > 1.0) {
                vy16 = -vy16;
            }

            /**
             * Definimos el color de las lineas y las dibujamos
             */
            //Linea 1
            StdDraw.setPenColor(colors[0]);
            StdDraw.line(x01, y01, x11, y11);
            //Linea 2
            StdDraw.setPenColor(colors[1]);
            StdDraw.line(x02, y02, x12, y12);
            //Linea 3
            StdDraw.setPenColor(colors[2]);
            StdDraw.line(x03, y03, x13, y13);
            //Linea 4
            StdDraw.setPenColor(colors[3]);
            StdDraw.line(x04, y04, x14, y14);
            //Linea 5
            StdDraw.setPenColor(colors[4]);
            StdDraw.line(x05, y05, x15, y15);
            //Linea 6
            StdDraw.setPenColor(colors[5]);
            StdDraw.line(x06, y06, x16, y16);


            /**
             * Actualizar la Posicion De Las lineas sumandole la "velocidad" a su posicion que tienen
             */

            //Linea 1
            x01 += vx01;
            y01 += vy01;
            x11 += vx11;
            y11 += vy11;
            //Linea 2
            x02 += vx02;
            y02 += vy02;
            x12 += vx12;
            y12 += vy12;

            //Linea3
            x03 += vx03;
            y03 += vy03;
            x13 += vx13;
            y13 += vy13;

            //Linea 4
            x04 += vx04;
            y04 += vy04;
            x14 += vx14;
            y14 += vy14;

            //Linea5
            x05 += vx05;
            y05 += vy05;
            x15 += vx15;
            y15 += vy15;
            //Linea 6
            x06 += vx06;
            y06 += vy06;
            x16 += vx16;
            y16 += vy16;

            /**
             * Mostrar En pantalla las lineas Programadas
             */
            StdDraw.show();
        }
    }
}
