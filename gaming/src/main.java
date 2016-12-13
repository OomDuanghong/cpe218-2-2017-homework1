/**
 * Created by HP on 26/10/2559.
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {

    private static int state;

    public static int getState(){
        return state;
    }

    public static void nextState(){
        state++;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Background frame = new Background();
        frame.setVisible(true);
        state = 0;
        int time = 60;

        Items i1 = new Items();
        Items2 i2 = new Items2();
        Timec tc = new Timec();

        i1.setxy(580,330);
        i1.ItemCall(frame.layeredPane);

        i2.setxy(300,0);
        i2.ItemCall(frame.layeredPane);

        while(state == 0 && time > 0){
            tc.timeCall(frame.layeredPane);
            tc.countTime(frame.layeredPane,(time/60),(time%60)/10,time%10);
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 1;

        while(state == 1 && time > 0){
            tc.countTime(frame.layeredPane,(time/60),(time%60)/10,time%10);
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 2;
        i2.ChangePicState2(frame.layeredPane);
        TimeUnit.SECONDS.sleep(2);

        while(state == 2 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 3;

        i2.ChangePicState3(frame.layeredPane);
        TimeUnit.SECONDS.sleep(2);

        while(state == 3 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }
        if(time > 0) {
            state = 100;
            i1.removeItem(frame.layeredPane, i1.botton);
            i2.removeItem(frame.layeredPane, i2.botton);
            frame.nextStage();
        }

        while(state == 1 && time > 0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }
    }

}
