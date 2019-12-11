package com.monkey.fruits.ui.fragments.monkeyFruits.presenter;


import android.util.Log;


import com.monkey.fruits.ui.base.BasePresenter;
import com.monkey.fruits.ui.fragments.monkeyFruits.view.MonkeyFruitsView;

import javax.inject.Inject;

import static com.monkey.fruits.constants.Constants.MYLOG_TEG;

public class MonkeyFruitsPresenter extends BasePresenter<MonkeyFruitsView> {
    private int caynterMatches;
    private int namber;

    @Inject
    MonkeyFruitsPresenter() {
    }

    public void chakForMathes(boolean mathes) {

        if (mathes) {
            caynterMatches++;
            Log.d(MYLOG_TEG, "caynterMatches " + caynterMatches);
        }

        if (!mathes) {
            getView().showMessage("Upss");
            Log.d(MYLOG_TEG, "Upss " + caynterMatches);
        }

        if (caynterMatches == 5) {
            getView().showMessage("You Win");
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
