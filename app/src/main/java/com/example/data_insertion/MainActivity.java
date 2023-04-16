package com.example.data_insertion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

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

    private void processData(String name, String regNo, String phone, String year, String branch, int[] count, String amtPaid) {
        Dictionary<Integer, String> dict= new Hashtable<>();
        dict.put(0,"xs");
        dict.put(1,"s");
        dict.put(2,"m");
        dict.put(3,"l");
        dict.put(4,"xl");
        dict.put(5,"xxl");
        dict.put(6,"xxxl");
        for (int i = 0; i < 7; i++) {
            int sum = 0;
            for (int j = 0; j < count.length; j++) {
                sum+=count[j];
                if(sum==0){
                    break;
                }
                else{
                    for(int k=0;k<7;k++){
                        while(count[k]!=0){
                            postData(name,regNo,phone,year,branch,dict.get(k),amtPaid);
                            count[k]--;
                        }
                    }
                }
        }
    }
    }

    private void postData(String name, String regNo, String phone, String year, String branch, String size, String amtPaid) {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://script.google.com/macros/s/AKfycbzxztP6TMrr8Gp6A9Pbsk7bBVAc8HR2LQXUegAI8uuK6J3pGYgWLEn_DBfz-60XVDfj/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        EntryAPI entryAPI=retrofit.create(EntryAPI.class);
        int arr[]={0,1,1,1,2,1,2,2,2,2,0};
        String var= Arrays.toString(arr);
        System.out.println(var);
        Call<List<Model>> call=entryAPI.createPost("add",name,regNo,phone,year,branch,var,amtPaid,"NIL","user123","user123@gmail.com");
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
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
            public void onFailure(Call<List<Model>> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
}