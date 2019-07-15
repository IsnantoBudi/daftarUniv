package com.gmail.isnantobudi0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etSearch;
    Button btnSearch;
    static final LatLng ST3TELKOM_COORDINATE = new LatLng(-7.434952, 109.250123);
    static final LatLng BATURADEN_COORDINATE = new LatLng(-7.298936, 109.216753);
    static final LatLng akakom = new LatLng(-7.790810,110.408211);
    static final LatLng UGM    = new LatLng(-7.771489, 110.377449);
    static final LatLng UNY    = new LatLng(-7.7747533,110.3825688);
    static final LatLng UTY    = new LatLng(-7.7474002,110.3532092);


    private RadioButton rbAkakom, rbUgm;
    private Button btnDisplay;
    private TextView txt;
    private GoogleMap mMap;
    float zoomLevel = 16.0f; //This goes up to 21
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       addListenerOnButton();

    }

    private void addListenerOnButton() {
       final RadioGroup rg = (RadioGroup) findViewById(R.id.radioG);
       btnDisplay = (Button) findViewById(R.id.btCari);
       txt = (TextView) findViewById(R.id.textView2);
       rbAkakom = (RadioButton) findViewById(R.id.radioButton);
       rbUgm = (RadioButton) findViewById(R.id.radioButton2);
        final Intent intent1 = new Intent(MainActivity.this, MapsActivity.class);
        final Intent intent2= new Intent(MainActivity.this, MapsActivity2.class);
        final Intent intent3 = new Intent(MainActivity.this, MapsActivity3.class);
       btnDisplay.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              int selectedId = rg.getCheckedRadioButtonId();
              txt.setText(""+selectedId);
              if(selectedId == 2131165290){
                  txt.setText("AKAKOM = "+akakom );
                  startActivity(intent1);
              }else if(selectedId == 2131165291){
                  txt.setText("UGM = "+UGM);
                  startActivity(intent2);
              }else if(selectedId == 2131165292){
                  txt.setText("UNY = "+UNY);
                  startActivity(intent3);
              }
           }
       });





                //int selectedId = rg.getCheckedRadioButtonId();

               /*if(rbAkakom.isSelected()){
                   txt.setText("akakom");
               }
               else if (rbUgm.isSelected()){
                   txt.setText("ugm");
               }*/







    }
}
