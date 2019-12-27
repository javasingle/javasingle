package com.single.singletest;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimeTask {

    Timer timer;
    public TestTimeTask(int a){
        Timer timer = new Timer();
        timer.schedule(new GoodTimerTask(),0,1000*a);
    }

    public static void main(String[] args) {
        System.out.println("a schedule task");
        new TestTimeTask(3);

    }


    class GoodTimerTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("timer running!");
        }
    }
}
