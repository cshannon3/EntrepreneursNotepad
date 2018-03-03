package com.ratingrocker.entrepreneursnotepad.dbObjects;


public class Problem {

    private  String title;
    private  String body;
    private  String tags;
    private int importance;
    private  int urgency;
    private int difficulty;
    private String marketdescription;
    private String SolnPrevFacs;
    private String ideakeys;
    private String createddate;
    private String lastupdated;


    public Problem(){

    }

    public Problem(String title, String body, String tags, int importance, int urgency, int difficulty, String marketdescription, String solnPrevFacs, String ideakeys, String createddate, String lastupdated) {
        this.title = title;
        this.body = body;
        this.tags = tags;
        this.importance = importance;
        this.urgency = urgency;
        this.difficulty = difficulty;
        this.marketdescription = marketdescription;
        this.SolnPrevFacs = solnPrevFacs;
        this.ideakeys = ideakeys;
        this.createddate = createddate;
        this.lastupdated = lastupdated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getMarketdescription() {
        return marketdescription;
    }

    public void setMarketdescription(String marketdescription) {
        this.marketdescription = marketdescription;
    }

    public String getSolnPrevFacs() {
        return SolnPrevFacs;
    }

    public void setSolnPrevFacs(String solnPrevFacs) {
        SolnPrevFacs = solnPrevFacs;
    }

    public String getIdeakeys() {
        return ideakeys;
    }

    public void setIdeakeys(String ideakeys) {
        this.ideakeys = ideakeys;
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
