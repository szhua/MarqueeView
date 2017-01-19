package marqueeview.szhua.com.library;

import android.view.ViewGroup;

/**
 * MarqueeView
 * Create   2017/1/19 17:14;
 * https://github.com/szhua
 *
 * @author sz.hua
 */
public interface MarqueeAdapterImp {

    MarqueeView.MarqueeViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    void onBindViewHolder(MarqueeView.MarqueeViewHolder marqueeViewHolder ,int position);

    int getItemViewType(int position);

    int getItemCount();



}
