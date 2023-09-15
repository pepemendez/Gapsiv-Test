package com.example.gapsi;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.android.volley.VolleyError;
import com.example.gapsi.databinding.FragmentItemListBinding;
import com.example.gapsi.eComItemJavaquicktype.ECOMItem;
import com.example.gapsi.eComItemJavaquicktype.ItemElement;
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
    private String query;

    private FragmentItemListBinding binding;
    private MyEComItemRecyclerViewAdapter adapter;
    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    private int page = 1;

    private Boolean isLoading = false;

    private Boolean isLastPage = false;

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

            adapter = new MyEComItemRecyclerViewAdapter(context);

            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adapter);

            recyclerView.addOnScrollListener(new PaginationScrollListener(linearLayoutManager) {
                @Override
                protected void loadMoreItems() {
                    isLoading = true;
                    page += 1;
                    loadNextPage();
                }

                @Override
                public boolean isLastPage() {
                    return isLastPage;
                }

                @Override
                public boolean isLoading() {
                    return isLoading;
                }
            });
        }

        binding.searchView.setOnQueryTextListener(this);

        binding.progressbar.setVisibility(View.GONE);

        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        binding.searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
        binding.searchView.setIconifiedByDefault(false); // Do not iconify the widget; expand it by default
    }

    public void loadNextPage() {
        binding.progressbar.setVisibility(View.VISIBLE);
        eCommerceComponent.getData(getContext(), query, page, this::onResponse, this::onErrorResponse);
    }

    public void searchItems(String query, int page){
        binding.progressbar.setVisibility(View.VISIBLE);
        eCommerceComponent.getData(getContext(), query, page, this::onResponse, this::onErrorResponse);
    }

    public void onResponse(JSONObject response) {
        binding.progressbar.setVisibility(View.GONE);
        isLoading = false;

        ObjectMapper mapper = new ObjectMapper();
        try {
            ECOMItem obj = mapper.readValue(response.toString(), ECOMItem.class);
            List<ItemElement> elements = obj.getItemList();
            adapter.setResults(elements);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onErrorResponse(VolleyError error) {
        binding.progressbar.setVisibility(View.GONE);
        isLoading = false;

        ItemElement errorItem = new ItemElement();
        errorItem.setName("No results for " + query);
        List<ItemElement> items = Arrays.asList(new ItemElement[]{errorItem});
        adapter.setResults(items);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        this.query = query;
        adapter.clear();
        page = 1;
        searchItems(query, page);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}