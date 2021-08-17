package com.example.smartvest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class InfoActivity extends AppCompatActivity {

    ListView lv;
    List<InfoVO> data;
    Button btn_write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        lv = findViewById(R.id.lv);
        data = new ArrayList<InfoVO>();
        btn_write = findViewById(R.id.btn_write);

        btn_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfoWriteActivity.class);
                startActivity(intent);
            }
        });
        for (int i = 1; i < 10; i++){
            data.add(new InfoVO("공지사항"+i,
                    "2021-08-0"+i));
        }


        InfoAdapter adapter = new InfoAdapter(getApplicationContext(),
                R.layout.infolist, data);

        lv.setAdapter(adapter);

    }
}