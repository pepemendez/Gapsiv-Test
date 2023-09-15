package com.example.gapsi;

import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gapsi.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.gapsi.databinding.FragmentItemBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyEComItemRecyclerViewAdapter extends RecyclerView.Adapter<MyEComItemRecyclerViewAdapter.ViewHolder> {

    private final List<PlaceholderItem> mValues;

    private final List<PlaceholderItem> mAllValues;

    public MyEComItemRecyclerViewAdapter(List<PlaceholderItem> items) {
        mAllValues = new ArrayList<>();
        mAllValues.addAll(items);
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mContentView.setText(mValues.get(position).content);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mContentView;
        public PlaceholderItem mItem;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }

    // filter name in Search Bar
    public void filter(String characterText) {
        Log.d("PlaceholderItem filter", characterText);

        characterText = characterText.toLowerCase(Locale.getDefault());
            mValues.clear();
        if (characterText.length() == 0) {
            mValues.addAll(mAllValues);
        } else {
            mValues.clear();
            for (PlaceholderItem item: mAllValues) {
                //Log.d("PlaceholderItem", ""+ item.content + " " + item.details);
                if ( item.content.toLowerCase(Locale.getDefault()).contains(characterText)) {
                    mValues.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }
}