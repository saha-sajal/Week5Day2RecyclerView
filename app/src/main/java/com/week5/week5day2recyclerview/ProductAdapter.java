package com.week5.week5day2recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private Product[] products;
    public ProductAdapter(Product[] products)
    {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listitem = layoutInflater.inflate(R.layout.list_item_layout, parent, false);
        ProductViewHolder productViewHolder = new ProductViewHolder(listitem);

        return productViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {

        Product product = products[position];
        holder.textView.setText(product.getProductName());
        holder.imageView.setImageResource(product.getProductImgId());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Clicked--"+product.getProductName(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return products.length;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;
        public TextView  textView;
        public LinearLayout linearLayout;


        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            this.imageView = itemView.findViewById(R.id.imageViewProduct);
            this.textView = itemView.findViewById(R.id.textViewProductName);
            this.linearLayout = itemView.findViewById(R.id.layout);
        }
    }
}
