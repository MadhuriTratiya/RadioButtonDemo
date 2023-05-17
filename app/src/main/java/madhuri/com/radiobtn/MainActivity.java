package madhuri.com.radiobtn;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup gender;
    RadioButton radioButton;
    TextView data;
    Button apply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = findViewById(R.id.gender);
        data = findViewById(R.id.dmale);
        apply = findViewById(R.id.button);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = gender.getCheckedRadioButtonId();
                radioButton = findViewById(id);
                data.setText(radioButton.getText().toString());
            }
        });

    }

}