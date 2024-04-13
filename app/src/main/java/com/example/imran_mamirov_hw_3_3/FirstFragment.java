package com.example.imran_mamirov_hw_3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private RecyclerView rvCar;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCar = requireActivity().findViewById(R.id.rv_cars);
        loadData();
        CarAdapter carAdapter = new CarAdapter(carList);
        rvCar.setAdapter(carAdapter);
    }

    private void loadData() {
        carList.add("Mercedes");
        carList.add("BMW");
        carList.add("Fiat");
        carList.add("Ferrari");
        carList.add("Audi");
        carList.add("Volkswagen");
        carList.add("Dodge");
        carList.add("Porsche");
        carList.add("Toyota");
        carList.add("KIA");
    }
}