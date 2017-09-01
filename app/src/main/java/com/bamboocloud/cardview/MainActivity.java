package com.bamboocloud.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {


    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView = (CardView)findViewById(R.id.cardView);

        cardView.setRadius(16);//设置图片圆角的半径大小

        cardView.setCardElevation(16);//设置阴影部分大小

        cardView.setContentPadding(10,10,10,10);//设置图片距离阴影大小

    }
}
