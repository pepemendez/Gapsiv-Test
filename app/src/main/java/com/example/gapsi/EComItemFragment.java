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

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.gapsi.databinding.FragmentItemListBinding;
import com.example.gapsi.eComItemJavaquicktype.ECOMItem;
import com.example.gapsi.eComItemJavaquicktype.ItemElement;
import com.example.gapsi.eComItemJavaquicktype.ItemStackElement;
import com.example.gapsi.repository.eCommerceComponent;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class EComItemFragment extends Fragment implements SearchView.OnQueryTextListener {
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

            adapter = new MyEComItemRecyclerViewAdapter();

            recyclerView.setAdapter(adapter);
        }

        binding.searchView.setOnClickListener(v -> {});

        //binding.searchView.getSuggestionsAdapter()

        binding.searchView.setOnQueryTextListener(this);

        binding.progressbar.setVisibility(View.GONE);

    }

    public void searchItems(String query){

        binding.progressbar.setVisibility(View.VISIBLE);
        eCommerceComponent.getData(getContext(), query, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                binding.progressbar.setVisibility(View.GONE);

                Log.d("EComItemFragment", "onResponse" + response);

                ObjectMapper mapper = new ObjectMapper();
                try {
                    ECOMItem obj = mapper.readValue(response.toString(), ECOMItem.class);
                     List<ItemStackElement> elements = Arrays.asList(obj.getItem()
                            .getProps()
                            .getPageProps()
                            .getInitialData()
                            .getSearchResult()
                            .getItemStacks());

                    for(ItemStackElement element:elements) {
                        List<ItemElement> items = Arrays.asList(element.getItems());
                        adapter.setResults(items);
                        for(ItemElement item: element.getItems()){
                            Log.d("EComItemFragment", "onResponse Item " + item.getName() + ", description: " + item.getDescription());
                        }
                    }
                    Log.d("EComItemFragment", "onResponse " + elements);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                binding.progressbar.setVisibility(View.GONE);

                ItemElement errorItem = new ItemElement();
                errorItem.setName("No results for");
                errorItem.setDescription(query);
                List<ItemElement> items = Arrays.asList(new ItemElement[]{errorItem});
                adapter.setResults(items);

                Log.d("EComItemFragment", "error " + error.getMessage());
            }
        });
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d("EComItemFragment", "onQueryTextSubmit" + query);
        this.query = query;
        adapter.filter(query);

        searchItems(query);
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