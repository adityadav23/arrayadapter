package com.example.customarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
         storng an array to display
         */
        String[] arrlist= new String[20];
        for(int i=0;i<20;i++){
            arrlist[i] = "My list element "+i;
        }

        // Refrencing the list view from activity_main where our list will be displayed


        ListView list = findViewById(R.id.list);

        //Creating an ArrayAdapter object to pass list layout and arraylist

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrlist );

        list.setAdapter(adapter);
    }

}