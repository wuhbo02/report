package com.gdin.report.util;

import java.util.Date;

public class Test {
    public static void main(String []ere){

        int num = (int)(Math.random()*(9999-1000+1))+1000;
        String randomstr = DateUtils.parseDateToString(new Date(),"yyyyMMddHHmmsss")+num;
        System.out.println(randomstr);
    }
}
