package com.arztemis.online_grocery.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.adapter.DiscountedProductAdapter;
import com.arztemis.online_grocery.model.DiscountedProducts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DiscountedProductAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rc_discount);

        List<DiscountedProducts> list = new ArrayList<>();
        list.add(new DiscountedProducts(1, R.drawable.discountberry));
        list.add(new DiscountedProducts(2, R.drawable.discountbrocoli));
        list.add(new DiscountedProducts(3, R.drawable.discountmeat));
        list.add(new DiscountedProducts(4, R.drawable.discountberry));
        list.add(new DiscountedProducts(5, R.drawable.discountbrocoli));
        list.add(new DiscountedProducts(6, R.drawable.discountmeat));

        recyclerView.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new DiscountedProductAdapter(list));

    }


}