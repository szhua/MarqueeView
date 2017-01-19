package marqueeview.szhua.com.library;

import android.view.ViewGroup;

/**
 * MarqueeView
 * Create   2017/1/19 17:04;
 * https://github.com/szhua
 *
 * @author sz.hua
 */
public  abstract  class BaseMarqueeAdapter implements MarqueeAdapterImp {

    @Override
    public  abstract  MarqueeView.MarqueeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) ;
    @Override
    public abstract void onBindViewHolder(MarqueeView.MarqueeViewHolder marqueeViewHolder, int position) ;
    @Override
    public abstract int getItemViewType(int position) ;
    @Override
    public abstract   int getItemCount();


}
