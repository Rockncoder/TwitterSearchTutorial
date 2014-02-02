package com.example.TwitterSearchTutorial;

import com.google.gson.annotations.SerializedName;

public class Search {

	@SerializedName("created_at")
	private String DateCreated;

	@SerializedName("id")
	private long Id;

	@SerializedName("id_str")
	private String IdStr;

	@SerializedName("text")
	private String Text;

	@SerializedName("source")
	private String Source;

	@SerializedName("truncated")
	private Boolean IsTruncated;

	@SerializedName("in_reply_to_status_id")
	private long InReplyToStatusId;

	@SerializedName("in_reply_to_status_id_str")
	private String InReplyToStatusIdStr;

	@SerializedName("in_reply_to_user_id")
	private long InReplyToUserId;

	@SerializedName("in_reply_to_user_id_str")
	private String InReplyToUserIdStr;

	@SerializedName("in_reply_to_screen_name")
	private String InReplyToScreenName;

	@SerializedName("user")
	private TwitterUser User;

	public String getDateCreated() {
		return DateCreated;
	}

	public void setDateCreated(String dateCreated) {
		DateCreated = dateCreated;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getIdStr() {
		return IdStr;
	}

	public void setIdStr(String idStr) {
		IdStr = idStr;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public Boolean getIsTruncated() {
		return IsTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		IsTruncated = isTruncated;
	}

	public long getInReplyToStatusId() {
		return InReplyToStatusId;
	}

	public void setInReplyToStatusId(long inReplyToStatusId) {
		InReplyToStatusId = inReplyToStatusId;
	}

	public String getInReplyToStatusIdStr() {
		return InReplyToStatusIdStr;
	}

	public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
		InReplyToStatusIdStr = inReplyToStatusIdStr;
	}

	public long getInReplyToUserId() {
		return InReplyToUserId;
	}

	public void setInReplyToUserId(long inReplyToUserId) {
		InReplyToUserId = inReplyToUserId;
	}

	public String getInReplyToUserIdStr() {
		return InReplyToUserIdStr;
	}

	public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
		InReplyToUserIdStr = inReplyToUserIdStr;
	}

	public String getInReplyToScreenName() {
		return InReplyToScreenName;
	}

	public void setInReplyToScreenName(String inReplyToScreenName) {
		InReplyToScreenName = inReplyToScreenName;
	}

	public TwitterUser getUser() {
		return User;
	}

	public void setUser(TwitterUser user) {
		User = user;
	}

	@Override
	public String  toString(){
		return getText();
	}
}
