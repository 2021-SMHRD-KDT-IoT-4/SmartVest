package com.example.smartvest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import static android.content.ContentValues.TAG;

public class InfoWriteActivity extends AppCompatActivity {

    EditText et_infoTitle, et_infoWrite;
    Button btn_infoOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_write);

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        et_infoTitle = findViewById(R.id.et_infoTitle);
        et_infoWrite = findViewById(R.id.et_infoWrite);
        btn_infoOk = findViewById(R.id.btn_infoOk);


        String title = et_infoTitle.getText().toString();
        String write = et_infoTitle.getText().toString();
//        String time = new Date(timeStamp).toDateString();

        Map<String, Object> info = new HashMap<>();
//        info.put("날짜", date);
        info.put("내용", write);
        info.put("제목", title);

        btn_infoOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InfoWriteActivity.this, "등록 성공", Toast.LENGTH_SHORT).show();
            }
        });
    }
}