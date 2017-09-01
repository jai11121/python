package hello.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class scondactivity extends AppCompatActivity {
Button bt;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scondactivity);
        bt=(Button)findViewById(R.id.button);
        et=(EditText)findViewById(R.id.et);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=et.getText().toString();
                Intent i1=new Intent();
                i1.putExtra("MESSAGE",message);
                setResult(RESULT_OK,i1);
                finish();

            }
        });


    }
}
