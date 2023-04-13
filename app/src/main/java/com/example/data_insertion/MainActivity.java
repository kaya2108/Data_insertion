package com.example.data_insertion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EditText Ename,EregNo,Ephone,Eyear,Ebranch,Esize,EamtPaid;
    private Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ename= findViewById(R.id.name);
        EregNo=findViewById(R.id.regNo);
        Ephone=findViewById(R.id.phone);
        Eyear=findViewById(R.id.year);
        Ebranch=findViewById(R.id.branch);
        Esize=findViewById(R.id.size);
        EamtPaid=findViewById(R.id.amtPaid);
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                postData(Ename.getText().toString(),
                        EregNo.getText().toString(),
                        Ephone.getText().toString(),
                        Eyear.getText().toString(),
                        Ebranch.getText().toString(),
                        Esize.getText().toString(),
                        EamtPaid.getText().toString());
            }
        });

    }

    private void postData(String name, String regNo, String phone, String year, String branch, String size, String amtPaid) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://script.google.com/macros/s/AKfycbx6o3vKtKolYv7S5lScWMSIMwLMr2eJ_6bPh0b9E_Vn8NBLy_5LYFsiMwwzIUfimgy2cA/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        EntryAPI entryAPI=retrofit.create(EntryAPI.class);
        Call<Model> call=entryAPI.createPost("add",name,regNo,phone,year,branch,size,amtPaid);
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                System.out.println(response);
                Toast.makeText(MainActivity.this, "Data added", Toast.LENGTH_SHORT).show();
                Ename.setText("");
                EregNo.setText("");
                Ephone.setText("");
                Eyear.setText("");
                Ebranch.setText("");
                Esize.setText("");
                EamtPaid.setText("");

            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}