package com.example.appfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.appfood.Adapters.MainAdapter;
import com.example.appfood.Models.MainModel;
import com.example.appfood.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();
        list.add(new MainModel(R.drawable.banhcanh,"Bánh canh","25000","hành nhiều"));
        list.add(new MainModel(R.drawable.banhmi,"Bánh mì","15000","mì pate"));
        list.add(new MainModel(R.drawable.bunbo,"Bún bò","25000","hành nhiều"));
        list.add(new MainModel(R.drawable.comchien,"Cơm chiên","25000","hành nhiều"));

        MainAdapter adapter=new MainAdapter(list,this);
        binding.recycleview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recycleview.setLayoutManager(layoutManager);
    }
}