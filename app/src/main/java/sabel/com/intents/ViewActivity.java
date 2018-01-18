package sabel.com.intents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends Activity {

    private TextView tvName;
    private Button btnZurueck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        CreateObjects();
        CreateListener();

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        tvName.setText(name);

    }


    private void CreateListener() {

        btnZurueck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void CreateObjects() {
        tvName = findViewById(R.id.tvName);
        btnZurueck = findViewById(R.id.btnZurueck);

    }
}
