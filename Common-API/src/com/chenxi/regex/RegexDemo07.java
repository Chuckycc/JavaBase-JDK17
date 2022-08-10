package com.chenxi.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo07 {
    public static void main(String[] args) throws IOException {
        /* 扩展需求2：
        把连接：https://m.sengzan.com/iiaovu/29104.html?ivk_sa=1025883i 中所有的身份证号码都爬取出来。*/
        URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i");
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);
        //在读取的时候每次读一整行
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            Matcher matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    }
}

/*
output:
    510801197609022309
    150401198107053872
    130133197204039024
    430102197606046442
    632722197112040806
    130683199011300601
    ......
 */
