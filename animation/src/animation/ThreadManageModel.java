package animation;

/**
 * Created by lzy on 2015/5/15.
 */
public class ThreadManageModel implements Runnable{
    private BallComponet componet;
    private BallMoveModel ball;

    public ThreadManageModel(BallMoveModel b, BallComponet comp) {
        ball = b;
        componet = comp;
    }

    public void run() {
        try {
//            for (int i = 1; i < STEPS; i++) {
           while (true) {
                ball.move(componet.getBounds());
                componet.paint(componet.getGraphics());
                Thread.sleep(10);
            }

        }
        catch (InterruptedException e){

        }
    }
}
