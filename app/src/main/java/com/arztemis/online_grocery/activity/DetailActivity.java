package com.arztemis.online_grocery.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.arztemis.online_grocery.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img, imgBack;
    private int image;
    private String name, desc, price, qty, unit;
    private TextView proName, proDesc, proPrice, proQty, proUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initView();
    }

    private void initView() {
        Intent i = getIntent();
        name = i.getStringExtra("name");
        desc = i.getStringExtra("des");
        price = i.getStringExtra("price");
        qty = i.getStringExtra("qty");
        unit = i.getStringExtra("unit");
        image = i.getIntExtra("image", R.drawable.b1);

        img = findViewById(R.id.iv_productdetail);
        imgBack = findViewById(R.id.iv_back2);
        imgBack.setOnClickListener(this);

        proName = findViewById(R.id.tv_proname);
        proDesc = findViewById(R.id.tv_prodes);
        proPrice = findViewById(R.id.tv_proprice);
        proQty = findViewById(R.id.tv_proqty);
        proUnit = findViewById(R.id.tv_prounit);

        proName.setText(name);
        proDesc.setText(desc);
        proPrice.setText(price);
        proQty.setText(qty);
        proUnit.setText(unit);

        img.setImageResource(image);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(DetailActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}