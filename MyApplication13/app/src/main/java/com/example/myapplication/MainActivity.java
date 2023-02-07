package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText brand,model,size,description;
    Button insert;
    NoteDataHolder DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brand=findViewById(R.id.edt1);
        model=findViewById(R.id.edt2);
        size=findViewById(R.id.edt3);
        description=findViewById(R.id.edt4);
        insert =findViewById(R.id.button);


        DB=new NoteDataHolder(this);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NOTEMODEL newnote=new NOTEMODEL(
                        brand.getText().toString(),
                        model.getText().toString(),
                        Integer.parseInt(size.getText().toString()),
                        description.getText().toString()
                );
                MainActivity2.holder.insertNote(newnote);
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

    }
}
