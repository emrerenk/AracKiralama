package com.example.arackiralama;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton resimbuton1,resimbuton2,resimbuton3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resimbuton1=findViewById(R.id.imageButton);
        resimbuton2=findViewById(R.id.imageButton2);
        resimbuton3=findViewById(R.id.imageButton3);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void onMovement(View view)
    {
        Intent intent=new Intent(MainActivity.this,MovementActivity.class);
        startActivity(intent);
    }

    public void onAccount(View view)
    {
        Intent intent=new Intent(MainActivity.this,AccountActivity.class);
        startActivity(intent);
    }
}