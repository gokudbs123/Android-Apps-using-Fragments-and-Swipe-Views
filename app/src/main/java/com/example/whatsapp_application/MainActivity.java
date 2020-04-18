package com.example.whatsapp_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView camera,chat,status,call;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera=(TextView)findViewById(R.id.cam);
        chat=(TextView)findViewById(R.id.cht);
        status=(TextView)findViewById(R.id.stat);
        call=(TextView)findViewById(R.id.cals);
        viewPager=(ViewPager)findViewById(R.id.fg);
        pagerViewAdapter=new PagerViewAdapter(getSupportFragmentManager(),1);

        viewPager.setAdapter(pagerViewAdapter);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);
            }



            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void onChangeTab(int position) {

        if(position==0)
        {
            camera.setTextSize(25);
            camera.setTextColor(getColor(R.color.light));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.bright_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.bright_color));

            call.setTextSize(20);
            call.setTextColor(getColor(R.color.bright_color));
        }
        if(position==1)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.bright_color));

            chat.setTextSize(25);
            chat.setTextColor(getColor(R.color.light));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.bright_color));

            call.setTextSize(20);
            call.setTextColor(getColor(R.color.bright_color));
        }
        if(position==2)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.bright_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.bright_color));

            status.setTextSize(25);
            status.setTextColor(getColor(R.color.light));

            call.setTextSize(20);
            call.setTextColor(getColor(R.color.bright_color));
        }
        if(position==3)
        {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.bright_color));

            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.bright_color));

            status.setTextSize(20);
            status.setTextColor(getColor(R.color.bright_color));

            call.setTextSize(25);
            call.setTextColor(getColor(R.color.light));
        }
    }
}
