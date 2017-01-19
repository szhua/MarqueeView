package com.szhua.marqueeview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import marqueeview.szhua.com.library.BaseMarqueeAdapter;
import marqueeview.szhua.com.library.MarqueeView;

import static marqueeview.szhua.com.library.MarqueeView.*;

/**
 * MarqueeView
 * Create   2017/1/19 17:36;
 * https://github.com/szhua
 *
 * @author sz.hua
 */
public class MyAdapter extends BaseMarqueeAdapter {

   private List<Item> datas ;

    public void setDatas(List<Item> datas) {
        this.datas = datas;
    }

    @Override
    public MarqueeView.MarqueeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==1){
           return  new MyViewHolder(View.inflate(parent.getContext(),R.layout.item_layout,null));
        }else{
            return  new MyViewHolder(View.inflate(parent.getContext(),R.layout.item_layout2,null)) ;
        }

    }
    @Override
    public void onBindViewHolder(MarqueeView.MarqueeViewHolder marqueeViewHolder, int position) {
             MyViewHolder myViewHolder = (MyViewHolder) marqueeViewHolder;
            final Item item =datas.get(position) ;
            myViewHolder.name.setText(item.getName());
            myViewHolder.name.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),item.getName(),Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public int getItemViewType(int position) {
        return datas.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return datas==null?0:datas.size();
    }

    public class  MyViewHolder extends MarqueeView.MarqueeViewHolder{
        private TextView name  ;
        public MyViewHolder(View itemview) {
            super(itemview);
            name = (TextView) itemview.findViewById(R.id.name);
        }
    }

}
