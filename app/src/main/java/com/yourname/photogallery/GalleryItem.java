package com.yourname.photogallery;

public class GalleryItem {
	private String mCaption;
	public String getCaption() {
		return mCaption;
	}
	public void setCaption(String caption) {
		mCaption = caption;
	}
	public String getId() {
		return mId;
	}
	public void setId(String id) {
		mId = id;
	}
	public String getUrl() {
		return mUrl;
	}
	public void setUrl(String url) {
		mUrl = url;
	}
	private String mId;
	private String mUrl;
	public String toString() {
		return mCaption;
	}

}
