package eecs448_first_team.calender_app;

/**
 * author: Cara Fisher
 * date: 9-18-16
 * purpose: a mobile app page where details can be added to be displayed in DayView.
 *
 * Many thanks to Android (https://developer.android.com/index.html) for its help
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class AddDetails extends AppCompatActivity implements View.OnClickListener {
    public final static String DATA = "";
    public int[] array;
    private CalendarEventDb database;
    Calendar interpreterCalendar;
    EditText theDetails; //the details text to be replaced
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);

        findViewById(R.id.doneButton).setOnClickListener(this);
        findViewById(R.id.cancelButton).setOnClickListener(this);

        Intent getToDetails = getIntent();
        array = getToDetails.getIntArrayExtra(DayView.DATA);
        theDetails = (EditText)findViewById(R.id.edit);
    }
    @Override
    public void onResume()
    {
        super.onResume();
        database = new CalendarEventDb(this);
        interpreterCalendar = Calendar.getInstance(); //configures the calendar to get current time in MS of your corresponding day
        interpreterCalendar.set(Calendar.HOUR,0); //locks hours,minutes,seconds,MS in Calendar to 0 to make consistent, and so we don't have to zero them again later
        interpreterCalendar.set(Calendar.MINUTE,0); //thus, I can say with certainty that using the Calendar to convert 9-21-2016 to milliseconds will produce a constant value
        interpreterCalendar.set(Calendar.SECOND,0);
        interpreterCalendar.set(Calendar.MILLISECOND,0);
        interpreterCalendar.set(Calendar.DAY_OF_MONTH,array[0]);
        if(array[7] == 1 && array[0] > 7) // if Week 1 and day is from the previous month
        {
            interpreterCalendar.set(Calendar.MONTH,array[1] - 1);
        }
        else if(array[7] > 4 && array[0] < 23) // if Week 5 or 6 and day is from the next month
        {
            interpreterCalendar.set(Calendar.MONTH,array[1] + 1);
        }
        else
        {
            interpreterCalendar.set(Calendar.MONTH,array[1]);
        }
        interpreterCalendar.set(Calendar.YEAR,array[2]);

        theDetails.setText(database.getCalendarDetails(interpreterCalendar.getTimeInMillis()));

    }
    @Override
    public void onClick(View view)
    {
        Intent goToDay = new Intent(this, DayView.class);
        goToDay.putExtra(DATA, array);
        switch(view.getId())
        {
            case (R.id.doneButton):
            {
                String newDetails = theDetails.getText().toString();
                database.setCalendarDetails(interpreterCalendar.getTimeInMillis(),newDetails);
                Toast.makeText(this,"Details added!",Toast.LENGTH_LONG).show();
                this.finish();
                break;
            }
            case (R.id.cancelButton):
            {
                startActivity(goToDay);
                break;
            }
        }
    }

    @Override
    public void onStop()
    {
        super.onStop();
        database.close();
    }
}
