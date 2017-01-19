package marqueeview.szhua.com.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

/**
 * MarqueeView
 * Create   2017/1/17 16:36;
 * https://github.com/szhua
 *
 * @author sz.hua
 */
public class MarqueeView extends ViewFlipper {


   private BaseMarqueeAdapter baseMarqueeAdapter;

    public MarqueeView(Context context) {
        this(context,null);
    }
    public MarqueeView(Context context, AttributeSet attrs) {
        super(context, attrs);

        setInAnimation(AnimationUtils.loadAnimation(context,R.anim.animator_in));
        setOutAnimation(AnimationUtils.loadAnimation(context,R.anim.animator_out));

    }

    public void setBaseMarqueeAdapter(BaseMarqueeAdapter baseMarqueeAdapter){
        this.baseMarqueeAdapter = baseMarqueeAdapter;
         
        int itemCount = baseMarqueeAdapter.getItemCount() ;

        int lastType =Integer.MAX_VALUE;
        MarqueeViewHolder viewHolder=null ;
        for (int i = 0; i < itemCount; i++) {

        /*获得类型*/
        int type =  baseMarqueeAdapter.getItemViewType(i);

        /*不同类型的话，创建不同的viewHolder*/
        if(type!=lastType) {
            viewHolder = baseMarqueeAdapter.onCreateViewHolder(MarqueeView.this, type);
        }
        if(viewHolder!=null)

        //绑定数据
        baseMarqueeAdapter.onBindViewHolder(viewHolder,i);

        //添加view
        this.addView(viewHolder.itemView);
        }

    }



    public abstract static class MarqueeViewHolder{

        private View itemView ;

        public MarqueeViewHolder(View itemview){
            this.itemView =itemview ;
        }

    }


}
