package br.com.senac.mybike;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MenuPrincipalActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardClientes, cardReservation, cardMaintance,
            cardSales, cardAccessories, cardCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        cardClientes = findViewById(R.id.cardClient);
        cardReservation = findViewById(R.id.cardReservation);
        cardMaintance = findViewById(R.id.cardManutencao);
        cardSales = findViewById(R.id.cardSales);
        cardAccessories = findViewById(R.id.cardacessorio);
        cardCatalogo = findViewById(R.id.cardbike);

        cardClientes.setOnClickListener(this);
        cardReservation.setOnClickListener(this);
        cardMaintance.setOnClickListener(this);
        cardSales.setOnClickListener(this);
        cardCatalogo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}