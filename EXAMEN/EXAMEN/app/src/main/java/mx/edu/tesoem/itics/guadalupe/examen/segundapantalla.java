package mx.edu.tesoem.itics.guadalupe.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segundapantalla extends AppCompatActivity {
    TextView bienvenido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundapantalla);
        Bundle parametros = this.getIntent().getExtras();
        bienvenido= (TextView) findViewById(R.id.lbienvenido);
       bienvenido.setText("¡holaBienvenido! " +parametros.getString("Nombre").toString());
    }
}
