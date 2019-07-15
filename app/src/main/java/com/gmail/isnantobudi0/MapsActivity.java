package com.gmail.isnantobudi0;

import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Button btnDisplay;
    private TextView txt;
    LatLng akakom = new LatLng(-7.7927388,110.4061663);
    LatLng UGM    = new LatLng(-7.771489, 110.377449);
    LatLng UNY    = new LatLng(-7.7747533,110.3825688);
    LatLng UTY    = new LatLng(-7.7474002,110.3532092);
    float zoomLevel = 16.0f; //This goes up to 21
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //addListenerOnButton();
    }

    /*private void addListenerOnButton() {
        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioG);
        btnDisplay = (Button) findViewById(R.id.btCari);
        txt = (TextView) findViewById(R.id.textView2);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = rg.getCheckedRadioButtonId();
                txt.setText(""+selectedId);
                if(selectedId == 2131165287){
                    mMap.addMarker(new MarkerOptions().position(akakom).title(""));
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(akakom, zoomLevel));
                }else if(selectedId == 2131165288){
                    mMap.addMarker(new MarkerOptions().position(UGM).title(""));
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UGM, zoomLevel));
                }else if(selectedId == 2131165289){
                    mMap.addMarker(new MarkerOptions().position(UNY).title(""));
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UNY, zoomLevel));
                }
            }
        });
    }*/


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        mMap.addMarker(new MarkerOptions().position(akakom).title("STMIK AKAKOM").snippet("AKAKOM"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(akakom, zoomLevel));
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);


    }
}
