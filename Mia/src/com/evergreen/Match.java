package com.evergreen;

public class Match {
    private boolean initiationLine;
    private boolean rotationControl;
    private boolean positionControl;
    private boolean climbing;
    private boolean allianceLevelClimbing;
    private boolean parking;
    int[]seif = new int [3];

    public Match(){}


    public void  setInitiationLine(boolean pass){
        initiationLine=pass;
    }

    public  void  setRotationControl(boolean rotated){
        rotationControl=rotated;
    }

    public void setPositionControl(boolean suceed){
        positionControl=suceed;
    }

    public void setClimbing(boolean climbed){
        climbing=climbed;
    }

    public void setAllianceLevelClimbing(boolean levelClimbed){
        allianceLevelClimbing=levelClimbed;
    }

    public void SetParking(boolean parked){
        parking=parked;
    }

    public boolean setPowerCells(int gamePart, int target,int powerCells, int [] seif){

            seif[0]=gamePart;
            seif[1]=target;
            seif[2]=powerCells;

    }

    public int getPowerCells(int gamePart, int target){
        return seif[2];

    }








}
