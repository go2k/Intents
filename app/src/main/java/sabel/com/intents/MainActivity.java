package sabel.com.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


//  http://www.vogella.com/tutorials/AndroidIntent/article.html

public class MainActivity extends Activity {

    private Button btnSenden;
    private Button btnWWW;
    private EditText etName;
    private EditText etURL;
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateObjects();
        CreateListener();
    }

    private void CreateObjects() {
        btnSenden = findViewById(R.id.btnSenden);
        etName = findViewById(R.id.etName);

        btnWWW = findViewById(R.id.btnWWW);
        etURL = findViewById(R.id.etUrl);


    }

    private void senden() {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("Name", etName.getText().toString());

        startActivity(intent);
    }

    private void CreateListener() {

        btnSenden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, etName.getText().toString());
                senden();
            }
        });

        btnWWW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suchen();
            }
        });
    }

    private void suchen() {

        String url = "https://www.google.de/search?q=" + etURL.getText().toString();
        Intent intent = new Intent();
        intent.setData(Uri.parse(url));
        startActivity(intent);

        //Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.de/search?q=" + etURL.getText().toString()));
        //startActivity(i);

    }
}
