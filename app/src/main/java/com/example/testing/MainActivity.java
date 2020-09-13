package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder dialogbuilder;
    AlertDialog dialog;
    EditText popup_name,popup_mobileno,popup_bloodgroup;
    Button savebttn,popupmainbttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        popupmainbttn=findViewById(R.id.button);
        popupmainbttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createnew();
            }
        });

    }
    public void createnew(){
        dialogbuilder=new AlertDialog.Builder(this);
        final View compactpopup=getLayoutInflater().inflate(R.layout.popup,null);
        popup_name=compactpopup.findViewById(R.id.popupname);
        popup_mobileno=compactpopup.findViewById(R.id.popupmobileno);
        popup_bloodgroup=compactpopup.findViewById(R.id.popupbloodgroup);
        savebttn=compactpopup.findViewById(R.id.addbttn);
        dialogbuilder.setView(compactpopup);
        dialog=dialogbuilder.create();
        dialog.show();

        savebttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "saved", Toast.LENGTH_SHORT).show();
            }
        });
    }
}