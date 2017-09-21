package com.example.vasu.vaisnavasongs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting action bar title
        getSupportActionBar().setTitle("Home");
        // linking the list view to its id
        listView = (ListView)findViewById(R.id.homeListView);
        populateListItems();
        eachItemClicked();
    }
    private void populateListItems(){

        String searchfactor[] = {"Authors", "Manglacharan", "Morning Program"};
        // Build adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this                            //context for the activity
                ,R.layout.authors_name_layout   //layout to be used
                ,searchfactor                          // items to be displayed
        );

        // configure the list view

        listView.setAdapter(arrayAdapter);
    }

    private void eachItemClicked(){
        //on each item pressed ..
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textView = (TextView) viewClicked; // fetching the result in a textView nad linking it to View
                String message = textView.getText().toString(); // text fetched in a astring
                //starting a new intent to next activity
                Intent intent = new Intent(MainActivity.this, commonTextViewActivity.class);
                intent.putExtra("value",message);
                startActivity(intent);
            }
        });
    }
}
