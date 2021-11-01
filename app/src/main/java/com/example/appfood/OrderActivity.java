package com.example.appfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.appfood.Adapters.OrdersAdapter;
import com.example.appfood.Models.OrdersModel;
import com.example.appfood.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {

    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<OrdersModel> list = new ArrayList<>();
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));
        list.add(new OrdersModel(R.drawable.banhcanh,"Bánh canh","150", "10"));


        OrdersAdapter adapter = new OrdersAdapter(list, this);
        binding.orderRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderRecyclerView.setLayoutManager(layoutManager);
    }
}