package us.ronaldcho.carmodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CarLog implements Serializable
{
    private final String text;
    private final String formattedDate;

    public CarLog(@JsonProperty("text") String text)
    {
        this.text = text;
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd hh:mm:ss a";
        DateFormat dateformat = new SimpleDateFormat(strDateFormat);
        formattedDate = dateformat.format(date);
    }
}
