package com.example.TwitterSearchTutorial;

import com.google.gson.annotations.SerializedName;

// search metadata
public class SearchMetadata {

	@SerializedName("completed_in")
	private Float CompletedIn;

	@SerializedName("max_id")
	private long MaxId;

	@SerializedName("max_id_str")
	private String MaxIdStr;

	@SerializedName("next_results")
	private String NextResults;

	@SerializedName("query")
	private String Query;

	@SerializedName("refresh_url")
	private String RefreshUrl;

	@SerializedName("count")
	private long Count;

	@SerializedName("since_id")
	private long SinceId;

	@SerializedName("since_id_str")
	private String SinceIdStr;

	public Float getCompletedIn() {
		return CompletedIn;
	}

	public void setCompletedIn(Float completedIn) {
		CompletedIn = completedIn;
	}

	public long getMaxId() {
		return MaxId;
	}

	public void setMaxId(long maxId) {
		MaxId = maxId;
	}

	public String getMaxIdStr() {
		return MaxIdStr;
	}

	public void setMaxIdStr(String maxIdStr) {
		MaxIdStr = maxIdStr;
	}

	public String getNextResults() {
		return NextResults;
	}

	public void setNextResults(String nextResults) {
		NextResults = nextResults;
	}

	public String getQuery() {
		return Query;
	}

	public void setQuery(String query) {
		Query = query;
	}

	public String getRefreshUrl() {
		return RefreshUrl;
	}

	public void setRefreshUrl(String refreshUrl) {
		RefreshUrl = refreshUrl;
	}

	public long getCount() {
		return Count;
	}

	public void setCount(long count) {
		Count = count;
	}

	public long getSinceId() {
		return SinceId;
	}

	public void setSinceId(long sinceId) {
		SinceId = sinceId;
	}

	public String getSinceIdStr() {
		return SinceIdStr;
	}

	public void setSinceIdStr(String sinceIdStr) {
		SinceIdStr = sinceIdStr;
	}
}
