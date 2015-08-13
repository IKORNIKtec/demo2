package com.goeuro.webmobile.config;

/**
 * Created by WWW on 13.08.2015.
 */
public enum Servers {
    QA9("http://qa9.goeuro.int");
    private String url;
    Servers(String value){
        url = value;
    }
    public String getUrl(){
        return url;
    }
}
