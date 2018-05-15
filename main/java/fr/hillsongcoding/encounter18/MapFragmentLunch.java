package fr.hillsongcoding.encounter18;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapFragmentLunch extends Fragment implements OnMapReadyCallback{

    GoogleMap mGoogleMap;
    MapView mMapView;
    View mView;

    public MapFragmentLunch(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //inglate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_map_lunch, container, false);
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMapView = (MapView) mView.findViewById(R.id.mapLunch);
        if(mMapView != null){
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            MapsInitializer.initialize(getContext());
            mGoogleMap = googleMap;
            googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            googleMap.addMarker(new MarkerOptions().position(new LatLng(48.839905, 2.322998)).title("Bobino").snippet("Hillsong Paris"));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(48.841376, 2.322175)).title("Lunch 1 Monoprix").snippet("avec Jeremie et Johanna")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.basket_blue));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(48.838094, 2.323022)).title("Lunch 2 Carrefour City").snippet("    avec Edwin et Eiyi")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.basket_green));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(48.840524, 2.322052)).title("Lunch 3 Traiteur asiatique").snippet("avec Ana, Gérielle et Orlane")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.basket_red));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(48.841297, 2.322055)).title("Lunch 5 Monoprix").snippet("avec Carlos et David")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.basket_yellow));
            googleMap.addMarker(new MarkerOptions().position(new LatLng(48.839785, 2.318840)).title("Lieu du Lunch").snippet("Jardin Atlantique, au-dessus de la gare Montparnasse")).setIcon(BitmapDescriptorFactory.fromResource(R.drawable.picnic_location));

            CameraPosition Bobino = CameraPosition.builder().target(new LatLng(48.839865, 2.323008)).zoom(15).bearing(0).tilt(0).build();
            googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(Bobino));
        }

    }
}