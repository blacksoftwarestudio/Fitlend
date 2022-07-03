package com.blacksoftwarestudio.fitlend;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.github.appintro.AppIntro2;
import com.github.appintro.AppIntroFragment;

public class AppIntro extends AppIntro2
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("", "", R.drawable.fitnessappintroicon, getResources().getColor(R.color.appintorbackgroundcolor1), getResources().getColor(R.color.appintrotextcolor1), getResources().getColor(R.color.appintrotextcolor1)));
        addSlide(AppIntroFragment.newInstance("", "", R.drawable.fitnessappintroicon, getResources().getColor(R.color.appintorbackgroundcolor1), getResources().getColor(R.color.appintrotextcolor1), getResources().getColor(R.color.appintrotextcolor1)));
        addSlide(AppIntroFragment.newInstance("", "", R.drawable.fitnessappintroicon, getResources().getColor(R.color.appintorbackgroundcolor1), getResources().getColor(R.color.appintrotextcolor1), getResources().getColor(R.color.appintrotextcolor1)));
        addSlide(AppIntroFragment.newInstance("", "", R.drawable.fitnessappintroicon, getResources().getColor(R.color.appintorbackgroundcolor1), getResources().getColor(R.color.appintrotextcolor1), getResources().getColor(R.color.appintrotextcolor1)));
        addSlide(AppIntroFragment.newInstance("", "", R.drawable.fitnessappintroicon, getResources().getColor(R.color.appintorbackgroundcolor1), getResources().getColor(R.color.appintrotextcolor1), getResources().getColor(R.color.appintrotextcolor1)));

        setIndicatorColor(getResources().getColor(R.color.indicatorcolor1), getResources().getColor(R.color.indicatorcolor2));

        showStatusBar(true);

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(), Dashboard.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(), Dashboard.class);
        startActivity(intent);
        finish();
    }
}