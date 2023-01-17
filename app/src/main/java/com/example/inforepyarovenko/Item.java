package com.example.inforepyarovenko;

public class Item {
    private String login;


    public String getLogin() {
        return login;
    }

    private int id;
    private String avatarUrl;
    private String gravatarId;
    private String url;
    private String htmlUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String starredUrl;
    private String subscriptionsUrl;
    private String organizationsUrl;
    private String reposUrl;
    private String eventsUrl;
    private String receivedEventsUrl;
    private String type;
    private boolean siteAdmin;
    private float score;

    public void setLogin(String login){
        this.login = login;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public String getGravatarId() {
        return gravatarId;
    }
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getHtmlUrl() {
        return htmlUrl;
    }
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }
    public String getFollowersUrl() {
        return followersUrl;
    }
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }
    public String getFollowingUrl() {
        return followingUrl;
    }
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }
    public String getGistsUrl() {
        return gistsUrl;
    }
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }
    public String getStarredUrl() {
        return starredUrl;
    }
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }
    public String getReposUrl() {
        return reposUrl;
    }
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }
    public String getEventsUrl() {
        return eventsUrl;
    }
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Boolean isSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }
    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
}
