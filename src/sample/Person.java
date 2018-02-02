package sample;

public class Person {
    private String sei;
    private String mei;
    private String pho;
    private String num;

    public Person( String sei, String mei, String pho, String num){
        this.sei = sei;
        this.mei = mei;
        this.pho = pho;
        this.num = num;
    }
    public String getSei(){
        return sei;
    }
    public void setSei(String sei){
        this.sei = sei;
    }
    public String getMei(){
        return mei;
    }
    public void setMei(String mei){
        this.mei = mei;
    }
    public String getPho(){
        return pho;
    }
    public void setPho(String pho){
        this.pho = pho;
    }
    public String getNum(){
        return num;
    }
    public void setNum(String num){
        this.num = num;
    }

}
