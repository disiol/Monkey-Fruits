package com.monkey.fruits.ui.fragments.monkeyFruits.view;


import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.monkey.fruits.R;
import com.monkey.fruits.databinding.FragmentMonkeyFruitsBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.presenter.MonkeyFruitsPresenter;
import com.squareup.picasso.Picasso;

import static com.monkey.fruits.constants.Constants.MYLOG_TEG;


public class MonkeyFruitsFragment extends BaseBindingFragment<MonkeyFruitsPresenter, FragmentMonkeyFruitsBinding> implements MonkeyFruitsView {


    private final ImageView[] buttonPres = new ImageView[1];

    private Animation animRotate = null;
    private CountDownTimer countDownTimerConfirmationImageView;


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_monkey_fruits;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        animRotate = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);

        ImageView button1 = getActivity().findViewById(R.id.button1);
        ImageView button2 = getActivity().findViewById(R.id.button2);
        ImageView button3 = getActivity().findViewById(R.id.button3);
        ImageView button4 = getActivity().findViewById(R.id.button4);
        ImageView button5 = getActivity().findViewById(R.id.button5);
        ImageView button6 = getActivity().findViewById(R.id.button6);
        ImageView button7 = getActivity().findViewById(R.id.button7);
        ImageView button8 = getActivity().findViewById(R.id.button8);
        ImageView button9 = getActivity().findViewById(R.id.button9);

        ImageView button10 = getActivity().findViewById(R.id.button10);
        ImageView button11 = getActivity().findViewById(R.id.button11);
        ImageView button12 = getActivity().findViewById(R.id.button12);
        ImageView button13 = getActivity().findViewById(R.id.button13);
        ImageView button14 = getActivity().findViewById(R.id.button14);
        ImageView button15 = getActivity().findViewById(R.id.button15);
        ImageView button16 = getActivity().findViewById(R.id.button16);
        ImageView button17 = getActivity().findViewById(R.id.button17);
        ImageView button18 = getActivity().findViewById(R.id.button18);
        ImageView button19 = getActivity().findViewById(R.id.button19);
        ImageView button20 = getActivity().findViewById(R.id.button20);
        ImageView button21 = getActivity().findViewById(R.id.button21);
        ImageView button22 = getActivity().findViewById(R.id.button22);
        ImageView button23 = getActivity().findViewById(R.id.button23);
        ImageView button24 = getActivity().findViewById(R.id.button24);


        button1.setOnClickListener(v -> {
            int buttonNmberForMatch = 1;

            doAfterClick(buttonNmberForMatch, button1, buttonPres, view, R.drawable.mantch_1);


        });

        button2.setOnClickListener(v -> {
            int buttonNmberForMatch = 2;

            doAfterClick(buttonNmberForMatch, button2, buttonPres, view, R.drawable.mantch_2);

        });

        button3.setOnClickListener(v -> {
            int buttonNmberForMatch = 3;

            doAfterClick(buttonNmberForMatch, button3, buttonPres, view, R.drawable.mantch_3);

        });
        button4.setOnClickListener(v -> {
            int buttonNmberForMatch = 4;

            doAfterClick(buttonNmberForMatch, button4, buttonPres, view, R.drawable.mantch_4);

        });
        button5.setOnClickListener(v -> {
            int buttonNmberForMatch = 5;

            doAfterClick(buttonNmberForMatch, button5, buttonPres, view, R.drawable.mantch_5);

        });
        button6.setOnClickListener(v -> {
            int buttonNmberForMatch = 5;

            doAfterClick(buttonNmberForMatch, button6, buttonPres, view, R.drawable.mantch_5);

        });
        button7.setOnClickListener(v -> {
            int buttonNmberForMatch = 4;

            doAfterClick(buttonNmberForMatch, button7, buttonPres, view, R.drawable.mantch_4);

        });
        button8.setOnClickListener(v -> {
            int buttonNmberForMatch = 3;

            doAfterClick(buttonNmberForMatch, button8, buttonPres, view, R.drawable.mantch_3);

        });
        button9.setOnClickListener(v -> {
            int buttonNmberForMatch = 2;

            doAfterClick(buttonNmberForMatch, button9, buttonPres, view, R.drawable.mantch_2);

        });
        button10.setOnClickListener(v -> {
            int buttonNmberForMatch = 1;

            doAfterClick(buttonNmberForMatch, button10, buttonPres, view, R.drawable.mantch_1);

        });
        button11.setOnClickListener(v -> {
            int buttonNmberForMatch = 6;

            doAfterClick(buttonNmberForMatch, button11, buttonPres, view, R.drawable.mantch_6);

        });
        button12.setOnClickListener(v -> {
            int buttonNmberForMatch = 7;

            doAfterClick(buttonNmberForMatch, button12, buttonPres, view, R.drawable.mantch_7);

        });
        button13.setOnClickListener(v -> {
            int buttonNmberForMatch = 8;

            doAfterClick(buttonNmberForMatch, button13, buttonPres, view, R.drawable.mantch_8);

        });
        button14.setOnClickListener(v -> {
            int buttonNmberForMatch = 9;

            doAfterClick(buttonNmberForMatch, button14, buttonPres, view, R.drawable.mantch_9);

        });
        button15.setOnClickListener(v -> {
            int buttonNmberForMatch = 10;

            doAfterClick(buttonNmberForMatch, button15, buttonPres, view, R.drawable.mantch_10);

        });
        button16.setOnClickListener(v -> {
            int buttonNmberForMatch = 6;

            doAfterClick(buttonNmberForMatch, button16, buttonPres, view, R.drawable.mantch_6);

        });
        button17.setOnClickListener(v -> {
            int buttonNmberForMatch = 7;

            doAfterClick(buttonNmberForMatch, button17, buttonPres, view, R.drawable.mantch_7);

        });
        button18.setOnClickListener(v -> {
            int buttonNmberForMatch = 8;

            doAfterClick(buttonNmberForMatch, button18, buttonPres, view, R.drawable.mantch_8);

        });
        button19.setOnClickListener(v -> {
            int buttonNmberForMatch = 9;

            doAfterClick(buttonNmberForMatch, button19, buttonPres, view, R.drawable.mantch_9);

        });
        button20.setOnClickListener(v -> {
            int buttonNmberForMatch = 10;

            doAfterClick(buttonNmberForMatch, button20, buttonPres, view, R.drawable.mantch_10);

        });
        button21.setOnClickListener(v -> {
            int buttonNmberForMatch = 11;

            doAfterClick(buttonNmberForMatch, button21, buttonPres, view, R.drawable.mantch_11);

        });
        button22.setOnClickListener(v -> {
            int buttonNmberForMatch = 12;

            doAfterClick(buttonNmberForMatch, button22, buttonPres, view, R.drawable.mantch_12);

        });

        button23.setOnClickListener(v -> {
            int buttonNmberForMatch = 11;

            doAfterClick(buttonNmberForMatch, button23, buttonPres, view, R.drawable.mantch_11);

        });
        button24.setOnClickListener(v -> {
            int buttonNmberForMatch = 12;

            doAfterClick(buttonNmberForMatch, button24, buttonPres, view, R.drawable.mantch_12);

        });


    }

    private void doAfterClick(int buttonNmberForMatch, ImageView buttonClick, ImageView[] safeButtonPres, View v, int drable) {
        loadImage(drable, buttonClick);

        buttonClick.startAnimation(animRotate);
        buttonClick.setClickable(false);
        cheakForNull(buttonClick);

        cheak(buttonNmberForMatch, buttonClick, safeButtonPres[0], drable);

    }

    protected void cheakForNull(ImageView buttonClick) {
        if (buttonPres[0] == null) {
            buttonPres[0] = buttonClick;
            Log.d(MYLOG_TEG, "cheakForNull =  " +   buttonPres[0]);

        }
    }

    private void cheak(int buttonNmberForMatch, ImageView buttonLastClic, ImageView safeButtonPres, int drable) {
        int skirt = R.drawable.skirt;

        if (presenter.getNamber() != 0) {
            if (presenter.getNamber() == buttonNmberForMatch) {
                presenter.setNaber(0);


                safeButtonPres.setVisibility(View.GONE);
                this.buttonPres[0] = null;

                buttonLastClic.setVisibility(View.GONE);

                presenter.chakForMathes(true);
            } else if (presenter.getNamber() != buttonNmberForMatch && presenter.getNamber() != 0) {




                presenter.setNaber(0);
               // loadImage(skirt, safeButtonPres);

                boolean equals = safeButtonPres.equals(buttonLastClic);

                Log.d(MYLOG_TEG, "equals " + equals);


                if (!equals) {
                    loadImage(skirt, safeButtonPres);
                    this.buttonPres[0] = null;


                    countDownTimerConfirmationImageView = new CountDownTimer(100, 1) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                        }

                        @Override
                        public void onFinish() {
                            loadImage(skirt, buttonLastClic);
                        }
                    }.start();


                } else if (equals) {
                    loadImage(skirt, safeButtonPres);
                }

                safeButtonPres.setClickable(true);
                buttonLastClic.setClickable(true);

                presenter.chakForMathes(false);
            }
        } else if (presenter.getNamber() >= 0) {
            presenter.setNaber(buttonNmberForMatch);
        }
    }


    @Override
    public void showMessage(String message) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(message)
                .setCancelable(false)
                .setNegativeButton("ОК",
                        (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }


    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {

    }


    @Override
    public void showEndGame(MainActivityRouter mainActivityRouter, boolean flag) {

        mainActivityRouter.showWinFragment(flag);
    }

    public void loadImage(int part, ImageView button) {
        Picasso.get().load(part).into(button);
    }
}