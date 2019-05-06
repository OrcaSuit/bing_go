package com.example.bing_go;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button[] mBtnArray = new Button[5];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i = 0; i < 5; i++)
        {
            mBtnArray[i] = (Button)findViewById(R.id.button1+i);
            mBtnArray[i].setOnClickListener(this);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public void onClick(View v){
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }


}
//https://appcafe.tistory.com/34






