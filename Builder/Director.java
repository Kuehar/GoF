public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Practice design pattern");
        builder.makeString("デザインパターン・・・難しい〜！！！");
        builder.makeItems(new String[]{
            "でもやっぱり、",
            "やるしかないよね！！"
        });
        builder.makeString("この冒険が終わったら、");
        builder.makeItems(new String[]{
            "俺、彼女と",
            "結婚するんだ・・・"
        });
        builder.close();
    }
}