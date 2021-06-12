package ru.netology.domain;

public class RepostInfo {
    private int count;
    private boolean userReposted;
    private boolean toRepost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
    public boolean isToRepost() {
        return toRepost;
    }

    public void setToRepost(boolean toRepost) {
        this.toRepost = toRepost;
    }
}
