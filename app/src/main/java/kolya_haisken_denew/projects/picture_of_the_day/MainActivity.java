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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String TAG = "MainActivity";


        ImageView imageView = findViewById(R.id.imageView);
        Integer firstImageId = R.drawable.image1;
        Integer lastImageId = R.drawable.image4;
        Integer imageNumber = (int) (Math.random() * (lastImageId - firstImageId + 1)) + firstImageId;
        imageView.setImageResource(imageNumber);

        Date currentDate = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        String formattedDate = df.format(currentDate);
        TextView txtDate = findViewById(R.id.txtDate);
        txtDate.setText(formattedDate);
    }
}
