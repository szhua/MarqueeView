package com.szhua.marqueeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import marqueeview.szhua.com.library.MarqueeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MarqueeView marqueeView = (MarqueeView) findViewById(R.id.maquee_view);


        MyAdapter myAdapter =new MyAdapter() ;
        List<Item> datas =new ArrayList<>() ;
        for (int i=0 ;i<8;i++){
            Item item =new Item() ;
            if(i%2==0){
                item.setName("fdsjfjkds");
                item.setType(1);
            }else{
                item.setName("黑马培训官网");
                item.setType(2);
            }
            datas.add(item);
        }
        myAdapter.setDatas(datas);
        marqueeView.setBaseMarqueeAdapter(myAdapter);

        marqueeView.startFlipping();
    }
}
