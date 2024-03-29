package kolya_haisken_denew.projects.picture_of_the_day;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
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
    public void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();
        String TAG = "MainActivity";

        //Last updated 05.09.23
        //messenger keyword: "app version"
        Integer[] imageList= {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11, R.drawable.image12, R.drawable.image13, R.drawable.image14, R.drawable.image15, R.drawable.image16, R.drawable.image17, R.drawable.image18, R.drawable.image19, R.drawable.image20, R.drawable.image21, R.drawable.image22, R.drawable.image23, R.drawable.image24, R.drawable.image25, R.drawable.image26, R.drawable.image27, R.drawable.image28, R.drawable.image29, R.drawable.image30, R.drawable.image31, R.drawable.image32, R.drawable.image33, R.drawable.image34, R.drawable.image35, R.drawable.image36, R.drawable.image37, R.drawable.image38, R.drawable.image39, R.drawable.image40, R.drawable.image41, R.drawable.image42, R.drawable.image43, R.drawable.image44, R.drawable.image45, R.drawable.image46, R.drawable.image47, R.drawable.image48, R.drawable.image49, R.drawable.image50, R.drawable.image51, R.drawable.image52, R.drawable.image53, R.drawable.image54, R.drawable.image55, R.drawable.image56, R.drawable.image57, R.drawable.image58, R.drawable.image59, R.drawable.image60, R.drawable.image61, R.drawable.image62, R.drawable.image63, R.drawable.image64, R.drawable.image65, R.drawable.image66, R.drawable.image67, R.drawable.image68, R.drawable.image69, R.drawable.image70, R.drawable.image71, R.drawable.image72, R.drawable.image73, R.drawable.image74, R.drawable.image75, R.drawable.image76, R.drawable.image77, R.drawable.image78, R.drawable.image79, R.drawable.image80, R.drawable.image81, R.drawable.image82, R.drawable.image83, R.drawable.image84, R.drawable.image85, R.drawable.image86, R.drawable.image87, R.drawable.image88, R.drawable.image89, R.drawable.image90, R.drawable.image91, R.drawable.image92, R.drawable.image93, R.drawable.image94, R.drawable.image95, R.drawable.image96, R.drawable.image97, R.drawable.image98, R.drawable.image99, R.drawable.image100, R.drawable.image101, R.drawable.image102, R.drawable.image103, R.drawable.image104, R.drawable.image105, R.drawable.image106, R.drawable.image107, R.drawable.image108, R.drawable.image109, R.drawable.image110, R.drawable.image111, R.drawable.image112, R.drawable.image113, R.drawable.image114, R.drawable.image115, R.drawable.image116, R.drawable.image117, R.drawable.image118, R.drawable.image119, R.drawable.image120, R.drawable.image121, R.drawable.image122, R.drawable.image123, R.drawable.image124, R.drawable.image125, R.drawable.image126, R.drawable.image127, R.drawable.image128, R.drawable.image129, R.drawable.image130, R.drawable.image131, R.drawable.image132, R.drawable.image133, R.drawable.image134, R.drawable.image135, R.drawable.image136, R.drawable.image137, R.drawable.image138, R.drawable.image139, R.drawable.image140, R.drawable.image141, R.drawable.image142, R.drawable.image143, R.drawable.image144, R.drawable.image145, R.drawable.image146, R.drawable.image147, R.drawable.image148, R.drawable.image149, R.drawable.image150, R.drawable.image151, R.drawable.image152, R.drawable.image153, R.drawable.image154, R.drawable.image155, R.drawable.image156, R.drawable.image157, R.drawable.image158, R.drawable.image159, R.drawable.image160, R.drawable.image161, R.drawable.image162, R.drawable.image163, R.drawable.image164, R.drawable.image165, R.drawable.image166, R.drawable.image167, R.drawable.image168, R.drawable.image169, R.drawable.image170, R.drawable.image171, R.drawable.image172, R.drawable.image173, R.drawable.image174, R.drawable.image175, R.drawable.image176, R.drawable.image177, R.drawable.image178, R.drawable.image179, R.drawable.image180, R.drawable.image181, R.drawable.image182, R.drawable.image183, R.drawable.image184, R.drawable.image185, R.drawable.image186, R.drawable.image187, R.drawable.image188, R.drawable.image189, R.drawable.image190, R.drawable.image191, R.drawable.image192, R.drawable.image193, R.drawable.image194, R.drawable.image195, R.drawable.image196, R.drawable.image197, R.drawable.image198};

        View layoutDate = (View) findViewById(R.id.layoutMasterDate);
        View layoutMessage = (View) findViewById(R.id.layoutMasterMesage);
        layoutDate.setVisibility(View.VISIBLE);
        layoutMessage.setVisibility(View.VISIBLE);

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
            txtMessage.setText("Happy Valentines Day!");
        } else if (dayAndMonth.equals("03/09")) {
            imageView.setImageResource(R.drawable.her_birthday);
            txtMessage.setText("HAPPY BIRTHDAY, MY LOVE!");
        } else if (dayAndMonth.equals("05/09")) {
            imageView.setImageResource(R.drawable.anniversary);
            txtMessage.setText("Today is our anniversary!");
        } else if (dayAndMonth.equals("31/12")) {
            imageView.setImageResource(R.drawable.new_years);
            txtMessage.setText("Happy New Year!");
        } else if (dayAndMonth.equals("25/12")) {
            imageView.setImageResource(R.drawable.christmas);
            txtMessage.setText("Merry Christmas, my Love!");
        } else if (dayAndMonth.equals("23/03")) {
            imageView.setImageResource(R.drawable.first_meet);
//            txtMessage.setVisibility(View.GONE);
//            final View viewButtonValentinesDay = (View) findViewById(R.id.viewButtonValentinesDay);
//            viewButtonValentinesDay.setVisibility(View.VISIBLE);
//            viewButtonValentinesDay.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    setContentView(R.layout.special_valentines_day);
//                    viewButtonValentinesDay.setVisibility(View.GONE);
//                }
//            });
            txtMessage.setText("Happy Valentines Day!");
        }
        else {
            txtMessage.setVisibility(View.GONE);
            Calendar cal = Calendar.getInstance();
            cal.setTime(currentDate);
            int dayOfYear = cal.get(Calendar.DAY_OF_YEAR) + 366 * cal.get(Calendar.YEAR);
            Random random = new Random(dayOfYear);
            Log.d(TAG, "" + random.nextInt(imageList.length));
            Integer imageNumber = random.nextInt(imageList.length);
            imageView.setImageResource(imageList[imageNumber]);
            Log.d(TAG, imageNumber.toString() + " " + dayOfYear);
        }
    }
}
