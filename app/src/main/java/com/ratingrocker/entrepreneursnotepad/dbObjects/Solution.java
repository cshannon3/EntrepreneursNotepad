package com.ratingrocker.entrepreneursnotepad.dbObjects;


public class Solution {

    private int problemid;
    private  String title;
    private  String body;
    private  String tags;
    private int importance;
    private  int urgency;
    private int difficulty;
    private String marketdescription;
    private String resources;
    private String resourcesneeded;
    private String ptsofweakness;
    private String revanuestream;
    private String createddate;
    private String lastupdated;


    public Solution(){

    }
    public Solution(int problemid, String title, String body, String tags, int importance, int urgency, int difficulty, String marketdescription, String resources, String resourcesneeded, String ptsofweakness, String revanuestream, String createddate, String lastupdated) {
        this.problemid = problemid;
        this.title = title;
        this.body = body;
        this.tags = tags;
        this.importance = importance;
        this.urgency = urgency;
        this.difficulty = difficulty;
        this.marketdescription = marketdescription;
        this.resources = resources;
        this.resourcesneeded = resourcesneeded;
        this.ptsofweakness = ptsofweakness;
        this.revanuestream = revanuestream;
        this.createddate = createddate;
        this.lastupdated = lastupdated;
    }

    public int getProblemid() {
        return problemid;
    }

    public void setProblemid(int problemid) {
        this.problemid = problemid;
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
    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getResourcesneeded() {
        return resourcesneeded;
    }

    public void setResourcesneeded(String resourcesneeded) {
        this.resourcesneeded = resourcesneeded;
    }
    public String getPtsofweakness() {
        return ptsofweakness;
    }

    public void setPtsofweakness(String ptsofweakness) {
        this.ptsofweakness = ptsofweakness;
    }

    public String getRevanuestream() {
        return revanuestream;
    }

    public void setRevanuestream(String revanuestream) {
        this.revanuestream = revanuestream;
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
