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

    //Calculate the tip
    public void calculate(View v){
        //Get and store the value of the bill amount from user
        EditText text = (EditText)findViewById(R.id.billAmount);
        String sr = text.getText().toString();
        double srr = Double.valueOf(sr);

        //Get the value of tip percentage from user
        EditText percent = (EditText)findViewById(R.id.tipPercent);
        int tipP = Double.valueOf(percent.getText().toString());

        //Display the Total Bill to user
        //Int needs to be cast into String because TextView can take String only
        TextView show = (TextView) findViewById(R.id.showbill);
        double totalBill= srr+tipP*srr/100;
        show.setText(String.valueOf(totalBill));

        //Display the Tip Amount to User
        TextView tip = (TextView)findViewById(R.id.tipAmount);
        double tAmount = srr*tipP/100;
        tip.setText(String.valueOf(tAmount));

        }









}
