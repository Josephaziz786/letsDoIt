package org.example.dbentity;

public class CardAcq implements ICplanData{

String id1;
    String id2;
    String id3;
    String id4;

    public CardAcq(String id1, String id2, String id3, String id4) {
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.id4 = id4;
    }

    @Override
    public String getKey() {
        return id1 + "#" + id2 + "#" + id3 + "#" + id4;
    }

    @Override
    public String toString() {
        return "CardAcq{" +
                "id1='" + id1 + '\'' +
                ", id2='" + id2 + '\'' +
                ", id3='" + id3 + '\'' +
                ", id4='" + id4 + '\'' +
                '}';
    }

}
