package com.example.abhinav.projectquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class information extends AppCompatActivity {
    TextView info10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        info10=(TextView)findViewById(R.id.info10);
        info10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(information.this,Question.class);
                startActivity(intent);
            }
        });

    }
}
