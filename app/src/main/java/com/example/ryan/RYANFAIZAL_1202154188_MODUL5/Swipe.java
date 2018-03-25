package com.example.ryan.RYANFAIZAL_1202154188_MODUL5;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by ryan on 25/03/18.
 */

public class Swipe extends ItemTouchHelper.SimpleCallback {
    RecyclerAdapter adapter;

    public Swipe(int dragDirs, int swipeDirs){
        super(dragDirs, swipeDirs);
    }

    public Swipe(RecyclerAdapter adapter){
        super(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.LEFT);
        this.adapter = adapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        adapter.dismissData(viewHolder.getAdapterPosition());
    }
}
