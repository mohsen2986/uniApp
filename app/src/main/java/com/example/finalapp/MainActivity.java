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
    private Button btn_news;
    private Button btn_events;
    private Button btn_map;
    private Button btn_bus;
    private Button btn_about_us;
    private Button btn_tick;
    private Button btn_guide;
    private Button btn_help;

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
        btn_news=findViewById(R.id.btn_news);
        btn_events=findViewById(R.id.btn_events);
        btn_bus=findViewById(R.id.btn_bus);
        btn_about_us=findViewById(R.id.btn_about_us);
        btn_guide=findViewById(R.id.btn_guide);
        btn_map=findViewById(R.id.btn_map);
        btn_tick=findViewById(R.id.btn_tick);
        btn_help=findViewById(R.id.btn_help);
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
        Drawable drawable;
        ScaleDrawable scaleDrawable;
        // set the news button
        drawable=getResources().getDrawable(R.drawable.news);
        drawable.setBounds(0, 0, (int)(drawable.getIntrinsicWidth()*.70),
                (int)(drawable.getIntrinsicHeight()*0.70));
        scaleDrawable = new ScaleDrawable(drawable, 0, 100, 100);
        btn_news.setCompoundDrawables(scaleDrawable.getDrawable(), null, null, null); //set drawableLeft for example*/
        // set the events button
        drawable=getResources().getDrawable(R.drawable.calendar);
        drawable.setBounds(0, 0, (int)(drawable.getIntrinsicWidth()*.70),
                (int)(drawable.getIntrinsicHeight()*0.70));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_events.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
        // set thr map button
        drawable =getResources().getDrawable(R.drawable.college);
        drawable.setBounds(0,0,(int) (drawable.getIntrinsicWidth()*.60)
                ,(int)(drawable.getIntrinsicHeight()*0.60));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_map.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
        // set the bus services button
        drawable=getResources().getDrawable(R.drawable.bus);
        drawable.setBounds(0,0,(int) (drawable.getIntrinsicWidth()*.60)
                ,(int)(drawable.getIntrinsicHeight()*0.60));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_bus.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
        // set the tick button
        drawable=getResources().getDrawable(R.drawable.tick);
        drawable.setBounds(0,0,(int) (drawable.getIntrinsicWidth()*.60)
                ,(int)(drawable.getIntrinsicHeight()*0.60));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_tick.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
        // set the guide button
        drawable=getResources().getDrawable(R.drawable.support);
        drawable.setBounds(0,0,(int) (drawable.getIntrinsicWidth()*.60)
                ,(int)(drawable.getIntrinsicHeight()*0.60));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_guide.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
        // set the about us button
        drawable=getResources().getDrawable(R.drawable.technology);
        drawable.setBounds(0,0,(int) (drawable.getIntrinsicWidth()*.60)
                ,(int)(drawable.getIntrinsicHeight()*0.60));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_about_us.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
        // set the help button
        drawable=getResources().getDrawable(R.drawable.give);
        drawable.setBounds(0,0,(int) (drawable.getIntrinsicWidth()*.60)
                ,(int)(drawable.getIntrinsicHeight()*0.60));
        scaleDrawable=new ScaleDrawable(drawable,0,100,100);
        btn_help.setCompoundDrawables(scaleDrawable.getDrawable(),null,null,null);
    }
}
