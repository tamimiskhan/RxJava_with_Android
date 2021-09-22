package com.tamim.rxjavawithandroid;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StockUpdateViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.stock_item_symbol)
    TextView stockSymbol;
    public StockUpdateViewHolder(View v) {
        super(v);
        ButterKnife.bind(this, v);
    }
}