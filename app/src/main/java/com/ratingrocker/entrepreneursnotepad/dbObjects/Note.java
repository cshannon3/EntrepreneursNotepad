package com.ratingrocker.entrepreneursnotepad.dbObjects;


public class Note {
    private int category;
    private int parentid;
    private  String notetitle;
    private  String body;
    private  String tags;
    private int importance;
    private  int urgency;
    private String createddate;
    private String lastupdated;
    public Note(){

    }

    public Note(int category, int parentid, String notetitle, String body, String tags, int importance, int urgency) {
        this.category = category;
        this.parentid = parentid;
        this.notetitle = notetitle;
        this.body = body;
        this.tags = tags;
        this.importance = importance;
        this.urgency = urgency;
        this.createddate = createddate;
        this.lastupdated = lastupdated;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getNotetitle() {
        return notetitle;
    }

    public void setNotetitle(String notetitle) {
        this.notetitle = notetitle;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }
}
