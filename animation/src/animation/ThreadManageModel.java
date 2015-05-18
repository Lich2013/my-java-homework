package animation;

/**
 * Created by lzy on 2015/5/15.
 */
public class ThreadManageModel implements Runnable{
    private BallComponet componet;
    private BallMoveModel ball;

    //构造函数
    public ThreadManageModel(BallMoveModel b, BallComponet comp) {
        ball = b;
        componet = comp;
    }

    //实现Runnable接口
    public void run() {
        try {
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
