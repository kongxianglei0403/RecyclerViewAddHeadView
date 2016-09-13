package com.kxl.recyclerviewaddheadview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private HeaderBottomAdapter adapter;
    GridLayoutManager gridLayoutManager;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        //list布局
        layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter=new HeaderBottomAdapter(this);
        mRecyclerView.setAdapter(adapter);
        //grid布局
        /*gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(adapter = new HeaderBottomAdapter(this));
        //如果recyclerview使用grid类型列表，那么需要在设置完adapter后，调用一下方法，根据当前
        //item的类型，来判断占据的横向格数，这也是adapter里面设置isHeaderView和isBottomView的缘故
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return (adapter.isHeaderView(position)) || (adapter.isBottomView(position)) ? gridLayoutManager.getSpanCount() : 1;
            }
        });*/

    }
}
