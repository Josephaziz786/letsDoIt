package org.example;

import org.example.dbentity.CardAcq;
import org.example.dbentity.ICplanData;
import org.example.pojo.CplanDataResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        CardAcq cartAcq =new CardAcq("10","11","12","13");
       // testing(cartAcq);
        CardAcq cartrwd =new CardAcq("100","101","102","103");
       // testing(cartrwd);

/*

Child can be refrenced with their parent reference. in real life too.
For interaces you can achive multiple inheritance which is not applicaable in classes.
a single class can inhirt multiple interfaces.

*/

        //****************************

        CplanDataResult cplanDataResult = new CplanDataResult();

        cplanDataResult.setTable("tableName");
        CardAcq c1 = new CardAcq("1","2","3","4");
        CardAcq c2 = new CardAcq("10","20","30","40");
        CardAcq c3 = new CardAcq("100","200","300","400");
        CardAcq c4 = new CardAcq("1000","2000","3000","4000");

        List<CardAcq> cardAcqs = Arrays.asList(c1, c2, c3, c4);

        cplanDataResult.setExistingItems(cardAcqs);

        CardAcq c10 = new CardAcq("1","2","3","4");
        CardAcq c20 = new CardAcq("10","20","30","40");
        CardAcq c30 = new CardAcq("100","200","300","400");
        CardAcq c40 = new CardAcq("1000","2000","3000","4000");

        List<CardAcq> cardAcqs1 = Arrays.asList(c10, c20, c30, c40);

        cplanDataResult.setNewItems(cardAcqs1);

        System.out.println(cplanDataResult.getExistingItems());

    }// main ends

    public static void testing(ICplanData ic){

        System.out.println(ic.getKey());

    }


}