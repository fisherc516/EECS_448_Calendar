package com.example.cara.calendar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MonthView extends AppCompatActivity implements View.OnClickListener {
    public int[] array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_month_view);

        findViewById(R.id.yearButton).setOnClickListener(this);
        findViewById(R.id.firstWeek).setOnClickListener(this);
        findViewById(R.id.secondWeek).setOnClickListener(this);
        findViewById(R.id.thirdWeek).setOnClickListener(this);
        findViewById(R.id.fourthWeek).setOnClickListener(this);
        findViewById(R.id.fifthWeek).setOnClickListener(this);

        Intent getToMonth = getIntent();
        array = getToMonth.getIntArrayExtra(YearView.DATA);

        if(array[1] != 0)
        {
            TextView textview = (TextView) findViewById(R.id.monthName);
            textview.setText(getMonth(array[1]));
        }
        if(array[3] != 0 && array[5] != 0)
        {
            fillMonth(array[3], array[5]);
        }
    }
    @Override
    public void onClick(View view)
    {
        switch(view.getId())
        {
            case (R.id.yearButton):
            {
                Intent goToYear = new Intent(this, YearView.class);
                startActivity(goToYear);
                break;
            }
            default:
            {
                Intent goToWeek = new Intent(this, WeekView.class);
                startActivity(goToWeek);
                break;
            }
        }
    }
    
    public String getMonth(int m)
    {
        if(m == 8)
        {
            return("August");
        }
        else if(m == 9)
        {
            return("September");
        }
        else if(m == 10)
        {
            return("October");
        }
        else if(m == 11)
        {
            return("November");
        }
        else if(m == 12)
        {
            return("December");
        }
        else if(m == 1)
        {
            return("January");
        }
        else if(m == 2)
        {
            return("February");
        }
        else if(m == 3)
        {
            return("March");
        }
        else if(m == 4)
        {
            return("April");
        }
        else if(m == 5)
        {
            return("May");
        }
        else
        {
            return("");
        }
    }
    public void fillMonth(int start, int end)
    {
        // start is the day of the week to start on : w1<start>
        if(start == 1)
        {
            TextView t = (TextView) findViewById(R.id.w11);
            t.setText("01");
            t = (TextView) findViewById(R.id.w12);
            t.setText("02");
            t = (TextView) findViewById(R.id.w13);
            t.setText("03");
            t = (TextView) findViewById(R.id.w14);
            t.setText("04");
            t = (TextView) findViewById(R.id.w15);
            t.setText("05");
            t = (TextView) findViewById(R.id.w16);
            t.setText("06");
            t = (TextView) findViewById(R.id.w17);
            t.setText("07");
            t = (TextView) findViewById(R.id.w21);
            t.setText("08");
            t = (TextView) findViewById(R.id.w22);
            t.setText("09");
            t = (TextView) findViewById(R.id.w23);
            t.setText("10");
            t = (TextView) findViewById(R.id.w24);
            t.setText("11");
            t = (TextView) findViewById(R.id.w25);
            t.setText("12");
            t = (TextView) findViewById(R.id.w26);
            t.setText("13");
            t = (TextView) findViewById(R.id.w27);
            t.setText("14");
            t = (TextView) findViewById(R.id.w31);
            t.setText("15");
            t = (TextView) findViewById(R.id.w32);
            t.setText("16");
            t = (TextView) findViewById(R.id.w33);
            t.setText("17");
            t = (TextView) findViewById(R.id.w34);
            t.setText("18");
            t = (TextView) findViewById(R.id.w35);
            t.setText("19");
            t = (TextView) findViewById(R.id.w36);
            t.setText("20");
            t = (TextView) findViewById(R.id.w37);
            t.setText("21");
            t = (TextView) findViewById(R.id.w41);
            t.setText("22");
            t = (TextView) findViewById(R.id.w42);
            t.setText("23");
            t = (TextView) findViewById(R.id.w43);
            t.setText("24");
            t = (TextView) findViewById(R.id.w44);
            t.setText("25");
            t = (TextView) findViewById(R.id.w45);
            t.setText("26");
            t = (TextView) findViewById(R.id.w46);
            t.setText("27");
            t = (TextView) findViewById(R.id.w47);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w51);
                t.setText("29");
                t = (TextView) findViewById(R.id.w52);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w53);
                    t.setText("31");
                }
            }
        }
        else if(start == 2)
        {
            TextView t = (TextView) findViewById(R.id.w12);
            t.setText("01");
            t = (TextView) findViewById(R.id.w13);
            t.setText("02");
            t = (TextView) findViewById(R.id.w14);
            t.setText("03");
            t = (TextView) findViewById(R.id.w15);
            t.setText("04");
            t = (TextView) findViewById(R.id.w16);
            t.setText("05");
            t = (TextView) findViewById(R.id.w17);
            t.setText("06");
            t = (TextView) findViewById(R.id.w21);
            t.setText("07");
            t = (TextView) findViewById(R.id.w22);
            t.setText("08");
            t = (TextView) findViewById(R.id.w23);
            t.setText("09");
            t = (TextView) findViewById(R.id.w24);
            t.setText("10");
            t = (TextView) findViewById(R.id.w25);
            t.setText("11");
            t = (TextView) findViewById(R.id.w26);
            t.setText("12");
            t = (TextView) findViewById(R.id.w27);
            t.setText("13");
            t = (TextView) findViewById(R.id.w31);
            t.setText("14");
            t = (TextView) findViewById(R.id.w32);
            t.setText("15");
            t = (TextView) findViewById(R.id.w33);
            t.setText("16");
            t = (TextView) findViewById(R.id.w34);
            t.setText("17");
            t = (TextView) findViewById(R.id.w35);
            t.setText("18");
            t = (TextView) findViewById(R.id.w36);
            t.setText("19");
            t = (TextView) findViewById(R.id.w37);
            t.setText("20");
            t = (TextView) findViewById(R.id.w41);
            t.setText("21");
            t = (TextView) findViewById(R.id.w42);
            t.setText("22");
            t = (TextView) findViewById(R.id.w43);
            t.setText("23");
            t = (TextView) findViewById(R.id.w44);
            t.setText("24");
            t = (TextView) findViewById(R.id.w45);
            t.setText("25");
            t = (TextView) findViewById(R.id.w46);
            t.setText("26");
            t = (TextView) findViewById(R.id.w47);
            t.setText("27");
            t = (TextView) findViewById(R.id.w51);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w52);
                t.setText("29");
                t = (TextView) findViewById(R.id.w53);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w54);
                    t.setText("31");
                }
            }
        }
        else if(start == 3)
        {
            TextView t = (TextView) findViewById(R.id.w13);
            t.setText("01");
            t = (TextView) findViewById(R.id.w14);
            t.setText("02");
            t = (TextView) findViewById(R.id.w15);
            t.setText("03");
            t = (TextView) findViewById(R.id.w16);
            t.setText("04");
            t = (TextView) findViewById(R.id.w17);
            t.setText("05");
            t = (TextView) findViewById(R.id.w21);
            t.setText("06");
            t = (TextView) findViewById(R.id.w22);
            t.setText("07");
            t = (TextView) findViewById(R.id.w23);
            t.setText("08");
            t = (TextView) findViewById(R.id.w24);
            t.setText("09");
            t = (TextView) findViewById(R.id.w25);
            t.setText("10");
            t = (TextView) findViewById(R.id.w26);
            t.setText("11");
            t = (TextView) findViewById(R.id.w27);
            t.setText("12");
            t = (TextView) findViewById(R.id.w31);
            t.setText("13");
            t = (TextView) findViewById(R.id.w32);
            t.setText("14");
            t = (TextView) findViewById(R.id.w33);
            t.setText("15");
            t = (TextView) findViewById(R.id.w34);
            t.setText("16");
            t = (TextView) findViewById(R.id.w35);
            t.setText("17");
            t = (TextView) findViewById(R.id.w36);
            t.setText("18");
            t = (TextView) findViewById(R.id.w37);
            t.setText("19");
            t = (TextView) findViewById(R.id.w41);
            t.setText("20");
            t = (TextView) findViewById(R.id.w42);
            t.setText("21");
            t = (TextView) findViewById(R.id.w43);
            t.setText("22");
            t = (TextView) findViewById(R.id.w44);
            t.setText("23");
            t = (TextView) findViewById(R.id.w45);
            t.setText("24");
            t = (TextView) findViewById(R.id.w46);
            t.setText("25");
            t = (TextView) findViewById(R.id.w47);
            t.setText("26");
            t = (TextView) findViewById(R.id.w51);
            t.setText("27");
            t = (TextView) findViewById(R.id.w52);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w53);
                t.setText("29");
                t = (TextView) findViewById(R.id.w54);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w55);
                    t.setText("31");
                }
            }
        }
        else if(start == 4)
        {
            TextView t = (TextView) findViewById(R.id.w14);
            t.setText("01");
            t = (TextView) findViewById(R.id.w15);
            t.setText("02");
            t = (TextView) findViewById(R.id.w16);
            t.setText("03");
            t = (TextView) findViewById(R.id.w17);
            t.setText("04");
            t = (TextView) findViewById(R.id.w21);
            t.setText("05");
            t = (TextView) findViewById(R.id.w22);
            t.setText("06");
            t = (TextView) findViewById(R.id.w23);
            t.setText("07");
            t = (TextView) findViewById(R.id.w24);
            t.setText("08");
            t = (TextView) findViewById(R.id.w25);
            t.setText("09");
            t = (TextView) findViewById(R.id.w26);
            t.setText("10");
            t = (TextView) findViewById(R.id.w27);
            t.setText("11");
            t = (TextView) findViewById(R.id.w31);
            t.setText("12");
            t = (TextView) findViewById(R.id.w32);
            t.setText("13");
            t = (TextView) findViewById(R.id.w33);
            t.setText("14");
            t = (TextView) findViewById(R.id.w34);
            t.setText("15");
            t = (TextView) findViewById(R.id.w35);
            t.setText("16");
            t = (TextView) findViewById(R.id.w36);
            t.setText("17");
            t = (TextView) findViewById(R.id.w37);
            t.setText("18");
            t = (TextView) findViewById(R.id.w41);
            t.setText("19");
            t = (TextView) findViewById(R.id.w42);
            t.setText("20");
            t = (TextView) findViewById(R.id.w43);
            t.setText("21");
            t = (TextView) findViewById(R.id.w44);
            t.setText("22");
            t = (TextView) findViewById(R.id.w45);
            t.setText("23");
            t = (TextView) findViewById(R.id.w46);
            t.setText("24");
            t = (TextView) findViewById(R.id.w47);
            t.setText("25");
            t = (TextView) findViewById(R.id.w51);
            t.setText("26");
            t = (TextView) findViewById(R.id.w52);
            t.setText("27");
            t = (TextView) findViewById(R.id.w53);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w54);
                t.setText("29");
                t = (TextView) findViewById(R.id.w55);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w56);
                    t.setText("31");
                }
            }
        }
        else if(start == 5)
        {
            TextView t = (TextView) findViewById(R.id.w15);
            t.setText("01");
            t = (TextView) findViewById(R.id.w16);
            t.setText("02");
            t = (TextView) findViewById(R.id.w17);
            t.setText("03");
            t = (TextView) findViewById(R.id.w21);
            t.setText("04");
            t = (TextView) findViewById(R.id.w22);
            t.setText("05");
            t = (TextView) findViewById(R.id.w23);
            t.setText("06");
            t = (TextView) findViewById(R.id.w24);
            t.setText("07");
            t = (TextView) findViewById(R.id.w25);
            t.setText("08");
            t = (TextView) findViewById(R.id.w26);
            t.setText("09");
            t = (TextView) findViewById(R.id.w27);
            t.setText("10");
            t = (TextView) findViewById(R.id.w31);
            t.setText("11");
            t = (TextView) findViewById(R.id.w32);
            t.setText("12");
            t = (TextView) findViewById(R.id.w33);
            t.setText("13");
            t = (TextView) findViewById(R.id.w34);
            t.setText("14");
            t = (TextView) findViewById(R.id.w35);
            t.setText("15");
            t = (TextView) findViewById(R.id.w36);
            t.setText("16");
            t = (TextView) findViewById(R.id.w37);
            t.setText("17");
            t = (TextView) findViewById(R.id.w41);
            t.setText("18");
            t = (TextView) findViewById(R.id.w42);
            t.setText("19");
            t = (TextView) findViewById(R.id.w43);
            t.setText("20");
            t = (TextView) findViewById(R.id.w44);
            t.setText("21");
            t = (TextView) findViewById(R.id.w45);
            t.setText("22");
            t = (TextView) findViewById(R.id.w46);
            t.setText("23");
            t = (TextView) findViewById(R.id.w47);
            t.setText("24");
            t = (TextView) findViewById(R.id.w51);
            t.setText("25");
            t = (TextView) findViewById(R.id.w52);
            t.setText("26");
            t = (TextView) findViewById(R.id.w53);
            t.setText("27");
            t = (TextView) findViewById(R.id.w54);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w55);
                t.setText("29");
                t = (TextView) findViewById(R.id.w56);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w57);
                    t.setText("31");
                }
            }
        }
        else if(start == 6)
        {
            TextView t = (TextView) findViewById(R.id.w16);
            t.setText("01");
            t = (TextView) findViewById(R.id.w17);
            t.setText("02");
            t = (TextView) findViewById(R.id.w21);
            t.setText("03");
            t = (TextView) findViewById(R.id.w22);
            t.setText("04");
            t = (TextView) findViewById(R.id.w23);
            t.setText("05");
            t = (TextView) findViewById(R.id.w24);
            t.setText("06");
            t = (TextView) findViewById(R.id.w25);
            t.setText("07");
            t = (TextView) findViewById(R.id.w26);
            t.setText("08");
            t = (TextView) findViewById(R.id.w27);
            t.setText("09");
            t = (TextView) findViewById(R.id.w31);
            t.setText("10");
            t = (TextView) findViewById(R.id.w32);
            t.setText("11");
            t = (TextView) findViewById(R.id.w33);
            t.setText("12");
            t = (TextView) findViewById(R.id.w34);
            t.setText("13");
            t = (TextView) findViewById(R.id.w35);
            t.setText("14");
            t = (TextView) findViewById(R.id.w36);
            t.setText("15");
            t = (TextView) findViewById(R.id.w37);
            t.setText("16");
            t = (TextView) findViewById(R.id.w41);
            t.setText("17");
            t = (TextView) findViewById(R.id.w42);
            t.setText("18");
            t = (TextView) findViewById(R.id.w43);
            t.setText("19");
            t = (TextView) findViewById(R.id.w44);
            t.setText("20");
            t = (TextView) findViewById(R.id.w45);
            t.setText("21");
            t = (TextView) findViewById(R.id.w46);
            t.setText("22");
            t = (TextView) findViewById(R.id.w47);
            t.setText("23");
            t = (TextView) findViewById(R.id.w51);
            t.setText("24");
            t = (TextView) findViewById(R.id.w52);
            t.setText("25");
            t = (TextView) findViewById(R.id.w53);
            t.setText("26");
            t = (TextView) findViewById(R.id.w54);
            t.setText("27");
            t = (TextView) findViewById(R.id.w55);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w56);
                t.setText("29");
                t = (TextView) findViewById(R.id.w57);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w61);
                    t.setText("31");
                }
            }
        }
        else if(start == 7)
        {
            TextView t = (TextView) findViewById(R.id.w17);
            t.setText("01");
            t = (TextView) findViewById(R.id.w21);
            t.setText("02");
            t = (TextView) findViewById(R.id.w22);
            t.setText("03");
            t = (TextView) findViewById(R.id.w23);
            t.setText("04");
            t = (TextView) findViewById(R.id.w24);
            t.setText("05");
            t = (TextView) findViewById(R.id.w25);
            t.setText("06");
            t = (TextView) findViewById(R.id.w26);
            t.setText("07");
            t = (TextView) findViewById(R.id.w27);
            t.setText("08");
            t = (TextView) findViewById(R.id.w31);
            t.setText("09");
            t = (TextView) findViewById(R.id.w32);
            t.setText("10");
            t = (TextView) findViewById(R.id.w33);
            t.setText("11");
            t = (TextView) findViewById(R.id.w34);
            t.setText("12");
            t = (TextView) findViewById(R.id.w35);
            t.setText("13");
            t = (TextView) findViewById(R.id.w36);
            t.setText("14");
            t = (TextView) findViewById(R.id.w37);
            t.setText("15");
            t = (TextView) findViewById(R.id.w41);
            t.setText("16");
            t = (TextView) findViewById(R.id.w42);
            t.setText("17");
            t = (TextView) findViewById(R.id.w43);
            t.setText("18");
            t = (TextView) findViewById(R.id.w44);
            t.setText("19");
            t = (TextView) findViewById(R.id.w45);
            t.setText("20");
            t = (TextView) findViewById(R.id.w46);
            t.setText("21");
            t = (TextView) findViewById(R.id.w47);
            t.setText("22");
            t = (TextView) findViewById(R.id.w51);
            t.setText("23");
            t = (TextView) findViewById(R.id.w52);
            t.setText("24");
            t = (TextView) findViewById(R.id.w53);
            t.setText("25");
            t = (TextView) findViewById(R.id.w54);
            t.setText("26");
            t = (TextView) findViewById(R.id.w55);
            t.setText("27");
            t = (TextView) findViewById(R.id.w56);
            t.setText("28");
            if(end != 28)
            {
                t = (TextView) findViewById(R.id.w57);
                t.setText("29");
                t = (TextView) findViewById(R.id.w61);
                t.setText("30");
                if (end == 31) {
                    t = (TextView) findViewById(R.id.w62);
                    t.setText("31");
                }
            }
        }
    }
}