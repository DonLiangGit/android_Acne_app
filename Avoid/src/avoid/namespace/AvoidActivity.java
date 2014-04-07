package avoid.namespace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;


/*Note:
 * 1.One activity is one class,which should extend activity
 * 2.need to override onCreate method
 * 3.each activity should be configured in AndroidManifest.xml
 * 4.put stuff into a specific activity 
 * @author:patrick*/

public class AvoidActivity extends Activity {
	
	private float X;
	private float Y;
	private AboutDialog aboutDialog;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        aboutDialog = new AboutDialog(this);
        

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.layout.menu, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.about:
        { aboutDialog.show();};
        return true;
        case R.id.settings:
        return true;
        default:
        return super.onOptionsItemSelected(item);
        }
    }
    
    public boolean onTouchEvent(MotionEvent event) {   
        
        X = event.getX();       
        Y = event.getY();        
        
      
        switch( event.getAction() ) {       
      
            case MotionEvent.ACTION_DOWN:  

                if((X >= 166 && X <= 469)&& (Y >= 317 && Y <= 480))
                {
                	
                	startActivity(new Intent(this, Forehead.class));
                }
                else if((X >= 300 && X <= 373)&& (Y >= 480 && Y <= 542))
                {
                	
                	startActivity(new Intent(this, BetweenBrows.class));
                }

                else if((X >= 300 && X <= 373)&& (Y >= 542 && Y <= 645))
                {
                	
                	startActivity(new Intent(this, Nose.class));
                }

                else if((X >=138 && X <= 300)&& (Y >= 480 && Y <=785))
                {
                	
                	startActivity(new Intent(this, LeftCheek.class));
                }

                else if((X >= 373 && X <= 469)&& (Y >= 480 && Y <= 785))
                {
                	
                	startActivity(new Intent(this, RightCheek.class));
                }

                else if((X >= 260 && X <= 402)&& (Y >= 645 && Y <= 713))
                {
                	
                	startActivity(new Intent(this, LipArea.class));
                }
                else if((X >= 260 && X < 402)&& (Y >= 713 && Y <= 785))
                {
                	
                	startActivity(new Intent(this, ChinJaw.class));
                }
                
               
        }

     
        return super.onTouchEvent(event);
 }
}