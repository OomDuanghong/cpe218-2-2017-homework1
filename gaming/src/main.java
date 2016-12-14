
/**
 * Created by HP on 26/10/2559.
 */

import sun.audio.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {
    public AudioStream MBG;

    private static int state;
    private static int state2;
    private static int state3;
    private static int state4;
    private static int state5;


    public static int getState(){
        return state;
    }
    public static int getState2(){return state2;}
    public static int getState3(){
        return state3;
    }
    public static int getState4(){
        return state4;
    }
    public static int getState5(){
        return state5;
    }

    public static void nextState(){
        state++;
    }
    public static void nextState2(){
        state2++;
    }
    public static void nextState3(){
        state3++;
    }
    public static void nextState4(){
        state4++;
    }
    public static void nextState5(){
        state5++;
    }
    public static int time = 120;
    public static void main(String[] args) throws IOException, InterruptedException {
        Background frame = new Background();
        frame.setVisible(true);
        state = -1;
        state2 = 0;
        state3 = 0;
        state4 = 0;
        state5 = 0;

        Timec tc = new Timec();

        AudioPlayer PM = AudioPlayer.player;
        AudioStream MBG = new AudioStream(new FileInputStream("Sound//Ghost-in-the-house.wav"));
        PM.start(MBG);

        Items1 i0 = new Items1(); //startpush
        Items1 i1 = new Items1(); //messeges
        Items2 i2 = new Items2(); //familypic
        //Items3 i3 = new Items3(); //noteLnlivingroom
        Items5 i4 = new Items5(); //clock
        //Items1 i5 = new Items1(); //bottle
        //Items4 i6 = new Items4(); //blood

        i0.setxy(380, 260);
        i0.ItemCall0(frame.layeredPane);

        while (time > 0) {

            while (state == -1) {
                TimeUnit.SECONDS.sleep(1);
            }
            AudioPlayer PM2 = AudioPlayer.player;
            AudioStream MBG2 = null;
            try {
                MBG2 = new AudioStream(new FileInputStream("Sound//Halloween-doorbell.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM2.start(MBG2);
            i0.removeItem(frame.layeredPane, i0.botton0);
            frame.nextStage();

            state = 0;

            i1.setxy(580, 330);
            i1.ItemCall1(frame.layeredPane);

            i2.setxy(300, 0);
            i2.ItemCall2(frame.layeredPane);

            i4.setxy(130, 10);
            i4.ItemCall4(frame.layeredPane);

            while (state == 0 && time > 0) {
                tc.timeCall(frame.layeredPane);
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state : " + state);
            }

            state = 1;

            Items3 i3 = new Items3(); //noteLnlivingroom
            i3.setxy(0, 0);
            i3.ItemCall3(frame.layeredPane);

            while (state == 1 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state : " + state);
            }

            state = 2;

            i3.removeItem(frame.layeredPane, i3.botton3);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            while (state == 2 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state : " + state);
            }

            state = 3;

            i2.ChangePicState2(frame.layeredPane);
            TimeUnit.SECONDS.sleep(1);
            i2.ChangePicState3(frame.layeredPane);
            TimeUnit.SECONDS.sleep(2);

            while (state == 3 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state : " + state);
            }

            state = 4;

            i1.removeItem(frame.layeredPane, i1.botton1);
            i2.removeItem(frame.layeredPane, i2.botton2);
            i4.removeItem(frame.layeredPane, i4.botton4);

            frame.nextStage1();

            frame.nextStage1();

            Items1 i5 = new Items1(); //bottle
            i5.setxy(400, 360);
            i5.ItemCall5(frame.layeredPane);

            Items3 i7 = new Items3(); //note2
            i7.setxy(360, 430);
            i7.ItemCall7(frame.layeredPane);

            Items5 i8 = new Items5(); //books
            i8.setxy(245, 390);
            i8.ItemCall8(frame.layeredPane);

            while (state == 4 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state : " + state);
            }

            state2 = 1;
            //show blood
            Items4 i6 = new Items4();
            i6.setxy(410, 375);
            i6.ItemCall6(frame.layeredPane);

            while (state2 == 1 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state2 : " + state2);
            }

            state2 = 2;

            Items1 i9 = new Items1();
            i9.setxy(0, 0);
            i9.ItemCall9(frame.layeredPane);

            while (state2 == 2 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state2 : " + state2);
            }

            state2 = 3;
            //letter disapear
            i9.removeItem(frame.layeredPane, i9.botton9);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            while (state2 == 3 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state2 : " + state2);
            }

            state2 = 4;

            AudioPlayer PM1 = AudioPlayer.player;
            AudioStream MBG1 = null;
            try {
                MBG1 = new AudioStream(new FileInputStream("Sound//ScaryGirl.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM1.start(MBG1);


            //show ghost
            Items4 i10 = new Items4();
            i10.setxy(710, 170);
            i10.ItemCall10(frame.layeredPane);

            while (state2 == 4 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state2 : " + state2);
            }

            //push book
            state2 = 5;

            i5.removeItem(frame.layeredPane, i5.botton5);
            i6.removeItem(frame.layeredPane, i6.botton6);
            i7.removeItem(frame.layeredPane, i7.botton7);
            i8.removeItem(frame.layeredPane, i8.botton8);
            i10.removeItem(frame.layeredPane, i10.botton10);

            frame.nextStage2(); //son's room

            //implement
            //robot
            Items1 i11 = new Items1();
            i11.setxy(570, 300);
            i11.ItemCall11(frame.layeredPane);
            //car
            Items3 i12 = new Items3();
            i12.setxy(400, 400);
            i12.ItemCall12(frame.layeredPane);

            state3 =0;

            while (state3 == 0 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state3 : " + state3);
            }

            state3 = 1;

            i11.ChangePicState4(frame.layeredPane);
            TimeUnit.SECONDS.sleep(1);

            while (state3 == 1 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state3 : " + state3);
            }

            state3 = 2;
            //show blood
            Items5 i13 = new Items5();
            i13.setxy(400, 400);
            i13.ItemCall13(frame.layeredPane);

            while (state3 == 2 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state3 : " + state3);
            }

            AudioPlayer PM0 = AudioPlayer.player;
            AudioStream MBG0 = null;
            try {
                MBG0 = new AudioStream(new FileInputStream("Sound//household040.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM0.start(MBG0);
            state3 = 3;

            //cracked window
            Items4 i14 = new Items4();
            i14.setxy(0, 0);
            i14.ItemCall14(frame.layeredPane);

            while (state3 == 3 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state3 : " + state3);
            }

            state3 = 4;

            i11.removeItem(frame.layeredPane, i11.botton11);
            i12.removeItem(frame.layeredPane, i12.botton12);
            i13.removeItem(frame.layeredPane, i13.botton13);
            i14.removeItem(frame.layeredPane, i14.botton14);

            frame.nextStage3();
            //show calender
            Items2 i15 = new Items2();
            i15.setxy(190, 140);
            i15.ItemCall15(frame.layeredPane);

            //show chair
            Items6 i16 = new Items6();
            i16.setxy(620, 360);
            i16.ItemCall16(frame.layeredPane);

            //showmirrorbase
            Items5 i18 = new Items5();
            i18.setxy(282, 135);
            i18.ItemCall18(frame.layeredPane);

            state4 = 0;

            AudioPlayer PML = AudioPlayer.player;
            AudioStream MBGL = new AudioStream(new FileInputStream("Sound//Ghost-in-the-house.wav"));
            PML.start(MBGL);

            while (state4 == 0 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state4 : " + state4);
            }

            AudioPlayer PM3 = AudioPlayer.player;
            AudioData MD3;
            AudioStream MBG3 = null;
            try {
                MBG3 = new AudioStream(new FileInputStream("Sound//Giggle.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM3.start(MBG3);
            state4 = 1;

            //show doll
            Items1 i17 = new Items1();
            i17.setxy(420, 0);
            i17.ItemCall17(frame.layeredPane);

            while (state4 == 1 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state4 : " + state4);
            }

            state4 = 2;
            //switch
            i16.ChangePicState5(frame.layeredPane);
            TimeUnit.SECONDS.sleep(1);

            //show mirror
            Items1 i19 = new Items1();
            i19.setxy(300, 147);
            i19.ItemCall19(frame.layeredPane);

            while (state4 == 2 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state4 : " + state4);
            }

            state4 = 3;

            AudioPlayer PM4= AudioPlayer.player;
            AudioStream MBG4 = null;
            try {
                MBG4 = new AudioStream(new FileInputStream("Sound//Hanged.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM4.start(MBG4);

            //delete doll
            i17.removeItem(frame.layeredPane, i17.botton17);
            i19.removeItem(frame.layeredPane, i19.botton19);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            //show ghost
            Items3 i20 = new Items3();
            i20.setxy(420, 0);
            i20.ItemCall20(frame.layeredPane);

            while (state4 == 3 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state4 : " + state4);
            }

            state4 = 4;

            AudioPlayer PM5 = AudioPlayer.player;
            AudioStream MBG5 = null;
            try {
                MBG5 = new AudioStream(new FileInputStream("Sound//lidcreak.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM5.start(MBG5);

            i15.removeItem(frame.layeredPane, i15.botton15);
            i16.removeItem(frame.layeredPane, i16.botton16);
            i17.removeItem(frame.layeredPane, i17.botton17);
            i18.removeItem(frame.layeredPane, i18.botton18);
            i19.removeItem(frame.layeredPane, i19.botton19);
            i20.removeItem(frame.layeredPane, i20.botton20);

            frame.nextStage4();

            //show pic
            Items6 i21 = new Items6();
            i21.setxy(620, 80);
            i21.ItemCall21(frame.layeredPane);
            //show radio
            Items5 i22 = new Items5();
            i22.setxy(270, 340);
            i22.ItemCall22(frame.layeredPane);

            //ลิ้นชัก
            Items4 i23 = new Items4();
            i23.setxy(161, 417);
            i23.ItemCall23(frame.layeredPane);

            state5 = 0;

            while (state5 == 0 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 1;

            //show Bigpic
            Items3 i24 = new Items3();
            i24.setxy(0, 0);
            i24.ItemCall24(frame.layeredPane);

            while (state5 == 1 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 2;

            //bigpic disapear

            AudioPlayer PM6= AudioPlayer.player;
            AudioStream MBG6 = null;
            try {
                MBG6 = new AudioStream(new FileInputStream("Sound//Door-knocking-sound.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM6.start(MBG6);

            i24.removeItem(frame.layeredPane, i24.botton24);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            while (state5 == 2 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 3;


            AudioPlayer PM7= AudioPlayer.player;
            AudioStream MBG7 = null;
            try {
                MBG7 = new AudioStream(new FileInputStream("Sound//Gun+Clip.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM7.start(MBG7);

            //show boxx
            Items2 i25 = new Items2();
            i25.setxy(181, 405);
            i25.ItemCall25(frame.layeredPane);

            while (state5 == 3 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 4;

            AudioPlayer PM8= AudioPlayer.player;
            AudioStream MBG8 = null;
            try {
                MBG8 = new AudioStream(new FileInputStream("Sound//Gunshot.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM8.start(MBG8);

            //show big gun
            Items1 i26 = new Items1();
            i26.setxy(0, 0);
            i26.ItemCall26(frame.layeredPane);

            while (state5 == 4 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 5;

            AudioPlayer PM9= AudioPlayer.player;
            AudioStream MBG9 = null;
            try {
                MBG9 = new AudioStream(new FileInputStream("Sound//Gun+Clip.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM9.start(MBG9);

            //big gun out
            i26.removeItem(frame.layeredPane, i26.botton26);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            while (state5 == 5 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 6;

            AudioPlayer PM10= AudioPlayer.player;
            AudioStream MBG10 = null;
            try {
                MBG10 = new AudioStream(new FileInputStream("Sound//hhgsfog.wav"));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            PM10.start(MBG10);

            //pic disapear
            i21.removeItem(frame.layeredPane, i21.botton21);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            //picdown
            Items6 i27 = new Items6();
            i27.setxy(545, 150);
            i27.ItemCall27(frame.layeredPane);

            while (state5 == 6 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 7;

            //show key
            Items5 i28 = new Items5();
            i28.setxy(430, 500);
            i28.ItemCall28(frame.layeredPane);

            while (state5 == 7 && time > 0) {
                tc.countTime(frame.layeredPane, (time / 60), (time % 60) / 10, time % 10);
                TimeUnit.SECONDS.sleep(1);
                time--;
                System.out.println("time : " + time);
                System.out.println("state5 : " + state5);
            }

            state5 = 8;

            //win
            i25.removeItem(frame.layeredPane, i25.botton25);
            i28.removeItem(frame.layeredPane, i28.botton28);
            frame.layeredPane.setVisible(false);
            frame.layeredPane.setVisible(true);

            Items2 i30 = new Items2();
            i30.setxy(0, 0);
            i30.ItemCall30(frame.layeredPane);
        }
        Items4 i29 = new Items4();
        i29.setxy(0,0);
        i29.ItemCall29(frame.layeredPane);
        AudioPlayer PM10= AudioPlayer.player;
        AudioStream MBG10 = null;
        try {
            MBG10 = new AudioStream(new FileInputStream("Sound//287.wav"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        PM10.start(MBG10);
    }
}