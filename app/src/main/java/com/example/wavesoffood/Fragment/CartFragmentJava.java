package com.example.wavesoffood.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.wavesoffood.R;
import com.example.wavesoffood.adapter.CartAdapter;
import com.example.wavesoffood.databinding.FragmentCartBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CartFragmentJava extends Fragment {
    private FragmentCartBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCartBinding.inflate(inflater, container, false);

        List<String> cartFoodNames = Arrays.asList("Burger", "Sandwich", "Momo", "Item", "Sandwich", "Momo");
        List<String> cartItemPrices = Arrays.asList("$5", "$6", "$8", "$9", "$10", "$10");
        List<Integer> cartImages = Arrays.asList(
                R.drawable.menu1,
                R.drawable.menu2,
                R.drawable.menu3,
                R.drawable.menu4,
                R.drawable.menu5,
                R.drawable.menu6
        );

        CartAdapter adapter = new CartAdapter(new ArrayList<>(cartFoodNames), new ArrayList<>(cartItemPrices), new ArrayList<>(cartImages));
        binding.cartRecycleView.setLayoutManager(new LinearLayoutManager(requireContext()));
        binding.cartRecycleView.setAdapter(adapter);

        return binding.getRoot();
    }
}
