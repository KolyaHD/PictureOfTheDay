package kolya_haisken_denew.projects.picture_of_the_day;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
    }

    @Override
    public void onResume(){
        super.onResume();
        String TAG = "MainActivity";

        Integer[] imageList= {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14, R.drawable.image15, R.drawable.image16, R.drawable.image17, R.drawable.image18, R.drawable.image19, R.drawable.image20, R.drawable.image21, R.drawable.image22, R.drawable.image23, R.drawable.image24, R.drawable.image25, R.drawable.image26, R.drawable.image27, R.drawable.image28, R.drawable.image29, R.drawable.image30, R.drawable.image31, R.drawable.image32, R.drawable.image33, R.drawable.image34, R.drawable.image35, R.drawable.image36, R.drawable.image37, R.drawable.image38, R.drawable.image39, R.drawable.image40, R.drawable.image41, R.drawable.image42, R.drawable.image43, R.drawable.image44, R.drawable.image45, R.drawable.image46, R.drawable.image47, R.drawable.image48, R.drawable.image49, R.drawable.image50, R.drawable.image51, R.drawable.image52, R.drawable.image53, R.drawable.image54, R.drawable.image55, R.drawable.image56, R.drawable.image57, R.drawable.image58, R.drawable.image59, R.drawable.image60};

        Date currentDate = Calendar.getInstance().getTime();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        String formattedDate = df.format(currentDate);
        TextView txtDate = findViewById(R.id.txtDate);
        txtDate.setText(formattedDate);

        ImageView imageView = findViewById(R.id.imageView);
        TextView txtMessage = findViewById(R.id.txtMessage);
        txtMessage.setVisibility(View.VISIBLE);
        String dayAndMonth = formattedDate.substring(0,5);
        if (dayAndMonth.equals("15/07")) {
            imageView.setImageResource(R.drawable.first_message);
            txtMessage.setText("Anniversary of our first message ever! This is the first picture i ever sent you. It was a response to you sending me the image of the bug on a fork.");
        } else if (dayAndMonth.equals("01/04")) {
            imageView.setImageResource(R.drawable.april_fools);
            txtMessage.setVisibility(View.GONE);
        } else if (dayAndMonth.equals("17/08")) {
            imageView.setImageResource(R.drawable.my_birthday);
            txtMessage.setText("I AM AWESOME");
        } else if (dayAndMonth.equals("14/02")) {
            imageView.setImageResource(R.drawable.valentines_day);
            txtMessage.setText("I LOVE YOU");
        } else if (dayAndMonth.equals("03/09")) {
            imageView.setImageResource(R.drawable.her_birthday);
            txtMessage.setText("HAPPY BIRTHDAY, MY LOVE!");
        } else if (dayAndMonth.equals("05/09")) {
            imageView.setImageResource(R.drawable.anniversary);
            txtMessage.setText("Today is our anniversary!");
        }
        else {
            txtMessage.setVisibility(View.GONE);
            Calendar cal = Calendar.getInstance();
            cal.setTime(currentDate);
            int dayOfYear = cal.get(Calendar.DAY_OF_YEAR) + 366 * cal.get(Calendar.YEAR);
            Random random = new Random(dayOfYear);
            Integer imageNumber = random.nextInt(imageList.length);
            imageView.setImageResource(imageList[imageNumber]);
        }
    }
}
