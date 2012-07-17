package cm.kik.li;
import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.OnKeyguardExitResult;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

public class ImageTestActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
        
//        private /

		/** Called when the activity is first created. */
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.main);
            
//            KeyguardManager  myKeyGuard = (KeyguardManager)getSystemService(Context.KEYGUARD_SERVICE);
//
//            myKeyGuard.exitKeyguardSecurely((OnKeyguardExitResult) getApplicationContext());

            getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);



            Button a = (Button) findViewById(R.id.button1);
            Button b = (Button) findViewById(R.id.button2);
            b.setOnClickListener(this);
            a.setOnClickListener(this);
            
            
        }

		public void onClick(View arg0) {
			switch(arg0.getId()){
			case R.id.button1:
				finish();
				break;
			case R.id.button2:
				Intent i = new Intent(this, OnLockScreen.class);
				startActivity(i);
				break;
			}

			
		}
    }
    
    
   