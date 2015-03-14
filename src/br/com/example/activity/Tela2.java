package br.com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Tela2 extends Activity {

	public void fechaTela2( View v) {
		
		Log.d("TiLL", "Tela2 -> fechaTela2( View v)");
		finish();
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Log.d("TiLL", "Tela2 -> onStart()");
		
		setContentView(R.layout.activity_tela2);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("TiLL", "Tela2 -> onStart()");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.d("TiLL", "Tela2 -> onResume()");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("TiLL", "Tela2 -> onPause()");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("TiLL", "Tela2 -> onStop()");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("TiLL", "Tela2 -> onDestroy()");
	}
}
