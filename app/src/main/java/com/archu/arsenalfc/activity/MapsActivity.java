package com.archu.arsenalfc.activity;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import com.archu.arsenalfc.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


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
        LatLng emiratesStadium = new LatLng(51.555040, -0.108548);
        LatLng highburyStadium = new LatLng(51.5576404, -0.1034803);
        LatLng colneyCentre = new LatLng(51.7106761, -0.2871305);
        LatLng wembleyStadium = new LatLng(51.5605497, -0.2864144);
        LatLng westHamStadium = new LatLng(51.5380463, -0.0170542);
        LatLng chelseaStadium = new LatLng(51.4823801, -0.1931113);
        LatLng crystalPalaceStadium = new LatLng(51.3979037, -0.0885104);
        LatLng fulhamStadium = new LatLng(51.4748979, -0.2239686);

        mMap.addMarker(new MarkerOptions().position(emiratesStadium).title("Emirates Stadium"));
        mMap.addMarker(new MarkerOptions().position(highburyStadium).title("Highbury Stadium"));
        mMap.addMarker(new MarkerOptions().position(colneyCentre).title("Ośrodek treningowy"));
        mMap.addMarker(new MarkerOptions().position(wembleyStadium).title("Wembley - Tottenham"));
        mMap.addMarker(new MarkerOptions().position(chelseaStadium).title("Stamford Bridge - Chelsea"));
        mMap.addMarker(new MarkerOptions().position(crystalPalaceStadium).title("Selhurst Park - Crystal Palace"));
        mMap.addMarker(new MarkerOptions().position(fulhamStadium).title("Craven Cottage - Fulham"));
        mMap.addMarker(new MarkerOptions().position(westHamStadium).title("Olympic Stadium - West Ham"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(emiratesStadium));

        Polyline line = googleMap.addPolyline(new PolylineOptions()
                .add(emiratesStadium, highburyStadium, colneyCentre)
                .width(5)
                .color(Color.RED));

        Polygon polygon = googleMap.addPolygon(new PolygonOptions()
                .add(emiratesStadium, wembleyStadium, chelseaStadium, fulhamStadium, crystalPalaceStadium, westHamStadium)
                .strokeColor(Color.BLUE));

    }
}
