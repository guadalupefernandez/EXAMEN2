package mx.edu.tesoem.itics.guadalupe.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resta extends AppCompatActivity {
    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        num1 = (EditText) findViewById(R.id.editText3);
        num2 = (EditText) findViewById(R.id.editText4);
        resultado = (TextView) findViewById(R.id.lblresultado2);
    }
    public void calculasuma(View v){
        int a,b,r;
        a=Integer.parseInt(num1.getText().toString());
        b=Integer.parseInt(num2.getText().toString());
        r=a-b;
        resultado.setText(String.valueOf(r));
    }
}
