package pt.pedrorocha.android.clickcounter;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnReset = findViewById(R.id.btnReset);
        TextView textView = findViewById(R.id.editTextText);

        btnAdd.setOnClickListener(v -> {
            counter++;
            Log.d("TAG", "onCreate: Add button set listener");
            displayValue(textView, counter);
        });

        btnReset.setOnClickListener(v->{
            counter = 0;
            displayValue(textView, counter);
        });
    }

    private void displayValue(TextView textView, Integer counter){
        textView.setText(String.valueOf(counter));
    }
}