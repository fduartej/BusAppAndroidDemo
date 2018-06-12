package pe.busapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class TarifaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifa);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText("Conductor: "+message);

        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Ruta: 540: JP-MA");
    }

    public void clickTicket(View view){
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        TextView textView = findViewById(R.id.textView7);
        textView.setText(buttonText);
    }

    public void clickPayment(View view){
        ImageButton b = (ImageButton)view;
        String buttonText = getResources().getResourceName(b.getId());
        TextView textView = findViewById(R.id.textView6);
        if(buttonText.indexOf("Card")>0){
            textView.setText("Tarjeta");
        }else{
            textView.setText("Efectivo");
        }
        try {
            Thread.sleep(200);
            TextView textView1 = findViewById(R.id.textView4);
            textView1.setText("Imprimiendo..");
        }catch (Exception e){
        }

    }

}
