package com.example.verticalviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager=findViewById(R.id.viewpager);

        ArrayList<ShortsModel> shorts=new ArrayList<>();

        ////////////////////////////////////////////////////////////////////////////////// here i use url of video u can connect database here and add data to this arraylist
        shorts.add(new ShortsModel(0,0,"https://docjamal.xyz/wp-content/uploads/2020/08/video2.mp4","celebration at bar"));
        shorts.add(new ShortsModel(0,0,"https://docjamal.xyz/wp-content/uploads/2020/08/video1.mp4","new year festival"));
        shorts.add(new ShortsModel(0,0,"https://docjamal.xyz/wp-content/uploads/2020/08/video4.mp4","nature beauty"));
        shorts.add(new ShortsModel(0,0,"https://docjamal.xyz/wp-content/uploads/2020/08/video5.mp4","amezing roads"));
        shorts.add(new ShortsModel(0,0,"https://docjamal.xyz/wp-content/uploads/2020/08/video6.mp4","imaginary beauty"));
        shorts.add(new ShortsModel(0,0,"https://docjamal.xyz/wp-content/uploads/2020/08/video10.mp4","fitness trial"));
        //////////////////////////////////////////////////////////////////////////////////

        viewPager.setAdapter(new RecyclerViewAdapter(getApplicationContext(),shorts));




    }
}