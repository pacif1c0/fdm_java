package com.example.facedetectionmakeup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import java.util.ArrayList;

public class OnboardingActivity extends AppCompatActivity {


    private Object MainPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        Button button = (Button)findViewById(R.id.startbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        ViewPager pager = findViewById(R.id.viewPager_onboarding);

        pager.setOffscreenPageLimit(2);

        ViewpagerAdapter adapter = new ViewpagerAdapter(getSupportFragmentManager());

        OnboardingFragment1 onboardingFragment1 = new OnboardingFragment1();
        adapter.addItem(onboardingFragment1);

        OnboardingFragment2 onboardingFragment2 = new OnboardingFragment2();
        adapter.addItem(onboardingFragment2);

        pager.setAdapter(adapter);
    }
}