package com.monkey.fruits.ui.fragments.monkeyFruits.presenter;


import android.util.Log;


import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.monkeyFruits.view.MonkeyFruitsView;

import javax.inject.Inject;

import static com.monkey.fruits.constants.Constants.MYLOG_TEG;

public class MonkeyFruitsPresenter extends BasePresenter<MonkeyFruitsView> {
    private static final int ForMatches = 10;
    private int lifes = 5;
    private int caynterMatches;
    private int namber;
    private int points;
    private MainActivityRouter mainActivityRouter;

    @Inject
    MonkeyFruitsPresenter(MainActivityRouter mainActivityRouter) {
        this.mainActivityRouter = mainActivityRouter;
    }

    public void chakForMathes(boolean mathes) {

        if (mathes) {
            caynterMatches++;
            points++;
            getView().setPoints(points);
            Log.d(MYLOG_TEG, "caynterMatches " + caynterMatches);
        }

        if (!mathes) {

            if (points != 0) {
                points--;
            }
            getView().setPoints(points);


            if (lifes == 0) {
                getView().showEndGame(mainActivityRouter, false, points);
            } else {
                lifes--;
                getView().showMessage("Liefs left : " + lifes);
                getView().setLifesLeft(lifes);

            }

            Log.d(MYLOG_TEG, "Upss " + caynterMatches);
        }

        if (caynterMatches == ForMatches) {
            getView().showEndGame(mainActivityRouter, true, points);
        }
    }


    public int getNamber() {
        Log.d(MYLOG_TEG, "getNamber " + namber);
        return namber;

    }


    public void setNaber(int i) {
        namber = i;

        Log.d(MYLOG_TEG, "setNaber " + namber);
    }
}
