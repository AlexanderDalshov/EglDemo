package launcher.uvdemo.egldemo;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements EGLFragment.OnFragmentInteractionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        final View view = findViewById(R.id.eglFragment);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(view,"ScaleX",1,0);
                objectAnimator.setDuration(300);
                objectAnimator.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ObjectAnimator objectAnimator=ObjectAnimator.ofFloat(view,"ScaleX",0,1);
                objectAnimator.setDuration(300);
                objectAnimator.start();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
