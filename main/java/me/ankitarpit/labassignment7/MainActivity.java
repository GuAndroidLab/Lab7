package me.ankitarpit.labassignment7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    public void register(View view){
        EditText name = (EditText) findViewById(R.id.name);
        EditText enrollment = (EditText) findViewById(R.id.enrollemnt);
        EditText cource = (EditText) findViewById(R.id.cource);
        EditText college = (EditText) findViewById(R.id.college);
        EditText email = (EditText) findViewById(R.id.email);
        Button register = (Button) findViewById(R.id.register);

        TextView op = (TextView)findViewById(R.id.output);
        op.setText(name.getText()+" \n"+enrollment.getText()+" \n" +cource.getText()+"\n"+college.getText()+"\n"+email.getText());

    }




}
