package com.example.vasu.vaisnavasongs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class commonTextViewActivity extends AppCompatActivity  {

   ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_common);
        //display back arrow in action bar
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // getting the value from mainActivity(authors,manga,morning)
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("value");

        if (value != null) {
            switch(value){
                case "Authors":
                    populateAuthorsListView();
                    break;
                case "Manglacharan":
                    populateManglaListView();
                    break;
                case "Morning Program":
                    populateMorningListView();
                    break;
            }
        }

    }

    private void populateAuthorsListView(){
        // setting title of action bar
        getSupportActionBar().setTitle("Authors");
        //array list creation
        String authorsname[] = {"A.C. Bhaktivedanta Swami Prabhupada","Locana Das Thakura", "Bhaktisiddhanta Saraswti Thakur"
                ,"Kṛṣṇa Dvaipāyana Vyāsa", "Visvanatha Cakravarti Thakura", "Vasudeva Ghosh", "Rupa Goswami", "Krsnadasa Kaviraja Goswami",
                "Jayadeva Goswami", "Jiva Goswami", "Sarvabhauma Bhattacarya", "Vrndavana Das Thakura", "Raghunatha Dasa Goswami",
                "Srinivasa Acarya", "Govinda Das Kaviraja", "Devakinandana Das Thakura", "Adi Sankaracarya", "Bilvamangala Thakura",
                "Others"};
        // Build adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this                            //context for the activity
                ,R.layout.authors_name_layout   //layout to be used
                ,authorsname                          // items to be displayed
        );

        // configure the list view
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);

    }
    private void populateManglaListView(){
        // setting title of action bar
        getSupportActionBar().setTitle("Manglacharan");

        String mangla[] = {"Samsara dava", "rest to add later"};
        // Build adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this                            //context for the activity
                ,R.layout.authors_name_layout   //layout to be used
                ,mangla                          // items to be displayed
        );

        // configure the list view
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
    private void populateMorningListView(){
        // setting title of action bar
        getSupportActionBar().setTitle("Morning Program");

        String moring[] = {"Narsing arti","tulsi arti","sishasktam","darshan arti"};
        // Build adapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this                            //context for the activity
                ,R.layout.authors_name_layout   //layout to be used
                ,moring                          // items to be displayed
        );

        // configure the list view
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
