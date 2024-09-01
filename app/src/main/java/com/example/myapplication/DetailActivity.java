package com.example.firstaid;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView detailTextView = findViewById(R.id.detailTextView);
        TextView topicTitleTextView = findViewById(R.id.topicTitleTextView);

        String topic = getIntent().getStringExtra("TOPIC");

        topicTitleTextView.setText(topic);
        String details = getFirstAidDetails(topic);
        detailTextView.setText(details);
    }

    private String getFirstAidDetails(String topic) {
        switch (topic) {
            case "CPR":
                return "1. Check responsiveness...\n2. Call emergency services...\n3. Start chest compressions...";
            case "Burns":
                return "1. Cool the burn...\n2. Cover the burn...\n3. Protect the burned area...";
            case "Choking":
                return "1. Encourage coughing...\n2. Perform abdominal thrusts...";
            case "Fractures":
                return "1. Immobilize the area...\n2. Apply ice...";
            case "Bleeding":
                return "1. Apply pressure...\n2. Elevate the injury...";
            default:
                return "No details available.";
        }
    }
}
