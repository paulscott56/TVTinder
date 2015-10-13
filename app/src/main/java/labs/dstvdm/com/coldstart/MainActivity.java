package labs.dstvdm.com.coldstart;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity
{

    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id .imageView1);

        imageView.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            @Override
            public void onSwipeLeft() {
                Toast.makeText(getApplicationContext(), "Swipe left...", Toast.LENGTH_SHORT).show();
                // Whatever
                // set as no thanks in db
                getNew();
            }

            @Override
            public void onSwipeRight() {
                Toast.makeText(getApplicationContext(), "Swipe right...", Toast.LENGTH_SHORT).show();
                // Whatever
            }
        });

    }

    private Show getNew() {
        Show show  = new Show();
        return show;

    }

}