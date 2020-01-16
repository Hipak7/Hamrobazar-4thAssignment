package com.hipakh.hamrobazar.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hipakh.hamrobazar.Model.Products;
import com.hipakh.hamrobazar.R;
import com.hipakh.hamrobazar.URL.Url;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    Context context;
    List<Products> productViewList;

    public ProductAdapter(Context context, List<Products> productViewList) {
        this.context = context;
        this.productViewList = productViewList;
    }



    }

    @Override
    public int getItemCount() {
        return productViewList.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvPrice,tvType;
        ImageView imgProfile;
        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvProductName);
            tvPrice=itemView.findViewById(R.id.tvProductPrice);
            tvType=itemView.findViewById(R.id.tvProductType);
            imgProfile=itemView.findViewById(R.id.imgProfileImg);
        }
    }

}
