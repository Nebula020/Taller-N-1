package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;
import edu.princeton.cs.stdlib.StdOut;

import java.awt.*;

/**
 * The Main class.
 *
 * @Alonso
 */
public class Main{
    /**
     * The Main.
     *
     * @param args to use.
     */
    public static void main(String[] args) {
        double min = -1.0;
        double max = 1.0;

        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);
        StdDraw.enableDoubleBuffering();

        double x01 = min + (max - min) * Math.random();
        double y01 = min + (max - min) * Math.random();
        double x11 = min + (max - min) * Math.random();
        double y11 = min + (max - min) * Math.random();


        double vx01 = 0.005 * Math.random();
        double vy01 = 0.005 * Math.random();
        double vx11 = 0.005 * Math.random();
        double vy11 = 0.005 * Math.random();




        Color[] colors = {Color.BLUE, Color.BLACK, Color.RED, Color.ORANGE, Color.MAGENTA, Color.PINK};

        while (true) {
            StdDraw.clear();
            //1
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

            StdDraw.setPenColor(colors[0]);
            StdDraw.line(x01, y01, x11, y11);

            // Actualizar la Posicion
            x01 += vx01;
            y01 += vy01;
            x11 += vx11;
            y11 += vy11;

            StdDraw.show();

        }
    }
}
