package np.com.shah.nishant.tipwise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void calculate(View v){
        EditText text = (EditText)findViewById(R.id.amount);
        String sr = text.getText().toString();
        int srr = Integer.valueOf(sr);

        TextView show = (TextView) findViewById(R.id.showbill);
        srr= srr*2;
        show.setText(String.valueOf(srr));

        }









}
