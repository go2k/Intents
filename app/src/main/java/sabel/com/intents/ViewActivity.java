package sabel.com.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    private TextView tvName;
    private Button btnZurueck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        CreateObjects();
        CreateListener();

    }

    private void CreateListener() {

    }

    private void CreateObjects() {
        tvName = findViewById(R.id.etName);
        btnZurueck = findViewById(R.id.btnZurueck);
    }
}
