package org.example.dbentity;

public class CardReward implements ICplanData{

    String ik1;
    String ik2;
    String ik3;
    String ik4;

    public CardReward(String id1, String id2, String id3, String id4) {
        this.ik1 = id1;
        this.ik2 = id2;
        this.ik3 = id3;
        this.ik4 = id4;
    }

    @Override
    public String getKey() {
        return ik1 + "#" + ik2 + "#" + ik3 + "#" + ik4;
    }

    @Override
    public String toString() {
        return "CardReward{" +
                "ik1='" + ik1 + '\'' +
                ", ik2='" + ik2 + '\'' +
                ", ik3='" + ik3 + '\'' +
                ", ik4='" + ik4 + '\'' +
                '}';
    }
}
