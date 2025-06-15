package ex_25_Enum;

public enum API_URLs {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    API_URLs(String url){
        this.url = url;
    }

    String getUrl() {
        return this.url;
    }
}
