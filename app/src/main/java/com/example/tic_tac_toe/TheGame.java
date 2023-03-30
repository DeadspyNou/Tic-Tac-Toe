package com.example.tic_tac_toe;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class TheGame extends AppCompatActivity {
    TextView GinfoNow;
    @Override
    public  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GinfoNow = findViewById(R.id.vs);
        Intent intent = getIntent();
        String Player01 = intent.getStringExtra("NP1");
        String Player02 = intent.getStringExtra("NP2");
        String GinfoIt= (Player01+" VS "+Player02);
        GinfoNow.setText(GinfoIt);

//        Button B1 = findViewById(R.id.XOB1);
//        Button B2 = findViewById(R.id.XOB2);
//        Button B3 = findViewById(R.id.XOB3);
//        Button B4 = findViewById(R.id.XOB4);
//        Button B5 = findViewById(R.id.XOB5);
//        Button B6 = findViewById(R.id.XOB6);
//        Button B7 = findViewById(R.id.XOB7);
//        Button B8 = findViewById(R.id.XOB8);
//        Button B9 = findViewById(R.id.XOB9);
//        B1.setOnClickListener(this);
//        B2.setOnClickListener(this);
//        B3.setOnClickListener(this);
//        B4.setOnClickListener(this);
//        B5.setOnClickListener(this);
//        B6.setOnClickListener(this);
//        B7.setOnClickListener(this);
//        B8.setOnClickListener(this);
//        B9.setOnClickListener(this);
//    }
//    @Override
//    public void onClick(View Bid) {
//        switch (Bid.getId()) {
//            case R.id.XOB1:
//                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB2:
//                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB3:
//                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB4:
//                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB5:
//                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB6:
//                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB7:
//                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB8:
//                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.XOB9:
//                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
//                break;
//        }
    }
}
