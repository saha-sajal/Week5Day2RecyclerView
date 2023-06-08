package com.week5.week5day2recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Product[] products = new Product[]
                {
                        new Product("Apple", android.R.drawable.ic_dialog_map),
        new Product("Banana", android.R.drawable.ic_dialog_alert),
        new Product("Bun", android.R.drawable.ic_dialog_info)
                };

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ProductAdapter productAdapter = new ProductAdapter(products);
        recyclerView.setAdapter(productAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}