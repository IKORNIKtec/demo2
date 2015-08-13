package com.goeuro.webmobile.model;


public enum TrainProvider {
    BD_BAHN("http://www.goeuro.com/images/company_logos/railway/63/2a.png");
    private String logoImageUrl;
    TrainProvider(String value){
        this.logoImageUrl = value;
    }
    public String getLogoUrl(){
        return logoImageUrl;
    }
}
