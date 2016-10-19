import edu.princeton.cs.introcs.StdDraw;
import edu.princeton.cs.introcs.StdRandom;

import java.awt.*;
import java.util.Arrays;

/**
 * Created by Deron on 2016/10/19.
 */
public class TempDraw {
    public static void main(String[] args){
        sortedRandomArray();
    }

    public static void sortedRandomArray()
    {
        int N = 100000;
        double[] a = new double[N];
        for (int i = 0; i < N; i++)
        {
            a[i] = StdRandom.uniform();
        }
        Arrays.sort(a);
        StdDraw.setPenColor(Color.blue);
        for (int i = 0; i < N; i++)
        {
            double x = 1.0*i/N;
            double y = a[i]/2.0;
            double rw = 0.5/N;
            double rh = a[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    public static void functionValue()
    {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++){
            StdDraw.setPenColor(Color.red);
            StdDraw.point(i, i);
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.point(i, i*i);
            StdDraw.setPenColor(Color.MAGENTA);
            StdDraw.point(i, i*Math.log(i));

        }
    }
}
