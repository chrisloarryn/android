package cl.inacap.app3_13102018;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText txtX, txtY;
    private Button btnS,btnR,btnM,btnD;
    private TextView resultado;
    private int l=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar los objetos que se requieren obtener desde el layout

        txtX = (EditText) findViewById(R.id.txtX);
        txtY = (EditText) findViewById(R.id.txtY);
        btnS = (Button) findViewById(R.id.btnS);
        btnR = (Button) findViewById(R.id.btnR);
        btnM = (Button) findViewById(R.id.btnM);
        btnD = (Button) findViewById(R.id.btnD);
        resultado = (TextView) findViewById(R.id.resultado);

        public void sumar(View v){


            String t1 = txtX.getText().toString(); // Obtener el valor desde
            String t2 = txtY.getText().toString();

            if(t1.trim().length() == l || t2.trim().length() == l){
                Toast.makeText(MainActivity.this, "Debe Ingresar Los Valores", Toast.LENGTH_LONG).show();
                txtX.requestFocus();
            }else{
                int x, y, z;

                try {
                    x = Integer.parseInt(t1);
                }catch (Exception e){
                    x = 0;
                }  // cierre de catch (Exception e){}  // de la X
                try {
                    y = Integer.parseInt(t2);
                }catch (Exception e){
                    y = 0;
                }  // cierre de catch (Exception e){}  // de la Y

                z = x + y;
                resultado.setText(Integer.toString(z));
                txtX.setText("");
                txtY.setText("");

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle("Ok");
                msg.setMessage("Calculado Satisfactoriamente");
                msg.setCancelable(true);
                msg.setIcon(R.drawable.ico1);
                msg.show();

            }// cierra else {}
        }// Cierra clase sumar

        public void restar(View v){

        }
        public void multiplicar(View v){

        }
        public void dividir(View v){

        }


    }
}
