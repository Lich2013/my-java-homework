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
//            for (int i = 1; i < 1000; i++) {
           while (true) {
                ball.move(componet.getBounds());
                componet.paint(componet.getGraphics());
                Thread.sleep(5);
            }

        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            System.exit(0);
        }
        finally {
            System.exit(0);
        }
    }
}
