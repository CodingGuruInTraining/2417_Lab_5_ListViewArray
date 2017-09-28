package com.example.hl4350hb.listviewarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to the ListView
        ListView listView = (ListView) findViewById(R.id.simple_list);

        // Create an ArrayList and add some sample data
        ArrayList<String> androidVersions = new ArrayList<String>();
        androidVersions.add("Jellybeans");
        androidVersions.add("Kitkat");
        androidVersions.add("Lollypop");

        // Create an ArrayAdapter.
        // Arguments are Context, a TextView's resource ID, an array of the generic type
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.list_item_text, androidVersions);

        // Set ArrayAdapter to be the ListView's adapter
        listView.setAdapter(arrayAdapter);

        // Add data to the ArrayList
        androidVersions.add("Marshmallow");
        androidVersions.add(0, "Ice cream sandwich");
        // Tell the ArrayAdapter to notify the ListView that the data has changed
        arrayAdapter.notifyDataSetChanged();
    }
}
