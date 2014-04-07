package avoid.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Loading extends Activity {
	
	private final int SPLASH_DISPLAY_LENGHT = 700;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);
        
        new Handler().postDelayed(new Runnable(){  
            public void run() {  
                Intent mainIntent = new Intent(Loading.this, AvoidActivity.class);  
                Loading.this.startActivity(mainIntent);  
                Loading.this.finish();  
            }     
        }, SPLASH_DISPLAY_LENGHT);  
	}
}
