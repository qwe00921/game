package com.wyd.empire.protocol.data.server;
import com.wyd.protocol.data.AbstractData;
import com.wyd.empire.protocol.Protocol;
public class ChangeStatus extends AbstractData {
    private String accountName;
    private int    status;
    private String comment;

    public ChangeStatus(int sessionId, int serial) {
        super(Protocol.MAIN_SERVER, Protocol.SERVER_ChangeStatus, sessionId, serial);
    }

    public ChangeStatus() {
        super(Protocol.MAIN_SERVER, Protocol.SERVER_ChangeStatus);
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }
}
