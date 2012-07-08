package br.edu.universo.android.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
	
	private final String CLASS_NAME = MainActivity.class.getName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Log.i(CLASS_NAME, "onCreate");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	
    	Log.i(CLASS_NAME, "onStart");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	
    	Log.i(CLASS_NAME, "onResume");
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	
    	Log.i(CLASS_NAME, "onPause");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	
    	Log.i(CLASS_NAME, "onStop");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	
    	Log.i(CLASS_NAME, "onRestart");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	
    	Log.i(CLASS_NAME, "onDestroy");
    }
}
