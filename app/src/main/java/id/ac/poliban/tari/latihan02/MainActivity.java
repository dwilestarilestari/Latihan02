package id.ac.poliban.tari.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btReal_Madrid = findViewById(R.id.btReal_Madrid);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        Button btLeicester = findViewById(R.id.btLeicester);

        btReal_Madrid.setOnClickListener(view ->{
            Toast.makeText(this, "Ente Musuh Ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Guweh Barselona Fans Club", Toast.LENGTH_SHORT).show();
        });

        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "I'm Barcelona", Toast.LENGTH_SHORT).show());
        btLeicester.setOnClickListener(v -> Toast.makeText(this, "I'm leicester", Toast.LENGTH_SHORT).show());
        btFiorentina.setOnClickListener(v -> Toast.makeText(this, "I'm Fiorentina", Toast.LENGTH_SHORT).show());
    }
}
