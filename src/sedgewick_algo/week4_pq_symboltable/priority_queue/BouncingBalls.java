package sedgewick_algo.week4_pq_symboltable.priority_queue;

import edu.princeton.cs.algs4.StdDraw;

// java BouncingBalls 100
public class BouncingBalls
{
    // PQ contains all possible collisions that might happen in the future
    // PQ contains predicted collision times
    // Warm-up: Bouncing Balls without collisions
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Ball[] balls = new Ball[N];
        for (int i = 0; i < N; i++)
            balls[i] = new Ball();
        // main simulation loop 03:16
        while(true)
        {
            StdDraw.clear();
            for (int i = 0; i< N; i++)
            {
                balls[i].move();
                balls[i].draw();
            }
            StdDraw.show(50);
        }
    }
}