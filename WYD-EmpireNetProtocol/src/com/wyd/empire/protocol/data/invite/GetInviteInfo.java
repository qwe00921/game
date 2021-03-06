package com.wyd.empire.protocol.data.invite;

import com.wyd.empire.protocol.Protocol;
import com.wyd.protocol.data.AbstractData;
/**
 * 获取邀请码信息
 * @author zguoqiu
 */
public class GetInviteInfo extends AbstractData {
	public GetInviteInfo(int sessionId, int serial) {
		super(Protocol.MAIN_INVITE, Protocol.INVITE_GetInviteInfo, sessionId, serial);
	}

	public GetInviteInfo() {
		super(Protocol.MAIN_INVITE, Protocol.INVITE_GetInviteInfo);
	}
}
