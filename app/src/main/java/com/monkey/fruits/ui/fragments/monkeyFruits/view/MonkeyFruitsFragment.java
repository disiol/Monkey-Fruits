package com.monkey.fruits.ui.fragments.monkeyFruits.view;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.monkey.fruits.R;
import com.monkey.fruits.databinding.FragmentMonkeyFruitsBinding;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.monkeyFruits.presenter.MonkeyFruitsPresenter;


public class MonkeyFruitsFragment extends BaseBindingFragment<MonkeyFruitsPresenter, FragmentMonkeyFruitsBinding> implements MonkeyFruitsView {


    private final ImageView[] buttonPres = new ImageView[1];


    @Override
    public int getLayoutResId() {
        return R.layout.fragment_monkey_fruits;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView button1 = getActivity().findViewById(R.id.button1);
        ImageView button2 = getActivity().findViewById(R.id.button2);
        ImageView button3 = getActivity().findViewById(R.id.button3);
        ImageView button4 = getActivity().findViewById(R.id.button4);
        ImageView button5 = getActivity().findViewById(R.id.button5);
        ImageView button7 = getActivity().findViewById(R.id.button7);
        ImageView button6 = getActivity().findViewById(R.id.button6);
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
            int buttonNmberForMatch =6;

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
        button11.setOnClickListener(v -> {
            int buttonNmberForMatch = 6;

            doAfterClick(buttonNmberForMatch, button11, buttonPres);

        });
        button12.setOnClickListener(v -> {
            int buttonNmberForMatch = 7;

            doAfterClick(buttonNmberForMatch, button12, buttonPres);

        });
        button13.setOnClickListener(v -> {
            int buttonNmberForMatch = 8;

            doAfterClick(buttonNmberForMatch, button13, buttonPres);

        });
        button14.setOnClickListener(v -> {
            int buttonNmberForMatch = 9;

            doAfterClick(buttonNmberForMatch, button14, buttonPres);

        });
        button15.setOnClickListener(v -> {
            int buttonNmberForMatch = 10;

            doAfterClick(buttonNmberForMatch, button15, buttonPres);

        });
        button16.setOnClickListener(v -> {
            int buttonNmberForMatch = 6;

            doAfterClick(buttonNmberForMatch, button16, buttonPres);

        });
        button17.setOnClickListener(v -> {
            int buttonNmberForMatch = 7;

            doAfterClick(buttonNmberForMatch, button17, buttonPres);

        });
        button18.setOnClickListener(v -> {
            int buttonNmberForMatch = 8;

            doAfterClick(buttonNmberForMatch, button18, buttonPres);

        });
        button19.setOnClickListener(v -> {
            int buttonNmberForMatch = 9;

            doAfterClick(buttonNmberForMatch, button19, buttonPres);

        });
        button20.setOnClickListener(v -> {
            int buttonNmberForMatch = 10;

            doAfterClick(buttonNmberForMatch, button20, buttonPres);

        });
        button21.setOnClickListener(v -> {
            int buttonNmberForMatch = 11;

            doAfterClick(buttonNmberForMatch, button21, buttonPres);

        });
        button22.setOnClickListener(v -> {
            int buttonNmberForMatch = 12;

            doAfterClick(buttonNmberForMatch, button22, buttonPres);

        });

        button23.setOnClickListener(v -> {
            int buttonNmberForMatch = 11;

            doAfterClick(buttonNmberForMatch, button23, buttonPres);

        });
        button24.setOnClickListener(v -> {
            int buttonNmberForMatch = 12;

            doAfterClick(buttonNmberForMatch, button24, buttonPres);

        });


    }

    private void doAfterClick(int buttonNmberForMatch, ImageView buttonClick, ImageView[] safeButtonPres) {
        buttonClick.setClickable(false);
        cheakForNull(buttonClick);

        cheak(buttonNmberForMatch, buttonClick, safeButtonPres[0]);

    }

    protected void cheakForNull(ImageView buttonClick) {
        if (buttonPres[0] == null) {
            buttonPres[0] = buttonClick;
        }
    }

    private void cheak(int buttonNmberForMatch, ImageView buttonLastClic, ImageView safeButtonPres) {

        if (presenter.getNamber() != 0) {
            if (presenter.getNamber() == buttonNmberForMatch) {
                presenter.setNaber(0);


                safeButtonPres.setVisibility(View.GONE);
                this.buttonPres[0] = null;

                buttonLastClic.setVisibility(View.GONE);

                presenter.chakForMathes(true);
            } else if (presenter.getNamber() != buttonNmberForMatch && presenter.getNamber() != 0) {

                safeButtonPres.setClickable(true);
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