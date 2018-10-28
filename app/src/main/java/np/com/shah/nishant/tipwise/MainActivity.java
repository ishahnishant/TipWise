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
        EditText text = (EditText)findViewById(R.id.billAmount);
        String sr = text.getText().toString();
        int srr = Integer.valueOf(sr);

        EditText percent = (EditText)findViewById(R.id.tipPercent);
        int tipP = Integer.valueOf(percent.getText().toString());

        TextView show = (TextView) findViewById(R.id.showbill);
        int totalbill= srr+tipP*srr/100;
        show.setText(String.valueOf(totalbill));

        TextView tip = (TextView)findViewById(R.id.tipAmount);
        int tamount = srr*tipP/100;
        tip.setText(String.valueOf(tamount));

        }









}
