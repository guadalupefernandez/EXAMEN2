package mx.edu.tesoem.itics.guadalupe.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class potencia extends AppCompatActivity {
    EditText num1, num2;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);
        num1= (EditText) findViewById(R.id.editText5);
        num2= (EditText) findViewById(R.id.editText6);
        resultado = (TextView) findViewById(R.id.lblresultado3);
    }
    public void calculasuma(View v){
        int a,b,r;
        a=Integer.parseInt(num1.getText().toString());
        r=a*a;
        resultado.setText(String.valueOf(r));
    }
}
