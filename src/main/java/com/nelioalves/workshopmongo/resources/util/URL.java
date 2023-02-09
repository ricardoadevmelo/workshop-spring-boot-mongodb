package com.nelioalves.workshopmongo.resources.util;

import javax.swing.plaf.PanelUI;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String decodeParam(String text){
        try {
            return URLDecoder.decode(text, "UTF-8");
        }
        catch (UnsupportedEncodingException e){
            return "";
        }
    }
}
