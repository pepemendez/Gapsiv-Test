package com.example.gapsi;

import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gapsi.eComItemJavaquicktype.ItemElement;
import com.example.gapsi.databinding.FragmentItemBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyEComItemRecyclerViewAdapter extends RecyclerView.Adapter<MyEComItemRecyclerViewAdapter.ViewHolder> {

    private final List<ItemElement> mValues;

    private final List<ItemElement> mAllValues;

    public MyEComItemRecyclerViewAdapter() {
        mAllValues = new ArrayList<>();
        mValues = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mContentView.setText(mValues.get(position).getName() + "\n" + mValues.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mContentView;
        public ItemElement mItem;

        public ViewHolder(FragmentItemBinding binding) {
            super(binding.getRoot());
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }

    public void clear(){ mValues.clear(); }
    public void setResults(List<ItemElement> items){
        mValues.addAll(items);
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
            for (ItemElement item: mAllValues) {
                //Log.d("PlaceholderItem", ""+ item.content + " " + item.details);
                if ( item.getName().toLowerCase(Locale.getDefault()).contains(characterText)) {
                    mValues.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }
}