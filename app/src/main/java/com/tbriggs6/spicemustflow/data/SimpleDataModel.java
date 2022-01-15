package com.tbriggs6.spicemustflow.data;

import com.tbriggs6.spicemustflow.R;

import java.util.HashMap;
import java.util.LinkedList;

public class SimpleDataModel implements IDataModel {

    HashMap<Integer, Spice> spices;
    HashMap<Integer, LinkedList<SpiceForm>> formsForSpices;

    public SimpleDataModel( )
    {
        spices = new HashMap<Integer, Spice>( );
        formsForSpices = new HashMap<Integer, LinkedList<SpiceForm>>( );

        initializeSpices();
        initializeForms();
    }

    private void initializeSpices( )
    {
        Spice cinnamon = new Spice( );
        cinnamon.setSpiceID(1);
        cinnamon.setSpiceName("Cinnamon");
        cinnamon.setSpiceDescription("Red, hot, firey.");
        cinnamon.setSpiceImageID(R.drawable.cinnamon);
        spices.put(1, cinnamon);

        Spice cloves = new Spice( );
        cloves.setSpiceID(2);
        cloves.setSpiceName("Cloves");
        cloves.setSpiceDescription("Strong warming spice.");
        cloves.setSpiceImageID(R.drawable.cloves);
        spices.put(2, cloves);

        Spice garlic = new Spice( );
        garlic.setSpiceID(3);
        garlic.setSpiceName("Garlic");
        garlic.setSpiceDescription("Pungent aromatic.");
        garlic.setSpiceImageID(R.drawable.garlic);
        spices.put(3, garlic);
    }

    private void initializeForms( )
    {
        int formID = 1;
        SpiceForm cinnamonWhole = new SpiceForm(formID++,1, "Whole", 0.1);
        SpiceForm cinnamonGround = new SpiceForm(formID++,1, "Ground", 0.8);
        SpiceForm cloveWhole = new SpiceForm(formID++, 2, "Whole", 0.2 );
        SpiceForm cloveGround = new SpiceForm(formID++, 2, "Ground", 0.6);
        SpiceForm garlicFresh = new SpiceForm(formID++, 3, "Fresh", 0.5);
        SpiceForm garlicChopped = new SpiceForm(formID++, 3, "Chopped", 0.5);
        SpiceForm garlicPowder = new SpiceForm(formID++, 3, "Powder", 0.7);

        LinkedList<SpiceForm> cinnamonForms = new LinkedList<SpiceForm>( );
        cinnamonForms.add(cinnamonWhole);
        cinnamonForms.add(cinnamonGround);
        formsForSpices.put(1,cinnamonForms);

        LinkedList<SpiceForm> cloveForms = new LinkedList<SpiceForm>( );
        cloveForms.add(cloveWhole);
        cloveForms.add(cloveGround);
        formsForSpices.put(2, cloveForms);

        LinkedList<SpiceForm> garlicForms = new LinkedList<SpiceForm>( );
        garlicForms.add(garlicChopped);
        garlicForms.add(garlicFresh);
        garlicForms.add(garlicPowder);
        formsForSpices.put(3, garlicForms);
    }


    @Override
    public int getNumSpices() {
        return spices.size();
    }



    @Override
    public Spice getSpiceForID(int spiceID) {
        return spices.get(spiceID);
    }

    @Override
    public LinkedList<Integer> getSpiceIDs() {
        LinkedList<Integer> spiceIDs = new LinkedList<Integer>( );
        spiceIDs.addAll(spices.keySet());

        return spiceIDs;
    }

    @Override
    public int getNumFormsForSpice(int spiceID) {
        int size = formsForSpices.get(spiceID).size();
        return size;
    }


}
