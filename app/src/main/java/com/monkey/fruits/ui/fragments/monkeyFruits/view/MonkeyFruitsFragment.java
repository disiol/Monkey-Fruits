package com.monkey.fruits.ui.fragments.monkeyFruits.view;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.monkey.fruits.R;
import com.monkey.fruits.databinding.FragmentMonkeyFruitsBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.presenter.MonkeyFruitsPresenter;


public class MonkeyFruitsFragment extends BaseBindingFragment<MonkeyFruitsPresenter, FragmentMonkeyFruitsBinding> implements MonkeyFruitsView {


    private final Button[] buttonPres = new Button[1];


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_monkey_fruits;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button1 = getActivity().findViewById(R.id.button1);
        Button button2 = getActivity().findViewById(R.id.button2);
        Button button3 = getActivity().findViewById(R.id.button3);
        Button button4 = getActivity().findViewById(R.id.button4);
        Button button5 = getActivity().findViewById(R.id.button5);
        Button button7 = getActivity().findViewById(R.id.button7);
        Button button6 = getActivity().findViewById(R.id.button6);
        Button button8 = getActivity().findViewById(R.id.button8);
        Button button9 = getActivity().findViewById(R.id.button9);
        Button button10 = getActivity().findViewById(R.id.button10);


        button1.setOnClickListener(v -> {
            int buttonNmberForMatch = 1;

            doAfterClick(buttonNmberForMatch, button1, buttonPres);


        });

        button2.setOnClickListener(v -> {
            int buttonNmberForMatch = 2;

            doAfterClick(buttonNmberForMatch, button2, buttonPres);

        });

        button3.setOnClickListener(v -> {
            int buttonNmberForMatch = 3;

            doAfterClick(buttonNmberForMatch, button3, buttonPres);

        });
        button4.setOnClickListener(v -> {
            int buttonNmberForMatch = 4;

            doAfterClick(buttonNmberForMatch, button4, buttonPres);

        });
        button5.setOnClickListener(v -> {
            int buttonNmberForMatch = 5;

            doAfterClick(buttonNmberForMatch, button5, buttonPres);

        });
        button6.setOnClickListener(v -> {
            int buttonNmberForMatch = 5;

            doAfterClick(buttonNmberForMatch, button6, buttonPres);

        });
        button7.setOnClickListener(v -> {
            int buttonNmberForMatch = 4;

            doAfterClick(buttonNmberForMatch, button7, buttonPres);

        });
        button8.setOnClickListener(v -> {
            int buttonNmberForMatch = 3;

            doAfterClick(buttonNmberForMatch, button8, buttonPres);

        });
        button9.setOnClickListener(v -> {
            int buttonNmberForMatch = 2;

            doAfterClick(buttonNmberForMatch, button9, buttonPres);

        });
        button10.setOnClickListener(v -> {
            int buttonNmberForMatch = 1;

            doAfterClick(buttonNmberForMatch, button10, buttonPres);

        });


    }

    private void doAfterClick(int buttonNmberForMatch, Button buttonClick, Button[] safeButtonPres) {
        buttonClick.setClickable(false);
        cheakForNull(buttonClick);

        cheak(buttonNmberForMatch, buttonClick, safeButtonPres[0]);

    }

    protected void cheakForNull(Button buttonClick) {
        if (buttonPres[0] == null) {
            buttonPres[0] = buttonClick;
        }
    }

    private void cheak(int buttonNmberForMatch, Button buttonLastClic, Button safeButtonPres) {

        if (presenter.getNamber() != 0) {
            if (presenter.getNamber() == buttonNmberForMatch) {
                presenter.setNaber(0);


                this.buttonPres[0].setVisibility(View.GONE);
                this.buttonPres[0] = null;

                buttonLastClic.setVisibility(View.GONE);

                presenter.chakForMathes(true);
            } else if (presenter.getNamber() != buttonNmberForMatch && presenter.getNamber() != 0) {

                this.buttonPres[0].setClickable(true);
                buttonLastClic.setClickable(true);

                this.buttonPres[0] = buttonLastClic;

                presenter.setNaber(0);

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
}