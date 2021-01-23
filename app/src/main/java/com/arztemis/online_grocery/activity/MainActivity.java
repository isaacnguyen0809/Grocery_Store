package com.arztemis.online_grocery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.adapter.DiscountedProductAdapter;
import com.arztemis.online_grocery.adapter.GroceryAdapter;
import com.arztemis.online_grocery.model.DiscountedProducts;
import com.arztemis.online_grocery.model.Grocery;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rcDiscount, rcGrocery;
    private TextView tvSeemore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        tvSeemore = findViewById(R.id.tv_seemore);
        tvSeemore.setOnClickListener(this);

        rcDiscount = findViewById(R.id.rc_discount);


        List<DiscountedProducts> list = new ArrayList<>();
        list.add(new DiscountedProducts(1, R.drawable.discountberry));
        list.add(new DiscountedProducts(2, R.drawable.discountbrocoli));
        list.add(new DiscountedProducts(3, R.drawable.discountmeat));
        list.add(new DiscountedProducts(4, R.drawable.discountberry));
        list.add(new DiscountedProducts(5, R.drawable.discountbrocoli));
        list.add(new DiscountedProducts(6, R.drawable.discountmeat));

        rcDiscount.setLayoutManager(new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false));
        rcDiscount.setAdapter(new DiscountedProductAdapter(list));


        rcGrocery = findViewById(R.id.rc_grocery);

        List<Grocery> groceryList = new ArrayList<>();
        groceryList.add(new Grocery(1, R.drawable.ic_home_meats));
        groceryList.add(new Grocery(2, R.drawable.ic_home_fruits));
        groceryList.add(new Grocery(3, R.drawable.ic_home_veggies));
        groceryList.add(new Grocery(4, R.drawable.ic_home_fish));
        groceryList.add(new Grocery(5, R.drawable.ic_home_meats));
        groceryList.add(new Grocery(6, R.drawable.ic_home_fruits));
        groceryList.add(new Grocery(7, R.drawable.ic_home_veggies));
        groceryList.add(new Grocery(8, R.drawable.ic_home_fish));

        rcGrocery.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,
                false));
        rcGrocery.setAdapter(new GroceryAdapter(groceryList));

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_seemore) {
            Intent intent = new Intent(MainActivity.this, AllCategory.class);
            startActivity(intent);
        }
    }
}