package com.example.abhinav.projectquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

    public class Main2Activity extends AppCompatActivity {
    Button next;
    EditText name_et,mob_editText_view;
    TextView name_tv,mob_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name_et=(EditText)findViewById(R.id.name_editText_view);
        mob_editText_view=(EditText)findViewById(R.id.mob_editText_view);
        name_tv=(TextView)findViewById(R.id.name_text_view);
        mob_text_view=(TextView)findViewById(R.id.mob_text_view);
        next=(Button)findViewById(R.id.next_button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = name_et.getText().toString();
                String s2 = mob_editText_view.getText().toString();
                if (s1.equals("")) {
                    Toast.makeText(Main2Activity.this, "Please enter Your Name", Toast.LENGTH_SHORT).show();

                } else if (s2.equals(""))
                {
                    Toast.makeText(Main2Activity.this, "Please enter Mobile Number", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(Main2Activity.this, "", Toast.LENGTH_SHORT).show();
                   Intent j=new Intent(Main2Activity.this,information.class);
                   startActivity(j);
                }
            }


        });

    }
}
