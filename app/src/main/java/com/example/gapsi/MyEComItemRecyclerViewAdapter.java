package com.example.gapsi;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.gapsi.eComItemJavaquicktype.ItemElement;
import com.example.gapsi.databinding.FragmentItemBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyEComItemRecyclerViewAdapter extends RecyclerView.Adapter<MyEComItemRecyclerViewAdapter.ViewHolder> {

    Context context;

    private final List<ItemElement> mValues;

    private final List<ItemElement> mAllValues;

    public MyEComItemRecyclerViewAdapter(Context context) {
        this.context = context;
        this.mAllValues = new ArrayList<>();
        this.mValues = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Long price = mValues.get(position).getPrice();
        holder.mItem = mValues.get(position);
        holder.mContentView.setText(mValues.get(position).getName() + (price != null ? ("\nPrice: " + price) : ""));
        Glide.with(this.context)
                .load(mValues.get(position).getImage())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.getImage());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mContentView;
        public final ImageView mImageView;
        public ItemElement mItem;

        public ImageView getImage(){ return this.mImageView;}

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mContentView = binding.content;
            mImageView = binding.img;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }

    public void clear(){
        mValues.clear();
        notifyDataSetChanged();
    }
    public void setResults(List<ItemElement> items){
        mValues.addAll(items);
        notifyDataSetChanged();
    }
}