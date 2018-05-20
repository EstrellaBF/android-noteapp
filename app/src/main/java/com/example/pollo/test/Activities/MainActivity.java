package com.example.pollo.test.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pollo.test.R;

public class MainActivity extends AppCompatActivity {
    //Llamando a cada clase por un nombre
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Estableciendo la clase con el ID
        textView = (TextView) findViewById(R.id.texto);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Se cambiará este texto");
            }
        });
    }
}
