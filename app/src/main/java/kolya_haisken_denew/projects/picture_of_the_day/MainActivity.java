package kolya_haisken_denew.projects.picture_of_the_day;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String TAG = "MainActivity";

        Integer[] imageList= {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14, R.drawable.image15, R.drawable.image16, R.drawable.image17, R.drawable.image18, R.drawable.image19, R.drawable.image20, R.drawable.image21, R.drawable.image22, R.drawable.image23, R.drawable.image24, R.drawable.image25, R.drawable.image26, R.drawable.image27, R.drawable.image28, R.drawable.image29, R.drawable.image30, R.drawable.image31, R.drawable.image32, R.drawable.image33, R.drawable.image34, R.drawable.image35, R.drawable.image36, R.drawable.image37, R.drawable.image38, R.drawable.image39, R.drawable.image40, R.drawable.image41, R.drawable.image42, R.drawable.image43, R.drawable.image44, R.drawable.image45, R.drawable.image46, R.drawable.image47, R.drawable.image48, R.drawable.image49, R.drawable.image50, R.drawable.image51, R.drawable.image52, R.drawable.image53, R.drawable.image54, R.drawable.image55, R.drawable.image56, R.drawable.image57, R.drawable.image58, R.drawable.image59, R.drawable.image60, R.drawable.image61, R.drawable.image62, R.drawable.image63, R.drawable.image64, R.drawable.image65};

        Date currentDate = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        String formattedDate = df.format(currentDate);
        TextView txtDate = findViewById(R.id.txtDate);
        txtDate.setText(formattedDate);

        ImageView imageView = findViewById(R.id.imageView);
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR) + 366 * cal.get(Calendar.YEAR);
        Log.d(TAG, "" + dayOfYear);
        Log.d(TAG, "" + cal.get(Calendar.DAY_OF_YEAR));
        Log.d(TAG, "" + cal.get(Calendar.YEAR));
        Random random = new Random(dayOfYear);
        Integer imageNumber = random.nextInt(imageList.length);
        imageView.setImageResource(imageList[imageNumber]);


    }
}
