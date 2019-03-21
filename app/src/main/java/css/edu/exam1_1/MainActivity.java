package css.edu.exam1_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button bPushMe;
    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting the id to specific names
        etName = (EditText) findViewById(R.id.editTextName);
        bPushMe = (Button) findViewById(R.id.buttonPushMe);
        tvName = (TextView) findViewById(R.id.textViewName);


    }
    public void buttonClickPushMe(View view){
        //gets the etName content and stores in a string then prints it out.
        String result = etName.getText().toString();
        tvName.setText(result + " is a great android programmer!");
    }
}
