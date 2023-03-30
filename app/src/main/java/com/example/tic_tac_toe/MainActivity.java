package com.example.tic_tac_toe;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    EditText player1,player2;
    Button Splay;
    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1 = findViewById(R.id.plone);
        player2 = findViewById(R.id.pltwo);
        Splay = findViewById(R.id.Playbtn);
        Splay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String Pl1 = player1.getText().toString();
                String Pl2 = player2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), TheGame.class);
                intent.putExtra("NP1", Pl1);
                intent.putExtra("NP2", Pl2);
                startActivity(intent);
            }
        });

    }
}