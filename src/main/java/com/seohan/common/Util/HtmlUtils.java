package com.seohan.common.Util;

public class HtmlUtils {
    public static String parseBrTag(String contents){
        return contents.replace("\n","<br>");
    }
}
