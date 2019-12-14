package com.tomtom.online.sdk.displaymap;

// Add here the TomtomMap import
// Add here the OnMapReadyCallback import
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.tomtom.online.sdk.map.OnMapReadyCallback;
import com.tomtom.online.sdk.map.TomtomMap;
import androidx.annotation.NonNull;



public class MainActivity extends AppCompatActivity
implements OnMapReadyCallback
{
  private TomtomMap tomtomMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public void onMapReady(@NonNull final TomtomMap tomtomMap) {
    this.tomtomMap = tomtomMap;
  }
}
