package avoid.namespace;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutDialog extends Dialog {

	public AboutDialog(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	protected void onCreate(Bundle savedInstanceState){  
        super.onCreate(savedInstanceState);  
          
        setContentView(R.layout.aboutdialog);  
        setTitle("About Avoid- alpha");  
        
        Button buttonYes = (Button) findViewById(R.id.button_yes);  
        buttonYes.setHeight(5);  
        buttonYes.setOnClickListener(new Button.OnClickListener(){  
 
               public void onClick(View v) {  
                   // TODO Auto-generated method stub  
                   dismiss();  
                     
               }

           });  
 
        TextView text = (TextView)findViewById(R.id.text);  
        text.setText("Hello welcome to use Avoid-acne in the pocket." +
        		"This is an app for kindle fire users,who also suffer some acne problems." +
        		"Avoid provides users plentiful tips for cure acne in specific part of face," +
        		"Get healthy,Get excercise!");
        }
	
}