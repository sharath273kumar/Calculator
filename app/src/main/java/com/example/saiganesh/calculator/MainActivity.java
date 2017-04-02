package com.example.saiganesh.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void onSumClick(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2 =Integer.parseInt(e2.getText().toString());
        double sum=num1+num2;
        t1.setText(Double.toString(sum));
    }
    public void onMultiplyClick(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2 =Integer.parseInt(e2.getText().toString());
        double product=num1*num2;
        t1.setText(Double.toString(product));
    }
    public void onDivideClick(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2 =Integer.parseInt(e2.getText().toString());
        double quotient=num1/num2;
        t1.setText(Double.toString(quotient));
    }
    public void onSubtractClick(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2 =Integer.parseInt(e2.getText().toString());
        double difference=num1-num2;
        t1.setText(Double.toString(difference));
    }
    public void onModClick(View v){
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        TextView t1=(TextView)findViewById(R.id.textView);
        int num1=Integer.parseInt(e1.getText().toString());
        int num2 =Integer.parseInt(e2.getText().toString());
        double reminder=num1%num2;
        t1.setText(Double.toString(reminder));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
