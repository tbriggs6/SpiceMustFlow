package com.tbriggs6.spicemustflow.data;

import java.util.LinkedList;

public interface IDataModel {

    int getNumSpices( );
    Spice getSpiceForID(int spiceID);
    LinkedList<Integer> getSpiceIDs( );

    int getNumFormsForSpice(int spiceID);

}
