package com.tje.a20190427_adroid_practice.datas;

public class PizzaStore {
    // 가게이름과 , 어느동네(구) , 영업시간("09:00 ~ 21:00"), 로고파일 ☆
    public String storeName ;
    public String location;
    public String openTime;
    public String imageUrl; // 웝상에 있는 이미지의 주소

    public PizzaStore(String storeName, String location, String openTime, String imageUrl) {
        this.storeName = storeName;
        this.location = location;
        this.openTime = openTime;
        this.imageUrl = imageUrl;
    }
}
