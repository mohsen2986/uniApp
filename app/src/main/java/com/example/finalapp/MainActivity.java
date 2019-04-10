package com.example.finalapp;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderLayout;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity {
    private SliderLayout sliderLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        slider();
        hideSystemUi();
        Ui();

    }
    private void initialize()
    {
        sliderLayout=findViewById(R.id.image_slider);
    }
    private void slider()
    {
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.WORM);
        sliderLayout.setScrollTimeInSec(3);

        for (int i=0;i<3;i++)
        {
            DefaultSliderView slider=new DefaultSliderView(this);
            switch(i)
            {
                case 0:slider.setImageDrawable(R.drawable.one); break;
                case 1:slider.setImageDrawable(R.drawable.two); break;
                case 2:slider.setImageDrawable(R.drawable.three); break;
            }
            slider.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            slider.setDescription("this is the "+(i+1));
            final int image=i;
            slider.setOnSliderClickListener(new SliderView.OnSliderClickListener() {
                @Override
                public void onSliderClick(SliderView sliderView) {
                    Toast.makeText(MainActivity.this, "u clicked image"+(image+1), Toast.LENGTH_SHORT).show();
                }
            });
            sliderLayout.addSliderView(slider);
        }
    }
    private void hideSystemUi()
    {
        View decorView=getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                // remove sticky !!!
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE|
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                View.SYSTEM_UI_FLAG_FULLSCREEN
        );
    }
    private void Ui()
    {
        Drawable drawable = getResources().getDrawable(R.drawable.newspaper);
        drawable.setBounds(0, 0, (int)(drawable.getIntrinsicWidth()*.70),
                (int)(drawable.getIntrinsicHeight()*0.70));
        ScaleDrawable sd = new ScaleDrawable(drawable, 0, 100, 100);
        Button btn = findViewById(R.id.btn_news);
        btn.setCompoundDrawables(sd.getDrawable(), null, null, null); //set drawableLeft for example
    }
}
