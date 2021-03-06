package com.wyd.empire.protocol.data.cross;
import com.wyd.empire.protocol.Protocol;
import com.wyd.empire.protocol.cross.CrossDate;
public class CrossOtherShoot extends CrossDate {
    private int   roomId;
    private int   battleId;
    private int   currentPlayerId;
    private int   speedx;
    private int   speedy;
    private byte  leftRight;
    private int   startx;
    private int   starty;
    private int   playerCount;
    private int[] playerIds;
    private int[] curPositionX;
    private int[] curPositionY;

    public CrossOtherShoot() {
        super(Protocol.MAIN_CROSS, Protocol.CROSS_CrossOtherShoot);
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getBattleId() {
        return battleId;
    }

    public void setBattleId(int battleId) {
        this.battleId = battleId;
    }

    public int getCurrentPlayerId() {
        return currentPlayerId;
    }

    public void setCurrentPlayerId(int currentPlayerId) {
        this.currentPlayerId = currentPlayerId;
    }

    public int getSpeedx() {
        return speedx;
    }

    public void setSpeedx(int speedx) {
        this.speedx = speedx;
    }

    public int getSpeedy() {
        return speedy;
    }

    public void setSpeedy(int speedy) {
        this.speedy = speedy;
    }

    public byte getLeftRight() {
        return leftRight;
    }

    public void setLeftRight(byte leftRight) {
        this.leftRight = leftRight;
    }

    public int getStartx() {
        return startx;
    }

    public void setStartx(int startx) {
        this.startx = startx;
    }

    public int getStarty() {
        return starty;
    }

    public void setStarty(int starty) {
        this.starty = starty;
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    public int[] getPlayerIds() {
        return playerIds;
    }

    public void setPlayerIds(int[] playerIds) {
        this.playerIds = playerIds;
    }

    public int[] getCurPositionX() {
        return curPositionX;
    }

    public void setCurPositionX(int[] curPositionX) {
        this.curPositionX = curPositionX;
    }

    public int[] getCurPositionY() {
        return curPositionY;
    }

    public void setCurPositionY(int[] curPositionY) {
        this.curPositionY = curPositionY;
    }
}
