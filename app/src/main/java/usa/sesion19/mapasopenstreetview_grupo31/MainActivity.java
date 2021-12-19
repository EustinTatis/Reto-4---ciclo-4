package usa.sesion19.mapasopenstreetview_grupo31;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    TextView texto1;
    ImageView imagen1, imagen2, imagen3;
    Drawable drawable1, drawable2, drawable3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.inicial, getTheme());
        imagen1 = (ImageView) findViewById(R.id.imagenInicial);
        imagen1.setImageDrawable(drawable1);

        Resources res2 = getResources();
        drawable2 = res2.getDrawable(R.drawable.inicial2, getTheme());
        imagen2 = (ImageView) findViewById(R.id.imagenInicial2);
        imagen2.setImageDrawable(drawable2);

        Resources res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.inicial3, getTheme());
        imagen3 = (ImageView) findViewById(R.id.imagenInicial3);
        imagen3.setImageDrawable(drawable3);

        boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad con las promociones del restaurante", Toast.LENGTH_LONG).show();
            }
        });

        imagen2 = (ImageView) findViewById(R.id.imagenInicial2);
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad", Toast.LENGTH_LONG).show();
            }
        });

        imagen3 = (ImageView) findViewById(R.id.imagenInicial3);
        imagen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Para el segundo reto se abrirá otra actividad", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcion1) {
            Toast.makeText(getApplicationContext(), "Conoce nuestros productos", Toast.LENGTH_LONG).show();
            Intent pantallaProductos = new Intent(this, Activity_Productos.class);
            startActivity(pantallaProductos);
        }
        if (id == R.id.opcion2) {
            Toast.makeText(getApplicationContext(), "Conoce nuestros servicios", Toast.LENGTH_LONG).show();
            Intent pantallaServicios = new Intent(this, Activity_Servicios.class);
            startActivity(pantallaServicios);
        }
        if (id == R.id.opcion3) {
            Toast.makeText(getApplicationContext(), "Conoce nuestras sucursales", Toast.LENGTH_LONG).show();
            Intent pantallaSucursales = new Intent(this, Activity_Sucursales.class);
            startActivity(pantallaSucursales);
        }
        return super.onOptionsItemSelected(item);
    }
}