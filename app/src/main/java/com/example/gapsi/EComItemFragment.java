package com.example.gapsi;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.gapsi.databinding.FragmentItemListBinding;
import com.example.gapsi.placeholder.PlaceholderContent;

/**
 * A fragment representing a list of Items.
 */
public class EComItemFragment extends Fragment implements SearchView.OnQueryTextListener {
    private ApiRepository _repository = new ApiRepository();

    private String query = "";
    private FragmentItemListBinding binding;
    private MyEComItemRecyclerViewAdapter adapter;
    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public EComItemFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static EComItemFragment newInstance(int columnCount) {
        EComItemFragment fragment = new EComItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentItemListBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Set the adapter
        if (binding.list instanceof RecyclerView) {
            Context context = binding.list.getContext();
            RecyclerView recyclerView = binding.list;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            adapter = new MyEComItemRecyclerViewAdapter(PlaceholderContent.ITEMS);

            recyclerView.setAdapter(adapter);
        }

        //binding.searchView.getSuggestionsAdapter()

        binding.searchView.setOnQueryTextListener(this);


    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d("EComItemFragment", "onQueryTextSubmit" + query);
        this.query = query;
        adapter.filter(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.d("EComItemFragment", "onQueryTextChange" + newText);
        if(this.query.length() > newText.length()){
            this.query = newText;
            adapter.filter(newText);
        }
        return false;
    }
}