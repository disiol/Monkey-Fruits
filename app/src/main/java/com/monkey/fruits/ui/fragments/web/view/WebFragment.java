package com.monkey.fruits.ui.fragments.web.view;


import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;


import com.monkey.fruits.BuildConfig;
import com.monkey.fruits.R;
import com.monkey.fruits.databinding.FragmentWebBinding;
import com.monkey.fruits.manedger.PreferencesManager;
import com.monkey.fruits.routers.main.MainActivityRouter;
import com.monkey.fruits.ui.base.BaseBindingFragment;
import com.monkey.fruits.ui.fragments.web.presenter.WebPresenter;

import javax.inject.Inject;

import static com.monkey.fruits.constants.Constants.URI_STRING;


public class WebFragment extends BaseBindingFragment<WebPresenter, FragmentWebBinding> implements WebView {
    @Inject
    PreferencesManager preferencesManager;
    private String uri;
    private CountDownTimer countDownTimer;

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_web;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showProgress(binding.progressBar);

        countDownTimer = new CountDownTimer(3000, 1) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                presenter.showSite();
                hideProgress(binding.progressBar);
            }
        }.start();


    }


    @Override
    public void showSite() {
        try {
            String preferencesManagerURL = preferencesManager.getURL();
            if (preferencesManagerURL != null) {
                uri = preferencesManagerURL;

                if (BuildConfig.DEBUG) {
                    Log.d("my Log" + getActivity().getLocalClassName(), "uri: " + uri);
                }
            } else {
                uri = URI_STRING;
            }


            final Bitmap backButton = BitmapFactory.decodeResource(getResources(), R.drawable.round_done_black_24dp);

            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.enableUrlBarHiding();
            builder.setToolbarColor(Color.BLACK);
            builder.setShowTitle(false);
            builder.addDefaultShareMenuItem();
            builder.setCloseButtonIcon(backButton);


            CustomTabsIntent customTabsIntent = builder.build();

            boolean chromeInstalled = false;
            for (ApplicationInfo applicationInfo : getActivity().getPackageManager().getInstalledApplications(0)) {
                if (applicationInfo.packageName.equals("com.android.chrome")) {
                    chromeInstalled = true;
                    break;
                }
            }
            if (chromeInstalled) {
                customTabsIntent.intent.setPackage("com.android.chrome");
            }
            customTabsIntent.launchUrl(getActivity(), Uri.parse(uri));
        } catch (Resources.NotFoundException e) {

            if (BuildConfig.DEBUG) {
                Log.e("my Log" + getActivity().getLocalClassName(), "showSite: " + e.toString());

                e.printStackTrace();
            }
        }
    }

    @Override
    public void showMessage(String message) {

    }



    @Override
    public void onPause() {
        getActivity().finish();
        super.onPause();
    }

    @Override
    public void showError(Throwable throwable, MainActivityRouter mainActivityRouter) {

    }
}