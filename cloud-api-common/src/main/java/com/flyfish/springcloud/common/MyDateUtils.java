package com.flyfish.springcloud.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author 会飞的鱼
 * @date: 2023/2/8 15:30
 * @description:
 */
public class MyDateUtils {
    private MyDateUtils(){}

    public static Date getBeijingDate(){
        return Calendar.getInstance(Locale.CHINA).getTime();
    }

    public static String getBeijingDateByString(){
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        Date date = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }
}
