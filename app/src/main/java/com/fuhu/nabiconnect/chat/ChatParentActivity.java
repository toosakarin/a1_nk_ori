package com.fuhu.nabiconnect.chat;

import com.fuhu.nabiconnect.ParentActivityLauncher;
import com.fuhu.nabiconnect.event.ApiBaseActivity;

public class ChatParentActivity extends ParentActivityLauncher{

    public ChatParentActivity() {
        super(ChatActivity.class.getSimpleName());
    }

    @Override
	public String getTargetActivityIntent() {
		return ApiBaseActivity.INTENT_CHAT_ACTIVITY;
	}

}
