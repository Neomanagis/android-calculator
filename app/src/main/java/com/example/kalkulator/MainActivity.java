package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void zmienTekst(View view){
//        EditText editText = (EditText) findViewById(R.id.TextInput1);
//        String message = editText.getText().toString();
//        TextView text = (TextView) findViewById(R.id.textOutput);
//        text.setText(message);
//    }
    public boolean specialSplit(String string){
        return true;
    }

    public void valuedButtons(View view){
        TextView calc = (TextView) findViewById(R.id.calcExit);
        String value = calc.getText().toString();
        if (value.equals("0"))
            value = "";
        switch (view.getId()){
            case (R.id.button0):
                calc.setText(value += "0");
                break;
            case (R.id.button1):
                calc.setText(value += "1");
                break;
            case (R.id.button2):
                calc.setText(value += "2");
                break;
            case (R.id.button3):
                calc.setText(value += "3");
                break;
            case (R.id.button4):
                calc.setText(value += "4");
                break;
            case (R.id.button5):
                calc.setText(value += "5");
                break;
            case (R.id.button6):
                calc.setText(value += "6");
                break;
            case (R.id.button7):
                calc.setText(value += "7");
                break;
            case (R.id.button8):
                calc.setText(value +="8");
                break;
            case (R.id.button9):
                calc.setText(value+="9");
                break;
            case (R.id.clearButton):
                calc.setText("0");
                break;
            case (R.id.dot):
                if (value.endsWith(" ") || value.isEmpty())
                    calc.setText(value+="0,");
                else
                    calc.setText(value+=",");
                break;
            case (R.id.dod):
                if (value.endsWith(",") || value.endsWith(" ") || value.isEmpty())
                    calc.setText(value+="0 + ");
                else
                    calc.setText(value+=" + ");
                break;
        }
    }
}