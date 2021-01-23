package com.arztemis.online_grocery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arztemis.online_grocery.R;
import com.arztemis.online_grocery.adapter.CategoryAdapter;
import com.arztemis.online_grocery.model.Category;

import java.util.ArrayList;
import java.util.List;

public class AllCategory extends AppCompatActivity implements View.OnClickListener {

    private static final int NUM_COL = 3;
    private RecyclerView rcSeemore;
    private ImageView ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);
        initView();
    }

    private void initView() {
        rcSeemore = findViewById(R.id.rc_seemore);

        List<Category> list = new ArrayList<>();
        list.add(new Category(1, R.drawable.ic_cookies));
        list.add(new Category(2, R.drawable.ic_dairy));
        list.add(new Category(3, R.drawable.ic_desert));
        list.add(new Category(4, R.drawable.ic_egg));
        list.add(new Category(5, R.drawable.ic_drink));
        list.add(new Category(6, R.drawable.ic_juce));
        list.add(new Category(7, R.drawable.ic_salad));
        list.add(new Category(8, R.drawable.ic_spices));

        rcSeemore.setLayoutManager(new GridLayoutManager(AllCategory.this, NUM_COL));
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(AllCategory.this, R.dimen.item_offset);
        rcSeemore.addItemDecoration(itemDecoration);
        rcSeemore.setAdapter(new CategoryAdapter(list));

        ivBack = findViewById(R.id.iv_back);
        ivBack.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(AllCategory.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}