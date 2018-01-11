package sabel.com.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//  http://www.vogella.com/tutorials/AndroidIntent/article.html

public class MainActivity extends AppCompatActivity {

    private Button btnSenden;
    private TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateObjects();
        CreateListener();
    }

    private void CreateObjects() {
        btnSenden = findViewById(R.id.btnSenden);
        tvName = findViewById(R.id.etName);

    }

    private void tuWas() {
        Intent intent = new Intent(this, ViewActivity.class);
        intent.putExtra("Name", tvName.getText().toString());
        startActivity(intent);
    }

    private void CreateListener() {

        btnSenden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tuWas();
            }
        });

    }
}
