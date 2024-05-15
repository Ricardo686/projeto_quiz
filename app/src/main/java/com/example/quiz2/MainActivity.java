package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quiz.R;

public class MainActivity extends AppCompatActivity {

    Button btn_jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnJogar = findViewById(R.id.id.btn_jogar);
        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jogar();
            }
        });
    }

    private void jogar() {

        Toast.makeText(this, "Iniciando o jogo...", Toast.LENGTH_SHORT).show();
    }
}